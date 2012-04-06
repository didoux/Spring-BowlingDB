package bowling.service;

import bowling.domain.League;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for League entities
 * 
 */
public interface LeagueService {

	/**
	 * Return all League entity
	 * 
	 */
	public List<League> findAllLeagues(Integer startResult, Integer maxRows);

	/**
	 * Return a count of all League entity
	 * 
	 */
	public Integer countLeagues();

	/**
	 */
	public League findLeagueByPrimaryKey(Integer id);

	/**
	 * Delete an existing League entity
	 * 
	 */
	public void deleteLeague(League league);

	/**
	 * Save an existing League entity
	 * 
	 */
	public void saveLeague(League league_1);

	/**
	 * Load an existing League entity
	 * 
	 */
	public Set<League> loadLeagues();
}