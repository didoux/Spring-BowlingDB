package bowling.dao;

import bowling.domain.League;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage League entities.
 * 
 */
public interface LeagueDAO extends JpaDao<League> {

	/**
	 * JPQL Query - findLeagueByName
	 *
	 */
	public Set<League> findLeagueByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByName
	 *
	 */
	public Set<League> findLeagueByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllLeagues
	 *
	 */
	public Set<League> findAllLeagues() throws DataAccessException;

	/**
	 * JPQL Query - findAllLeagues
	 *
	 */
	public Set<League> findAllLeagues(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByNameContaining
	 *
	 */
	public Set<League> findLeagueByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByNameContaining
	 *
	 */
	public Set<League> findLeagueByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByPrimaryKey
	 *
	 */
	public League findLeagueByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByPrimaryKey
	 *
	 */
	public League findLeagueByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueById
	 *
	 */
	public League findLeagueById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueById
	 *
	 */
	public League findLeagueById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByStartDt
	 *
	 */
	public Set<League> findLeagueByStartDt(java.util.Calendar startDt) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByStartDt
	 *
	 */
	public Set<League> findLeagueByStartDt(Calendar startDt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByExternalId
	 *
	 */
	public Set<League> findLeagueByExternalId(Integer externalId) throws DataAccessException;

	/**
	 * JPQL Query - findLeagueByExternalId
	 *
	 */
	public Set<League> findLeagueByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException;

}