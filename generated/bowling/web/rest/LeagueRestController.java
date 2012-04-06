package bowling.web.rest;

import bowling.dao.LeagueDAO;

import bowling.domain.League;

import bowling.service.LeagueService;

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
 * Spring Rest controller that handles CRUD requests for League entities
 * 
 */

@Controller("LeagueRestController")
public class LeagueRestController {

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
	 * Save an existing League entity
	 * 
	 */
	@RequestMapping(value = "/League", method = RequestMethod.PUT)
	@ResponseBody
	public League saveLeague(@RequestBody League league) {
		leagueService.saveLeague(league);
		return leagueDAO.findLeagueByPrimaryKey(league.getId());
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
	@RequestMapping(value = "/League/{league_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteLeague(@PathVariable Integer league_id) {
		League league = leagueDAO.findLeagueByPrimaryKey(league_id);
		leagueService.deleteLeague(league);
	}

	/**
	 * Create a new League entity
	 * 
	 */
	@RequestMapping(value = "/League", method = RequestMethod.POST)
	@ResponseBody
	public League newLeague(@RequestBody League league) {
		leagueService.saveLeague(league);
		return leagueDAO.findLeagueByPrimaryKey(league.getId());
	}

	/**
	 * Show all League entities
	 * 
	 */
	@RequestMapping(value = "/League", method = RequestMethod.GET)
	@ResponseBody
	public List<League> listLeagues() {
		return new java.util.ArrayList<League>(leagueService.loadLeagues());
	}

	/**
	 * Select an existing League entity
	 * 
	 */
	@RequestMapping(value = "/League/{league_id}", method = RequestMethod.GET)
	@ResponseBody
	public League loadLeague(@PathVariable Integer league_id) {
		return leagueDAO.findLeagueByPrimaryKey(league_id);
	}
}