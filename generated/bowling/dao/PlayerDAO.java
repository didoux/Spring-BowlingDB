package bowling.dao;

import bowling.domain.Player;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Player entities.
 * 
 */
public interface PlayerDAO extends JpaDao<Player> {

	/**
	 * JPQL Query - findPlayerByTeamId
	 *
	 */
	public Set<Player> findPlayerByTeamId(Integer teamId) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByTeamId
	 *
	 */
	public Set<Player> findPlayerByTeamId(Integer teamId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllPlayers
	 *
	 */
	public Set<Player> findAllPlayers() throws DataAccessException;

	/**
	 * JPQL Query - findAllPlayers
	 *
	 */
	public Set<Player> findAllPlayers(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByPrimaryKey
	 *
	 */
	public Player findPlayerByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByPrimaryKey
	 *
	 */
	public Player findPlayerByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerById
	 *
	 */
	public Player findPlayerById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerById
	 *
	 */
	public Player findPlayerById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByExternalId
	 *
	 */
	public Set<Player> findPlayerByExternalId(Integer externalId) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByExternalId
	 *
	 */
	public Set<Player> findPlayerByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByNameContaining
	 *
	 */
	public Set<Player> findPlayerByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByNameContaining
	 *
	 */
	public Set<Player> findPlayerByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByName
	 *
	 */
	public Set<Player> findPlayerByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findPlayerByName
	 *
	 */
	public Set<Player> findPlayerByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}