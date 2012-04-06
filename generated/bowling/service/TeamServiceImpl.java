package bowling.service;

import bowling.dao.TeamDAO;

import bowling.domain.Team;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Team entities
 * 
 */

@Service("TeamService")
@Transactional
public class TeamServiceImpl implements TeamService {

	/**
	 * DAO injected by Spring that manages Team entities
	 * 
	 */
	@Autowired
	private TeamDAO teamDAO;

	/**
	 * Instantiates a new TeamServiceImpl.
	 *
	 */
	public TeamServiceImpl() {
	}

	/**
	 * Save an existing Team entity
	 * 
	 */
	@Transactional
	public void saveTeam(Team team) {
		Team existingTeam = teamDAO.findTeamByPrimaryKey(team.getId());

		if (existingTeam != null) {
			if (existingTeam != team) {
				existingTeam.setId(team.getId());
				existingTeam.setLeagueId(team.getLeagueId());
				existingTeam.setName(team.getName());
				existingTeam.setTeamNbr(team.getTeamNbr());
				existingTeam.setExternalId(team.getExternalId());
			}
			team = teamDAO.store(existingTeam);
		} else {
			team = teamDAO.store(team);
		}
		teamDAO.flush();
	}

	/**
	 * Delete an existing Team entity
	 * 
	 */
	@Transactional
	public void deleteTeam(Team team) {
		teamDAO.remove(team);
		teamDAO.flush();
	}

	/**
	 * Return a count of all Team entity
	 * 
	 */
	@Transactional
	public Integer countTeams() {
		return ((Long) teamDAO.createQuerySingleResult("select count(o) from Team o").getSingleResult()).intValue();
	}

	/**
	 * Return all Team entity
	 * 
	 */
	@Transactional
	public List<Team> findAllTeams(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Team>(teamDAO.findAllTeams(startResult, maxRows));
	}

	/**
	 * Load an existing Team entity
	 * 
	 */
	@Transactional
	public Set<Team> loadTeams() {
		return teamDAO.findAllTeams();
	}

	/**
	 */
	@Transactional
	public Team findTeamByPrimaryKey(Integer id) {
		return teamDAO.findTeamByPrimaryKey(id);
	}
}
