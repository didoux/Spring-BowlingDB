package bowling.web.rest;

import bowling.dao.WeekDAO;

import bowling.domain.Week;

import bowling.service.WeekService;

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
 * Spring Rest controller that handles CRUD requests for Week entities
 * 
 */

@Controller("WeekRestController")
public class WeekRestController {

	/**
	 * DAO injected by Spring that manages Week entities
	 * 
	 */
	@Autowired
	private WeekDAO weekDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Week entities
	 * 
	 */
	@Autowired
	private WeekService weekService;

	/**
	 * Create a new Week entity
	 * 
	 */
	@RequestMapping(value = "/Week", method = RequestMethod.POST)
	@ResponseBody
	public Week newWeek(@RequestBody Week week) {
		weekService.saveWeek(week);
		return weekDAO.findWeekByPrimaryKey(week.getId());
	}

	/**
	 * Select an existing Week entity
	 * 
	 */
	@RequestMapping(value = "/Week/{week_id}", method = RequestMethod.GET)
	@ResponseBody
	public Week loadWeek(@PathVariable Integer week_id) {
		return weekDAO.findWeekByPrimaryKey(week_id);
	}

	/**
	 * Delete an existing Week entity
	 * 
	 */
	@RequestMapping(value = "/Week/{week_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteWeek(@PathVariable Integer week_id) {
		Week week = weekDAO.findWeekByPrimaryKey(week_id);
		weekService.deleteWeek(week);
	}

	/**
	 * Save an existing Week entity
	 * 
	 */
	@RequestMapping(value = "/Week", method = RequestMethod.PUT)
	@ResponseBody
	public Week saveWeek(@RequestBody Week week) {
		weekService.saveWeek(week);
		return weekDAO.findWeekByPrimaryKey(week.getId());
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
	 * Show all Week entities
	 * 
	 */
	@RequestMapping(value = "/Week", method = RequestMethod.GET)
	@ResponseBody
	public List<Week> listWeeks() {
		return new java.util.ArrayList<Week>(weekService.loadWeeks());
	}
}