package bowling.web;

import bowling.dao.LeagueDAO;

import bowling.domain.League;

import bowling.service.LeagueService;

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
 * Spring MVC controller that handles CRUD requests for League entities
 * 
 */

@Controller("LeagueController")
public class LeagueController {

	/**
	 * DAO injected by Spring that manages League entities
	 * 
	 */
	@Autowired
	private LeagueDAO leagueDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for League entities
	 * 
	 */
	@Autowired
	private LeagueService leagueService;

	/**
	 */
	@RequestMapping("/leagueController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all League entities
	 * 
	 */
	@RequestMapping("/indexLeague")
	public ModelAndView listLeagues() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("leagues", leagueService.loadLeagues());

		mav.setViewName("league/listLeagues.jsp");

		return mav;
	}

	/**
	 * Edit an existing League entity
	 * 
	 */
	@RequestMapping("/editLeague")
	public ModelAndView editLeague(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("league", leagueDAO.findLeagueByPrimaryKey(idKey));
		mav.setViewName("league/editLeague.jsp");

		return mav;
	}

	/**
	 * Select an existing League entity
	 * 
	 */
	@RequestMapping("/selectLeague")
	public ModelAndView selectLeague(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("league", leagueDAO.findLeagueByPrimaryKey(idKey));
		mav.setViewName("league/viewLeague.jsp");

		return mav;
	}

	/**
	 * Select the League entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteLeague")
	public ModelAndView confirmDeleteLeague(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("league", leagueDAO.findLeagueByPrimaryKey(idKey));
		mav.setViewName("league/deleteLeague.jsp");

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
	 * Delete an existing League entity
	 * 
	 */
	@RequestMapping("/deleteLeague")
	public String deleteLeague(@RequestParam Integer idKey) {
		League league = leagueDAO.findLeagueByPrimaryKey(idKey);
		leagueService.deleteLeague(league);
		return "forward:/indexLeague";
	}

	/**
	 * Save an existing League entity
	 * 
	 */
	@RequestMapping("/saveLeague")
	public String saveLeague(@ModelAttribute League league) {
		leagueService.saveLeague(league);
		return "forward:/indexLeague";
	}

	/**
	 * Entry point to show all League entities
	 * 
	 */
	public String indexLeague() {
		return "redirect:/indexLeague";
	}

	/**
	 * Create a new League entity
	 * 
	 */
	@RequestMapping("/newLeague")
	public ModelAndView newLeague() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("league", new League());
		mav.addObject("newFlag", true);
		mav.setViewName("league/editLeague.jsp");

		return mav;
	}
}