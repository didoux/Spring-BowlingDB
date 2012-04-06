package bowling.service;

import bowling.domain.Week;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Week entities
 * 
 */
public interface WeekService {

	/**
	 * Delete an existing Week entity
	 * 
	 */
	public void deleteWeek(Week week);

	/**
	 * Return a count of all Week entity
	 * 
	 */
	public Integer countWeeks();

	/**
	 * Save an existing Week entity
	 * 
	 */
	public void saveWeek(Week week_1);

	/**
	 */
	public Week findWeekByPrimaryKey(Integer id);

	/**
	 * Return all Week entity
	 * 
	 */
	public List<Week> findAllWeeks(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Week entity
	 * 
	 */
	public Set<Week> loadWeeks();
}