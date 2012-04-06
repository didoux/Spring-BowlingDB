package bowling.web.rest;

import bowling.dao.TeamDAO;

import bowling.domain.Team;

import bowling.service.TeamService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Team entities
 * 
 */

@Controller("TeamRestController")
public class TeamRestController {

	/**
	 * DAO injected by Spring that manages Team entities
	 * 
	 */
	@Autowired
	private TeamDAO teamDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Team entities
	 * 
	 */
	@Autowired
	private TeamService teamService;

	/**
	 * Delete an existing Team entity
	 * 
	 */
	@RequestMapping(value = "/Team/{team_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteTeam(@PathVariable Integer team_id) {
		Team team = teamDAO.findTeamByPrimaryKey(team_id);
		teamService.deleteTeam(team);
	}

	/**
	 * Save an existing Team entity
	 * 
	 */
	@RequestMapping(value = "/Team", method = RequestMethod.PUT)
	@ResponseBody
	public Team saveTeam(@RequestBody Team team) {
		teamService.saveTeam(team);
		return teamDAO.findTeamByPrimaryKey(team.getId());
	}

	/**
	 * Show all Team entities
	 * 
	 */
	@RequestMapping(value = "/Team", method = RequestMethod.GET)
	@ResponseBody
	public List<Team> listTeams() {
		return new java.util.ArrayList<Team>(teamService.loadTeams());
	}

	/**
	 * Select an existing Team entity
	 * 
	 */
	@RequestMapping(value = "/Team/{team_id}", method = RequestMethod.GET)
	@ResponseBody
	public Team loadTeam(@PathVariable Integer team_id) {
		return teamDAO.findTeamByPrimaryKey(team_id);
	}

	/**
	 * Create a new Team entity
	 * 
	 */
	@RequestMapping(value = "/Team", method = RequestMethod.POST)
	@ResponseBody
	public Team newTeam(@RequestBody Team team) {
		teamService.saveTeam(team);
		return teamDAO.findTeamByPrimaryKey(team.getId());
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}
}