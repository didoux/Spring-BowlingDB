package bowling.web.rest;

import bowling.dao.PlayerDAO;

import bowling.domain.Player;

import bowling.service.PlayerService;

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
 * Spring Rest controller that handles CRUD requests for Player entities
 * 
 */

@Controller("PlayerRestController")
public class PlayerRestController {

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
	 * Create a new Player entity
	 * 
	 */
	@RequestMapping(value = "/Player", method = RequestMethod.POST)
	@ResponseBody
	public Player newPlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
		return playerDAO.findPlayerByPrimaryKey(player.getId());
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
	 * Show all Player entities
	 * 
	 */
	@RequestMapping(value = "/Player", method = RequestMethod.GET)
	@ResponseBody
	public List<Player> listPlayers() {
		return new java.util.ArrayList<Player>(playerService.loadPlayers());
	}

	/**
	 * Save an existing Player entity
	 * 
	 */
	@RequestMapping(value = "/Player", method = RequestMethod.PUT)
	@ResponseBody
	public Player savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
		return playerDAO.findPlayerByPrimaryKey(player.getId());
	}

	/**
	 * Delete an existing Player entity
	 * 
	 */
	@RequestMapping(value = "/Player/{player_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deletePlayer(@PathVariable Integer player_id) {
		Player player = playerDAO.findPlayerByPrimaryKey(player_id);
		playerService.deletePlayer(player);
	}

	/**
	 * Select an existing Player entity
	 * 
	 */
	@RequestMapping(value = "/Player/{player_id}", method = RequestMethod.GET)
	@ResponseBody
	public Player loadPlayer(@PathVariable Integer player_id) {
		return playerDAO.findPlayerByPrimaryKey(player_id);
	}
}