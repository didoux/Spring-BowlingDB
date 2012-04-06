package bowling.service;

import bowling.dao.GameDAO;

import bowling.domain.Game;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Game entities
 * 
 */

@Service("GameService")
@Transactional
public class GameServiceImpl implements GameService {

	/**
	 * DAO injected by Spring that manages Game entities
	 * 
	 */
	@Autowired
	private GameDAO gameDAO;

	/**
	 * Instantiates a new GameServiceImpl.
	 *
	 */
	public GameServiceImpl() {
	}

	/**
	 * Save an existing Game entity
	 * 
	 */
	@Transactional
	public void saveGame(Game game) {
		Game existingGame = gameDAO.findGameByPrimaryKey(game.getId());

		if (existingGame != null) {
			if (existingGame != game) {
				existingGame.setId(game.getId());
				existingGame.setPlayerId(game.getPlayerId());
				existingGame.setWeekId(game.getWeekId());
				existingGame.setNbr(game.getNbr());
				existingGame.setStartingLaneNbr(game.getStartingLaneNbr());
				existingGame.setScore(game.getScore());
			}
			game = gameDAO.store(existingGame);
		} else {
			game = gameDAO.store(game);
		}
		gameDAO.flush();
	}

	/**
	 * Return all Game entity
	 * 
	 */
	@Transactional
	public List<Game> findAllGames(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Game>(gameDAO.findAllGames(startResult, maxRows));
	}

	/**
	 * Delete an existing Game entity
	 * 
	 */
	@Transactional
	public void deleteGame(Game game) {
		gameDAO.remove(game);
		gameDAO.flush();
	}

	/**
	 * Return a count of all Game entity
	 * 
	 */
	@Transactional
	public Integer countGames() {
		return ((Long) gameDAO.createQuerySingleResult("select count(o) from Game o").getSingleResult()).intValue();
	}

	/**
	 * Load an existing Game entity
	 * 
	 */
	@Transactional
	public Set<Game> loadGames() {
		return gameDAO.findAllGames();
	}

	/**
	 */
	@Transactional
	public Game findGameByPrimaryKey(Integer id) {
		return gameDAO.findGameByPrimaryKey(id);
	}
}
