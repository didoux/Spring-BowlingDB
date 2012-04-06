package bowling.web;

import bowling.dao.PlayerDAO;

import bowling.domain.Player;

import bowling.service.PlayerService;

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
 * Spring MVC controller that handles CRUD requests for Player entities
 * 
 */

@Controller("PlayerController")
public class PlayerController {

	/**
	 * DAO injected by Spring that manages Player entities
	 * 
	 */
	@Autowired
	private PlayerDAO playerDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Player entities
	 * 
	 */
	@Autowired
	private PlayerService playerService;

	/**
	 * Edit an existing Player entity
	 * 
	 */
	@RequestMapping("/editPlayer")
	public ModelAndView editPlayer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("player", playerDAO.findPlayerByPrimaryKey(idKey));
		mav.setViewName("player/editPlayer.jsp");

		return mav;
	}

	/**
	 * Save an existing Player entity
	 * 
	 */
	@RequestMapping("/savePlayer")
	public String savePlayer(@ModelAttribute Player player) {
		playerService.savePlayer(player);
		return "forward:/indexPlayer";
	}

	/**
	 */
	@RequestMapping("/playerController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Player entity
	 * 
	 */
	@RequestMapping("/selectPlayer")
	public ModelAndView selectPlayer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("player", playerDAO.findPlayerByPrimaryKey(idKey));
		mav.setViewName("player/viewPlayer.jsp");

		return mav;
	}

	/**
	 * Select the Player entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeletePlayer")
	public ModelAndView confirmDeletePlayer(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("player", playerDAO.findPlayerByPrimaryKey(idKey));
		mav.setViewName("player/deletePlayer.jsp");

		return mav;
	}

	/**
	 * Delete an existing Player entity
	 * 
	 */
	@RequestMapping("/deletePlayer")
	public String deletePlayer(@RequestParam Integer idKey) {
		Player player = playerDAO.findPlayerByPrimaryKey(idKey);
		playerService.deletePlayer(player);
		return "forward:/indexPlayer";
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
	 * Entry point to show all Player entities
	 * 
	 */
	public String indexPlayer() {
		return "redirect:/indexPlayer";
	}

	/**
	 * Create a new Player entity
	 * 
	 */
	@RequestMapping("/newPlayer")
	public ModelAndView newPlayer() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("player", new Player());
		mav.addObject("newFlag", true);
		mav.setViewName("player/editPlayer.jsp");

		return mav;
	}

	/**
	 * Show all Player entities
	 * 
	 */
	@RequestMapping("/indexPlayer")
	public ModelAndView listPlayers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("players", playerService.loadPlayers());

		mav.setViewName("player/listPlayers.jsp");

		return mav;
	}
}