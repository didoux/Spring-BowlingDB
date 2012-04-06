package bowling.dao;

import bowling.domain.Frame;

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
 * DAO to manage Frame entities.
 * 
 */
@Repository("FrameDAO")
@Transactional
public class FrameDAOImpl extends AbstractJpaDao<Frame> implements FrameDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Frame.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new FrameDAOImpl
	 *
	 */
	public FrameDAOImpl() {
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
	 * JPQL Query - findFrameByGameId
	 *
	 */
	@Transactional
	public Set<Frame> findFrameByGameId(Integer gameId) throws DataAccessException {

		return findFrameByGameId(gameId, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByGameId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findFrameByGameId(Integer gameId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findFrameByGameId", startResult, maxRows, gameId);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllFrames
	 *
	 */
	@Transactional
	public Set<Frame> findAllFrames() throws DataAccessException {

		return findAllFrames(-1, -1);
	}

	/**
	 * JPQL Query - findAllFrames
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findAllFrames(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllFrames", startResult, maxRows);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findFrameByNbr
	 *
	 */
	@Transactional
	public Set<Frame> findFrameByNbr(Integer nbr) throws DataAccessException {

		return findFrameByNbr(nbr, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findFrameByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findFrameByNbr", startResult, maxRows, nbr);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findFrameByLaneNbr
	 *
	 */
	@Transactional
	public Set<Frame> findFrameByLaneNbr(Integer laneNbr) throws DataAccessException {

		return findFrameByLaneNbr(laneNbr, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByLaneNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findFrameByLaneNbr(Integer laneNbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findFrameByLaneNbr", startResult, maxRows, laneNbr);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findFrameByNotes
	 *
	 */
	@Transactional
	public Set<Frame> findFrameByNotes(String notes) throws DataAccessException {

		return findFrameByNotes(notes, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByNotes
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findFrameByNotes(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findFrameByNotes", startResult, maxRows, notes);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findFrameById
	 *
	 */
	@Transactional
	public Frame findFrameById(Integer id) throws DataAccessException {

		return findFrameById(id, -1, -1);
	}

	/**
	 * JPQL Query - findFrameById
	 *
	 */

	@Transactional
	public Frame findFrameById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findFrameById", startResult, maxRows, id);
			return (bowling.domain.Frame) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findFrameByNotesContaining
	 *
	 */
	@Transactional
	public Set<Frame> findFrameByNotesContaining(String notes) throws DataAccessException {

		return findFrameByNotesContaining(notes, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByNotesContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Frame> findFrameByNotesContaining(String notes, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findFrameByNotesContaining", startResult, maxRows, notes);
		return new LinkedHashSet<Frame>(query.getResultList());
	}

	/**
	 * JPQL Query - findFrameByPrimaryKey
	 *
	 */
	@Transactional
	public Frame findFrameByPrimaryKey(Integer id) throws DataAccessException {

		return findFrameByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findFrameByPrimaryKey
	 *
	 */

	@Transactional
	public Frame findFrameByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findFrameByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Frame) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Frame entity) {
		return true;
	}
}
