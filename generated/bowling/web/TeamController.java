package bowling.web;

import bowling.dao.TeamDAO;

import bowling.domain.Team;

import bowling.service.TeamService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Team entities
 * 
 */

@Controller("TeamController")
public class TeamController {

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
	 * Entry point to show all Team entities
	 * 
	 */
	public String indexTeam() {
		return "redirect:/indexTeam";
	}

	/**
	 * Show all Team entities
	 * 
	 */
	@RequestMapping("/indexTeam")
	public ModelAndView listTeams() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("teams", teamService.loadTeams());

		mav.setViewName("team/listTeams.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/teamController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Team entity
	 * 
	 */
	@RequestMapping("/selectTeam")
	public ModelAndView selectTeam(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("team", teamDAO.findTeamByPrimaryKey(idKey));
		mav.setViewName("team/viewTeam.jsp");

		return mav;
	}

	/**
	 * Create a new Team entity
	 * 
	 */
	@RequestMapping("/newTeam")
	public ModelAndView newTeam() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("team", new Team());
		mav.addObject("newFlag", true);
		mav.setViewName("team/editTeam.jsp");

		return mav;
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

	/**
	 * Delete an existing Team entity
	 * 
	 */
	@RequestMapping("/deleteTeam")
	public String deleteTeam(@RequestParam Integer idKey) {
		Team team = teamDAO.findTeamByPrimaryKey(idKey);
		teamService.deleteTeam(team);
		return "forward:/indexTeam";
	}

	/**
	 * Edit an existing Team entity
	 * 
	 */
	@RequestMapping("/editTeam")
	public ModelAndView editTeam(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("team", teamDAO.findTeamByPrimaryKey(idKey));
		mav.setViewName("team/editTeam.jsp");

		return mav;
	}

	/**
	 * Save an existing Team entity
	 * 
	 */
	@RequestMapping("/saveTeam")
	public String saveTeam(@ModelAttribute Team team) {
		teamService.saveTeam(team);
		return "forward:/indexTeam";
	}

	/**
	 * Select the Team entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteTeam")
	public ModelAndView confirmDeleteTeam(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("team", teamDAO.findTeamByPrimaryKey(idKey));
		mav.setViewName("team/deleteTeam.jsp");

		return mav;
	}
}