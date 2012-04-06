package bowling.service;

import bowling.dao.WeekDAO;

import bowling.domain.Week;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Week entities
 * 
 */

@Service("WeekService")
@Transactional
public class WeekServiceImpl implements WeekService {

	/**
	 * DAO injected by Spring that manages Week entities
	 * 
	 */
	@Autowired
	private WeekDAO weekDAO;

	/**
	 * Instantiates a new WeekServiceImpl.
	 *
	 */
	public WeekServiceImpl() {
	}

	/**
	 * Delete an existing Week entity
	 * 
	 */
	@Transactional
	public void deleteWeek(Week week) {
		weekDAO.remove(week);
		weekDAO.flush();
	}

	/**
	 * Return a count of all Week entity
	 * 
	 */
	@Transactional
	public Integer countWeeks() {
		return ((Long) weekDAO.createQuerySingleResult("select count(o) from Week o").getSingleResult()).intValue();
	}

	/**
	 * Save an existing Week entity
	 * 
	 */
	@Transactional
	public void saveWeek(Week week) {
		Week existingWeek = weekDAO.findWeekByPrimaryKey(week.getId());

		if (existingWeek != null) {
			if (existingWeek != week) {
				existingWeek.setId(week.getId());
				existingWeek.setWeekNumber(week.getWeekNumber());
				existingWeek.setDate(week.getDate());
				existingWeek.setTeamId(week.getTeamId());
			}
			week = weekDAO.store(existingWeek);
		} else {
			week = weekDAO.store(week);
		}
		weekDAO.flush();
	}

	/**
	 */
	@Transactional
	public Week findWeekByPrimaryKey(Integer id) {
		return weekDAO.findWeekByPrimaryKey(id);
	}

	/**
	 * Return all Week entity
	 * 
	 */
	@Transactional
	public List<Week> findAllWeeks(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Week>(weekDAO.findAllWeeks(startResult, maxRows));
	}

	/**
	 * Load an existing Week entity
	 * 
	 */
	@Transactional
	public Set<Week> loadWeeks() {
		return weekDAO.findAllWeeks();
	}
}
