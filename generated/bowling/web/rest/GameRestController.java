package bowling.web.rest;

import bowling.dao.GameDAO;

import bowling.domain.Game;

import bowling.service.GameService;

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
 * Spring Rest controller that handles CRUD requests for Game entities
 * 
 */

@Controller("GameRestController")
public class GameRestController {

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
	 * Create a new Game entity
	 * 
	 */
	@RequestMapping(value = "/Game", method = RequestMethod.POST)
	@ResponseBody
	public Game newGame(@RequestBody Game game) {
		gameService.saveGame(game);
		return gameDAO.findGameByPrimaryKey(game.getId());
	}

	/**
	 * Save an existing Game entity
	 * 
	 */
	@RequestMapping(value = "/Game", method = RequestMethod.PUT)
	@ResponseBody
	public Game saveGame(@RequestBody Game game) {
		gameService.saveGame(game);
		return gameDAO.findGameByPrimaryKey(game.getId());
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
	 * Show all Game entities
	 * 
	 */
	@RequestMapping(value = "/Game", method = RequestMethod.GET)
	@ResponseBody
	public List<Game> listGames() {
		return new java.util.ArrayList<Game>(gameService.loadGames());
	}

	/**
	 * Select an existing Game entity
	 * 
	 */
	@RequestMapping(value = "/Game/{game_id}", method = RequestMethod.GET)
	@ResponseBody
	public Game loadGame(@PathVariable Integer game_id) {
		return gameDAO.findGameByPrimaryKey(game_id);
	}

	/**
	 * Delete an existing Game entity
	 * 
	 */
	@RequestMapping(value = "/Game/{game_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteGame(@PathVariable Integer game_id) {
		Game game = gameDAO.findGameByPrimaryKey(game_id);
		gameService.deleteGame(game);
	}
}