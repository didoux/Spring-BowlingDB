package bowling.service;

import bowling.dao.PlayerDAO;

import bowling.domain.Player;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Player entities
 * 
 */

@Service("PlayerService")
@Transactional
public class PlayerServiceImpl implements PlayerService {

	/**
	 * DAO injected by Spring that manages Player entities
	 * 
	 */
	@Autowired
	private PlayerDAO playerDAO;

	/**
	 * Instantiates a new PlayerServiceImpl.
	 *
	 */
	public PlayerServiceImpl() {
	}

	/**
	 * Return all Player entity
	 * 
	 */
	@Transactional
	public List<Player> findAllPlayers(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Player>(playerDAO.findAllPlayers(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Player findPlayerByPrimaryKey(Integer id) {
		return playerDAO.findPlayerByPrimaryKey(id);
	}

	/**
	 * Delete an existing Player entity
	 * 
	 */
	@Transactional
	public void deletePlayer(Player player) {
		playerDAO.remove(player);
		playerDAO.flush();
	}

	/**
	 * Save an existing Player entity
	 * 
	 */
	@Transactional
	public void savePlayer(Player player) {
		Player existingPlayer = playerDAO.findPlayerByPrimaryKey(player.getId());

		if (existingPlayer != null) {
			if (existingPlayer != player) {
				existingPlayer.setId(player.getId());
				existingPlayer.setTeamId(player.getTeamId());
				existingPlayer.setName(player.getName());
				existingPlayer.setExternalId(player.getExternalId());
			}
			player = playerDAO.store(existingPlayer);
		} else {
			player = playerDAO.store(player);
		}
		playerDAO.flush();
	}

	/**
	 * Load an existing Player entity
	 * 
	 */
	@Transactional
	public Set<Player> loadPlayers() {
		return playerDAO.findAllPlayers();
	}

	/**
	 * Return a count of all Player entity
	 * 
	 */
	@Transactional
	public Integer countPlayers() {
		return ((Long) playerDAO.createQuerySingleResult("select count(o) from Player o").getSingleResult()).intValue();
	}
}
