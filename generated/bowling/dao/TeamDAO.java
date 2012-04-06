package bowling.dao;

import bowling.domain.Team;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Team entities.
 * 
 */
public interface TeamDAO extends JpaDao<Team> {

	/**
	 * JPQL Query - findTeamByTeamNbr
	 *
	 */
	public Set<Team> findTeamByTeamNbr(String teamNbr) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByTeamNbr
	 *
	 */
	public Set<Team> findTeamByTeamNbr(String teamNbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByTeamNbrContaining
	 *
	 */
	public Set<Team> findTeamByTeamNbrContaining(String teamNbr_1) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByTeamNbrContaining
	 *
	 */
	public Set<Team> findTeamByTeamNbrContaining(String teamNbr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByLeagueId
	 *
	 */
	public Set<Team> findTeamByLeagueId(Integer leagueId) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByLeagueId
	 *
	 */
	public Set<Team> findTeamByLeagueId(Integer leagueId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByExternalId
	 *
	 */
	public Set<Team> findTeamByExternalId(Integer externalId) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByExternalId
	 *
	 */
	public Set<Team> findTeamByExternalId(Integer externalId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByNameContaining
	 *
	 */
	public Set<Team> findTeamByNameContaining(String name) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByNameContaining
	 *
	 */
	public Set<Team> findTeamByNameContaining(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamById
	 *
	 */
	public Team findTeamById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findTeamById
	 *
	 */
	public Team findTeamById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllTeams
	 *
	 */
	public Set<Team> findAllTeams() throws DataAccessException;

	/**
	 * JPQL Query - findAllTeams
	 *
	 */
	public Set<Team> findAllTeams(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByPrimaryKey
	 *
	 */
	public Team findTeamByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByPrimaryKey
	 *
	 */
	public Team findTeamByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByName
	 *
	 */
	public Set<Team> findTeamByName(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findTeamByName
	 *
	 */
	public Set<Team> findTeamByName(String name_1, int startResult, int maxRows) throws DataAccessException;

}