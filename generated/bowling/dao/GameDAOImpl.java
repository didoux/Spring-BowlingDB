package bowling.dao;

import bowling.domain.Game;

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
 * DAO to manage Game entities.
 * 
 */
@Repository("GameDAO")
@Transactional
public class GameDAOImpl extends AbstractJpaDao<Game> implements GameDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Game.class }));

	/**
	 * EntityManager injected by Spring for persistence unit bowling
	 *
	 */
	@PersistenceContext(unitName = "bowling")
	private EntityManager entityManager;

	/**
	 * Instantiates a new GameDAOImpl
	 *
	 */
	public GameDAOImpl() {
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
	 * JPQL Query - findGameByStartingLaneNbr
	 *
	 */
	@Transactional
	public Set<Game> findGameByStartingLaneNbr(Integer startingLaneNbr) throws DataAccessException {

		return findGameByStartingLaneNbr(startingLaneNbr, -1, -1);
	}

	/**
	 * JPQL Query - findGameByStartingLaneNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findGameByStartingLaneNbr(Integer startingLaneNbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGameByStartingLaneNbr", startResult, maxRows, startingLaneNbr);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * JPQL Query - findGameByNbr
	 *
	 */
	@Transactional
	public Set<Game> findGameByNbr(Integer nbr) throws DataAccessException {

		return findGameByNbr(nbr, -1, -1);
	}

	/**
	 * JPQL Query - findGameByNbr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findGameByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGameByNbr", startResult, maxRows, nbr);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * JPQL Query - findGameByPrimaryKey
	 *
	 */
	@Transactional
	public Game findGameByPrimaryKey(Integer id) throws DataAccessException {

		return findGameByPrimaryKey(id, -1, -1);
	}

	/**
	 * JPQL Query - findGameByPrimaryKey
	 *
	 */

	@Transactional
	public Game findGameByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGameByPrimaryKey", startResult, maxRows, id);
			return (bowling.domain.Game) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGameByWeekId
	 *
	 */
	@Transactional
	public Set<Game> findGameByWeekId(Integer weekId) throws DataAccessException {

		return findGameByWeekId(weekId, -1, -1);
	}

	/**
	 * JPQL Query - findGameByWeekId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findGameByWeekId(Integer weekId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGameByWeekId", startResult, maxRows, weekId);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * JPQL Query - findGameById
	 *
	 */
	@Transactional
	public Game findGameById(Integer id) throws DataAccessException {

		return findGameById(id, -1, -1);
	}

	/**
	 * JPQL Query - findGameById
	 *
	 */

	@Transactional
	public Game findGameById(Integer id, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findGameById", startResult, maxRows, id);
			return (bowling.domain.Game) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findGameByScore
	 *
	 */
	@Transactional
	public Set<Game> findGameByScore(Integer score) throws DataAccessException {

		return findGameByScore(score, -1, -1);
	}

	/**
	 * JPQL Query - findGameByScore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findGameByScore(Integer score, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGameByScore", startResult, maxRows, score);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllGames
	 *
	 */
	@Transactional
	public Set<Game> findAllGames() throws DataAccessException {

		return findAllGames(-1, -1);
	}

	/**
	 * JPQL Query - findAllGames
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findAllGames(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllGames", startResult, maxRows);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * JPQL Query - findGameByPlayerId
	 *
	 */
	@Transactional
	public Set<Game> findGameByPlayerId(Integer playerId) throws DataAccessException {

		return findGameByPlayerId(playerId, -1, -1);
	}

	/**
	 * JPQL Query - findGameByPlayerId
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Game> findGameByPlayerId(Integer playerId, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findGameByPlayerId", startResult, maxRows, playerId);
		return new LinkedHashSet<Game>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Game entity) {
		return true;
	}
}
