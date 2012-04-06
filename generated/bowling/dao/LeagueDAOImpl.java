package bowling.dao;

import bowling.domain.League;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage League entities.
 * 
 */
@Repository("LeagueDAO")
@Transactional
public class LeagueDAOImpl extends AbstractJpaDao<League> implements LeagueDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { League.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new LeagueDAOImpl
	 *
	 */
	public LeagueDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findLeagueByName
	 *
	 */
	@Transactional
	public Set<League> findLeagueByName(String name) throws DataAccessException {

		return findLeagueByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<League> findLeagueByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLeagueByName", startResult, maxRows, name);
		return new LinkedHashSet<League>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllLeagues
	 *
	 */
	@Transactional
	public Set<League> findAllLeagues() throws DataAccessException {

		return findAllLeagues(-1, -1);
	}

	/**
	 * JPQL Query - findAllLeagues
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<League> findAllLeagues(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllLeagues", startResult, maxRows);
		return new LinkedHashSet<League>(query.getResultList());
	}

	/**
	 * JPQL Query - findLeagueByNameContaining
	 *
	 */
	@Transactional
	public Set<League> findLeagueByNameContaining(String name) throws DataAccessException {

		return findLeagueByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<League> findLeagueByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLeagueByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<League>(query.getResultList());
	}

	/**
	 * JPQL Query - findLeagueByPrimaryKey
	 *
	 */
	@Transactional
	public League findLeagueByPrimaryKey(Integer id) throws DataAccessException {

		return findLeagueByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueByPrimaryKey
	 *
	 */

	@Transactional
	public League findLeagueByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLeagueByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.League) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findLeagueById
	 *
	 */
	@Transactional
	public League findLeagueById(Integer id) throws DataAccessException {

		return findLeagueById(id, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueById
	 *
	 */

	@Transactional
	public League findLeagueById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findLeagueById", startResult, maxRows, id);
			return (bowling.domain.League) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findLeagueByStartDt
	 *
	 */
	@Transactional
	public Set<League> findLeagueByStartDt(java.util.Calendar startDt) throws DataAccessException {

		return findLeagueByStartDt(startDt, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueByStartDt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<League> findLeagueByStartDt(java.util.Calendar startDt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLeagueByStartDt", startResult, maxRows, startDt);
		return new LinkedHashSet<League>(query.getResultList());
	}

	/**
	 * JPQL Query - findLeagueByExternalId
	 *
	 */
	@Transactional
	public Set<League> findLeagueByExternalId(Integer externalId) throws DataAccessException {

		return findLeagueByExternalId(externalId, -1, -1);
	}

	/**
	 * JPQL Query - findLeagueByExternalId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<League> findLeagueByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findLeagueByExternalId", startResult, maxRows, externalId);
		return new LinkedHashSet<League>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(League entity) {
		return true;
	}
}
