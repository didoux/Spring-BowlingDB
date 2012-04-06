package bowling.service;

import bowling.domain.Player;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Player entities
 * 
 */
public interface PlayerService {

	/**
	 * Return all Player entity
	 * 
	 */
	public List<Player> findAllPlayers(Integer startResult, Integer maxRows);

	/**
	 */
	public Player findPlayerByPrimaryKey(Integer id);

	/**
	 * Delete an existing Player entity
	 * 
	 */
	public void deletePlayer(Player player);

	/**
	 * Save an existing Player entity
	 * 
	 */
	public void savePlayer(Player player_1);

	/**
	 * Load an existing Player entity
	 * 
	 */
	public Set<Player> loadPlayers();

	/**
	 * Return a count of all Player entity
	 * 
	 */
	public Integer countPlayers();
}