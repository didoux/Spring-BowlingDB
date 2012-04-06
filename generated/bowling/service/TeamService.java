package bowling.service;

import bowling.domain.Team;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Team entities
 * 
 */
public interface TeamService {

	/**
	 * Save an existing Team entity
	 * 
	 */
	public void saveTeam(Team team);

	/**
	 * Delete an existing Team entity
	 * 
	 */
	public void deleteTeam(Team team_1);

	/**
	 * Return a count of all Team entity
	 * 
	 */
	public Integer countTeams();

	/**
	 * Return all Team entity
	 * 
	 */
	public List<Team> findAllTeams(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Team entity
	 * 
	 */
	public Set<Team> loadTeams();

	/**
	 */
	public Team findTeamByPrimaryKey(Integer id);
}