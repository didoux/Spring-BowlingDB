package bowling.dao;

import bowling.domain.Game;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Game entities.
 * 
 */
public interface GameDAO extends JpaDao<Game> {

	/**
	 * JPQL Query - findGameByStartingLaneNbr
	 *
	 */
	public Set<Game> findGameByStartingLaneNbr(Integer startingLaneNbr) throws DataAccessException;

	/**
	 * JPQL Query - findGameByStartingLaneNbr
	 *
	 */
	public Set<Game> findGameByStartingLaneNbr(Integer startingLaneNbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameByNbr
	 *
	 */
	public Set<Game> findGameByNbr(Integer nbr) throws DataAccessException;

	/**
	 * JPQL Query - findGameByNbr
	 *
	 */
	public Set<Game> findGameByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameByPrimaryKey
	 *
	 */
	public Game findGameByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findGameByPrimaryKey
	 *
	 */
	public Game findGameByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameByWeekId
	 *
	 */
	public Set<Game> findGameByWeekId(Integer weekId) throws DataAccessException;

	/**
	 * JPQL Query - findGameByWeekId
	 *
	 */
	public Set<Game> findGameByWeekId(Integer weekId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameById
	 *
	 */
	public Game findGameById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findGameById
	 *
	 */
	public Game findGameById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameByScore
	 *
	 */
	public Set<Game> findGameByScore(Integer score) throws DataAccessException;

	/**
	 * JPQL Query - findGameByScore
	 *
	 */
	public Set<Game> findGameByScore(Integer score, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllGames
	 *
	 */
	public Set<Game> findAllGames() throws DataAccessException;

	/**
	 * JPQL Query - findAllGames
	 *
	 */
	public Set<Game> findAllGames(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findGameByPlayerId
	 *
	 */
	public Set<Game> findGameByPlayerId(Integer playerId) throws DataAccessException;

	/**
	 * JPQL Query - findGameByPlayerId
	 *
	 */
	public Set<Game> findGameByPlayerId(Integer playerId, int startResult, int maxRows) throws DataAccessException;

}