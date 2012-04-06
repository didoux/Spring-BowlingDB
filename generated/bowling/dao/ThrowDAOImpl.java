package bowling.dao;

import bowling.domain.Throw;

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
 * DAO to manage Throw entities.
 * 
 */
@Repository("ThrowDAO")
@Transactional
public class ThrowDAOImpl extends AbstractJpaDao<Throw> implements ThrowDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Throw.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ThrowDAOImpl
	 *
	 */
	public ThrowDAOImpl() {
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
	 * JPQL Query - findThrowByFrameId
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByFrameId(Integer frameId) throws DataAccessException {

		return findThrowByFrameId(frameId, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByFrameId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByFrameId(Integer frameId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByFrameId", startResult, maxRows, frameId);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowByPosition
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByPosition(Integer position) throws DataAccessException {

		return findThrowByPosition(position, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByPosition
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByPosition(Integer position, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByPosition", startResult, maxRows, position);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowBy8pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy8pin(Boolean _pin) throws DataAccessException {

		return findThrowBy8pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy8pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy8pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy8pin", startResult, maxRows
									, 8pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowByPinBinaryArray
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByPinBinaryArray(Integer pinBinaryArray) throws DataAccessException {

		return findThrowByPinBinaryArray(pinBinaryArray, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByPinBinaryArray
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByPinBinaryArray(Integer pinBinaryArray, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByPinBinaryArray", startResult, maxRows, pinBinaryArray);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowByBallNameTxtContaining
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByBallNameTxtContaining(String ballNameTxt) throws DataAccessException {

		return findThrowByBallNameTxtContaining(ballNameTxt, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByBallNameTxtContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByBallNameTxtContaining(String ballNameTxt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByBallNameTxtContaining", startResult, maxRows, ballNameTxt);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowBy6pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy6pin(Boolean _pin) throws DataAccessException {

		return findThrowBy6pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy6pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy6pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy6pin", startResult, maxRows
									, 6pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowBy3pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy3pin(Boolean _pin) throws DataAccessException {

		return findThrowBy3pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy3pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy3pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy3pin", startResult, maxRows
									, 3pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowBy4pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy4pin(Boolean _pin) throws DataAccessException {

		return findThrowBy4pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy4pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy4pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy4pin", startResult, maxRows
									, 4pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowByNoteTxt
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByNoteTxt(String noteTxt) throws DataAccessException {

		return findThrowByNoteTxt(noteTxt, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByNoteTxt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByNoteTxt(String noteTxt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByNoteTxt", startResult, maxRows, noteTxt);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllThrows
	 *
	 */
	@Transactional
	public Set<Throw> findAllThrows() throws DataAccessException {

		return findAllThrows(-1, -1);
	}

	/**
	 * JPQL Query - findAllThrows
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findAllThrows(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllThrows", startResult, maxRows);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowByBallNameTxt
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByBallNameTxt(String ballNameTxt) throws DataAccessException {

		return findThrowByBallNameTxt(ballNameTxt, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByBallNameTxt
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByBallNameTxt(String ballNameTxt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByBallNameTxt", startResult, maxRows, ballNameTxt);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowByNoteTxtContaining
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByNoteTxtContaining(String noteTxt) throws DataAccessException {

		return findThrowByNoteTxtContaining(noteTxt, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByNoteTxtContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByNoteTxtContaining(String noteTxt, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByNoteTxtContaining", startResult, maxRows, noteTxt);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowBy2pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy2pin(Boolean _pin) throws DataAccessException {

		return findThrowBy2pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy2pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy2pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy2pin", startResult, maxRows
									, 2pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowByPrimaryKey
	 *
	 */
	@Transactional
	public Throw findThrowByPrimaryKey(Integer id) throws DataAccessException {

		return findThrowByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByPrimaryKey
	 *
	 */

	@Transactional
	public Throw findThrowByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findThrowByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Throw) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findThrowBy10pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy10pin(Boolean _0pin) throws DataAccessException {

		return findThrowBy10pin(_0pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy10pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy10pin(Boolean _0pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy10pin", startResult, maxRows
									, 10pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowByNbrOfPinsDown
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByNbrOfPinsDown(Integer nbrOfPinsDown) throws DataAccessException {

		return findThrowByNbrOfPinsDown(nbrOfPinsDown, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByNbrOfPinsDown
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByNbrOfPinsDown(Integer nbrOfPinsDown, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByNbrOfPinsDown", startResult, maxRows, nbrOfPinsDown);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowBy9pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy9pin(Boolean _pin) throws DataAccessException {

		return findThrowBy9pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy9pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy9pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy9pin", startResult, maxRows
									, 9pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowById
	 *
	 */
	@Transactional
	public Throw findThrowById(Integer id) throws DataAccessException {

		return findThrowById(id, -1, -1);
	}

	/**
	 * JPQL Query - findThrowById
	 *
	 */

	@Transactional
	public Throw findThrowById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findThrowById", startResult, maxRows, id);
			return (bowling.domain.Throw) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findThrowByTarget
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByTarget(Integer target) throws DataAccessException {

		return findThrowByTarget(target, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByTarget
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByTarget(Integer target, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByTarget", startResult, maxRows, target);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * JPQL Query - findThrowBy5pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy5pin(Boolean _pin) throws DataAccessException {

		return findThrowBy5pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy5pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy5pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy5pin", startResult, maxRows
									, 5pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowBy7pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy7pin(Boolean _pin) throws DataAccessException {

		return findThrowBy7pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy7pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy7pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy7pin", startResult, maxRows
									, 7pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowBy1pin
	 *
	 */
	@Transactional
	public Set<Throw> findThrowBy1pin(Boolean _pin) throws DataAccessException {

		return findThrowBy1pin(_pin, -1, -1);
	}

	/**
	 * JPQL Query - findThrowBy1pin
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional 
public Set<Throw> findThrowBy1pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException{
						Query query  = createNamedQuery ("findThrowBy1pin", startResult, maxRows
									, 1pin
							);
						return new LinkedHashSet<Throw>(query.getResultList());
}	/**
	 * JPQL Query - findThrowByNbr
	 *
	 */
	@Transactional
	public Set<Throw> findThrowByNbr(Integer nbr) throws DataAccessException {

		return findThrowByNbr(nbr, -1, -1);
	}

	/**
	 * JPQL Query - findThrowByNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Throw> findThrowByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findThrowByNbr", startResult, maxRows, nbr);
		return new LinkedHashSet<Throw>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Throw entity) {
		return true;
	}
}
