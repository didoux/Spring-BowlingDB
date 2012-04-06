package bowling.dao;

import bowling.domain.Week;

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
 * DAO to manage Week entities.
 * 
 */
@Repository("WeekDAO")
@Transactional
public class WeekDAOImpl extends AbstractJpaDao<Week> implements WeekDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Week.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new WeekDAOImpl
	 *
	 */
	public WeekDAOImpl() {
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
	 * JPQL Query - findWeekByTeamId
	 *
	 */
	@Transactional
	public Set<Week> findWeekByTeamId(Integer teamId) throws DataAccessException {

		return findWeekByTeamId(teamId, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByTeamId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findWeekByTeamId(Integer teamId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findWeekByTeamId", startResult, maxRows, teamId);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * JPQL Query - findWeekByPrimaryKey
	 *
	 */
	@Transactional
	public Week findWeekByPrimaryKey(Integer id) throws DataAccessException {

		return findWeekByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByPrimaryKey
	 *
	 */

	@Transactional
	public Week findWeekByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findWeekByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Week) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findWeekByDateBefore
	 *
	 */
	@Transactional
	public Set<Week> findWeekByDateBefore(java.util.Calendar date) throws DataAccessException {

		return findWeekByDateBefore(date, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByDateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findWeekByDateBefore(java.util.Calendar date, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findWeekByDateBefore", startResult, maxRows, date);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllWeeks
	 *
	 */
	@Transactional
	public Set<Week> findAllWeeks() throws DataAccessException {

		return findAllWeeks(-1, -1);
	}

	/**
	 * JPQL Query - findAllWeeks
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findAllWeeks(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllWeeks", startResult, maxRows);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * JPQL Query - findWeekById
	 *
	 */
	@Transactional
	public Week findWeekById(Integer id) throws DataAccessException {

		return findWeekById(id, -1, -1);
	}

	/**
	 * JPQL Query - findWeekById
	 *
	 */

	@Transactional
	public Week findWeekById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findWeekById", startResult, maxRows, id);
			return (bowling.domain.Week) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findWeekByDateAfter
	 *
	 */
	@Transactional
	public Set<Week> findWeekByDateAfter(java.util.Calendar date) throws DataAccessException {

		return findWeekByDateAfter(date, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByDateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findWeekByDateAfter(java.util.Calendar date, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findWeekByDateAfter", startResult, maxRows, date);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * JPQL Query - findWeekByDate
	 *
	 */
	@Transactional
	public Set<Week> findWeekByDate(java.util.Calendar date) throws DataAccessException {

		return findWeekByDate(date, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByDate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findWeekByDate(java.util.Calendar date, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findWeekByDate", startResult, maxRows, date);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * JPQL Query - findWeekByWeekNumber
	 *
	 */
	@Transactional
	public Set<Week> findWeekByWeekNumber(Integer weekNumber) throws DataAccessException {

		return findWeekByWeekNumber(weekNumber, -1, -1);
	}

	/**
	 * JPQL Query - findWeekByWeekNumber
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Week> findWeekByWeekNumber(Integer weekNumber, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findWeekByWeekNumber", startResult, maxRows, weekNumber);
		return new LinkedHashSet<Week>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Week entity) {
		return true;
	}
}
