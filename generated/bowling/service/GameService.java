package bowling.service;

import bowling.domain.Game;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Game entities
 * 
 */
public interface GameService {

	/**
	 * Save an existing Game entity
	 * 
	 */
	public void saveGame(Game game);

	/**
	 * Return all Game entity
	 * 
	 */
	public List<Game> findAllGames(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Game entity
	 * 
	 */
	public void deleteGame(Game game_1);

	/**
	 * Return a count of all Game entity
	 * 
	 */
	public Integer countGames();

	/**
	 * Load an existing Game entity
	 * 
	 */
	public Set<Game> loadGames();

	/**
	 */
	public Game findGameByPrimaryKey(Integer id);
}