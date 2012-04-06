package bowling.dao;

import bowling.domain.Week;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Week entities.
 * 
 */
public interface WeekDAO extends JpaDao<Week> {

	/**
	 * JPQL Query - findWeekByTeamId
	 *
	 */
	public Set<Week> findWeekByTeamId(Integer teamId) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByTeamId
	 *
	 */
	public Set<Week> findWeekByTeamId(Integer teamId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByPrimaryKey
	 *
	 */
	public Week findWeekByPrimaryKey(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByPrimaryKey
	 *
	 */
	public Week findWeekByPrimaryKey(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDateBefore
	 *
	 */
	public Set<Week> findWeekByDateBefore(java.util.Calendar date) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDateBefore
	 *
	 */
	public Set<Week> findWeekByDateBefore(Calendar date, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllWeeks
	 *
	 */
	public Set<Week> findAllWeeks() throws DataAccessException;

	/**
	 * JPQL Query - findAllWeeks
	 *
	 */
	public Set<Week> findAllWeeks(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekById
	 *
	 */
	public Week findWeekById(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findWeekById
	 *
	 */
	public Week findWeekById(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDateAfter
	 *
	 */
	public Set<Week> findWeekByDateAfter(java.util.Calendar date_1) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDateAfter
	 *
	 */
	public Set<Week> findWeekByDateAfter(Calendar date_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDate
	 *
	 */
	public Set<Week> findWeekByDate(java.util.Calendar date_2) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByDate
	 *
	 */
	public Set<Week> findWeekByDate(Calendar date_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByWeekNumber
	 *
	 */
	public Set<Week> findWeekByWeekNumber(Integer weekNumber) throws DataAccessException;

	/**
	 * JPQL Query - findWeekByWeekNumber
	 *
	 */
	public Set<Week> findWeekByWeekNumber(Integer weekNumber, int startResult, int maxRows) throws DataAccessException;

}