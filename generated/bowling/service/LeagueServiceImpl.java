package bowling.service;

import bowling.dao.LeagueDAO;

import bowling.domain.League;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for League entities
 * 
 */

@Service("LeagueService")
@Transactional
public class LeagueServiceImpl implements LeagueService {

	/**
	 * DAO injected by Spring that manages League entities
	 * 
	 */
	@Autowired
	private LeagueDAO leagueDAO;

	/**
	 * Instantiates a new LeagueServiceImpl.
	 *
	 */
	public LeagueServiceImpl() {
	}

	/**
	 * Return all League entity
	 * 
	 */
	@Transactional
	public List<League> findAllLeagues(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<League>(leagueDAO.findAllLeagues(startResult, maxRows));
	}

	/**
	 * Return a count of all League entity
	 * 
	 */
	@Transactional
	public Integer countLeagues() {
		return ((Long) leagueDAO.createQuerySingleResult("select count(o) from League o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public League findLeagueByPrimaryKey(Integer id) {
		return leagueDAO.findLeagueByPrimaryKey(id);
	}

	/**
	 * Delete an existing League entity
	 * 
	 */
	@Transactional
	public void deleteLeague(League league) {
		leagueDAO.remove(league);
		leagueDAO.flush();
	}

	/**
	 * Save an existing League entity
	 * 
	 */
	@Transactional
	public void saveLeague(League league) {
		League existingLeague = leagueDAO.findLeagueByPrimaryKey(league.getId());

		if (existingLeague != null) {
			if (existingLeague != league) {
				existingLeague.setId(league.getId());
				existingLeague.setName(league.getName());
				existingLeague.setStartDt(league.getStartDt());
				existingLeague.setExternalId(league.getExternalId());
			}
			league = leagueDAO.store(existingLeague);
		} else {
			league = leagueDAO.store(league);
		}
		leagueDAO.flush();
	}

	/**
	 * Load an existing League entity
	 * 
	 */
	@Transactional
	public Set<League> loadLeagues() {
		return leagueDAO.findAllLeagues();
	}
}
