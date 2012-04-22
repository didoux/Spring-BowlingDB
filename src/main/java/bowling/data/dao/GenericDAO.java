package bowling.data.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: didoux@gmail.com
 * Date: 4/22/12
 * Time: 2:46 PM
 */
public abstract class GenericDAO<K,E>  {
    private Class<E> entityClass;
    protected EntityManager entityManager;

    public GenericDAO() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[0];
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public E store(E entity) {
        entityManager.persist(entity);
        return entity;
    }

    public void remove(E entity) {
        entityManager.remove(entity);
    }

    public E findById(K key) {
        return entityManager.find(entityClass,key);
    }
}

