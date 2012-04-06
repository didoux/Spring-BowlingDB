package bowling.web;

import bowling.dao.WeekDAO;

import bowling.domain.Week;

import bowling.service.WeekService;

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
 * Spring MVC controller that handles CRUD requests for Week entities
 * 
 */

@Controller("WeekController")
public class WeekController {

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
	 * Entry point to show all Week entities
	 * 
	 */
	public String indexWeek() {
		return "redirect:/indexWeek";
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
	@RequestMapping("/indexWeek")
	public ModelAndView listWeeks() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("weeks", weekService.loadWeeks());

		mav.setViewName("week/listWeeks.jsp");

		return mav;
	}

	/**
	 * Select the Week entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteWeek")
	public ModelAndView confirmDeleteWeek(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("week", weekDAO.findWeekByPrimaryKey(idKey));
		mav.setViewName("week/deleteWeek.jsp");

		return mav;
	}

	/**
	 * Save an existing Week entity
	 * 
	 */
	@RequestMapping("/saveWeek")
	public String saveWeek(@ModelAttribute Week week) {
		weekService.saveWeek(week);
		return "forward:/indexWeek";
	}

	/**
	 * Delete an existing Week entity
	 * 
	 */
	@RequestMapping("/deleteWeek")
	public String deleteWeek(@RequestParam Integer idKey) {
		Week week = weekDAO.findWeekByPrimaryKey(idKey);
		weekService.deleteWeek(week);
		return "forward:/indexWeek";
	}

	/**
	 * Create a new Week entity
	 * 
	 */
	@RequestMapping("/newWeek")
	public ModelAndView newWeek() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("week", new Week());
		mav.addObject("newFlag", true);
		mav.setViewName("week/editWeek.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/weekController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Edit an existing Week entity
	 * 
	 */
	@RequestMapping("/editWeek")
	public ModelAndView editWeek(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("week", weekDAO.findWeekByPrimaryKey(idKey));
		mav.setViewName("week/editWeek.jsp");

		return mav;
	}

	/**
	 * Select an existing Week entity
	 * 
	 */
	@RequestMapping("/selectWeek")
	public ModelAndView selectWeek(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("week", weekDAO.findWeekByPrimaryKey(idKey));
		mav.setViewName("week/viewWeek.jsp");

		return mav;
	}
}