package bowling.web;

import bowling.dao.GameDAO;

import bowling.domain.Game;

import bowling.service.GameService;

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
 * Spring MVC controller that handles CRUD requests for Game entities
 * 
 */

@Controller("GameController")
public class GameController {

	/**
	 * DAO injected by Spring that manages Game entities
	 * 
	 */
	@Autowired
	private GameDAO gameDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Game entities
	 * 
	 */
	@Autowired
	private GameService gameService;

	/**
	 */
	@RequestMapping("/gameController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
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
	 * Select the Game entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteGame")
	public ModelAndView confirmDeleteGame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("game", gameDAO.findGameByPrimaryKey(idKey));
		mav.setViewName("game/deleteGame.jsp");

		return mav;
	}

	/**
	 * Edit an existing Game entity
	 * 
	 */
	@RequestMapping("/editGame")
	public ModelAndView editGame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("game", gameDAO.findGameByPrimaryKey(idKey));
		mav.setViewName("game/editGame.jsp");

		return mav;
	}

	/**
	 * Save an existing Game entity
	 * 
	 */
	@RequestMapping("/saveGame")
	public String saveGame(@ModelAttribute Game game) {
		gameService.saveGame(game);
		return "forward:/indexGame";
	}

	/**
	 * Show all Game entities
	 * 
	 */
	@RequestMapping("/indexGame")
	public ModelAndView listGames() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("games", gameService.loadGames());

		mav.setViewName("game/listGames.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Game entities
	 * 
	 */
	public String indexGame() {
		return "redirect:/indexGame";
	}

	/**
	 * Select an existing Game entity
	 * 
	 */
	@RequestMapping("/selectGame")
	public ModelAndView selectGame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("game", gameDAO.findGameByPrimaryKey(idKey));
		mav.setViewName("game/viewGame.jsp");

		return mav;
	}

	/**
	 * Delete an existing Game entity
	 * 
	 */
	@RequestMapping("/deleteGame")
	public String deleteGame(@RequestParam Integer idKey) {
		Game game = gameDAO.findGameByPrimaryKey(idKey);
		gameService.deleteGame(game);
		return "forward:/indexGame";
	}

	/**
	 * Create a new Game entity
	 * 
	 */
	@RequestMapping("/newGame")
	public ModelAndView newGame() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("game", new Game());
		mav.addObject("newFlag", true);
		mav.setViewName("game/editGame.jsp");

		return mav;
	}
}