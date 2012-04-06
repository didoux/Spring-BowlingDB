package bowling.dao;

import bowling.domain.Frame;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Frame entities.
 * 
 */
public interface FrameDAO extends JpaDao<Frame> {

	/**
	 * JPQL Query - findFrameByGameId
	 *
	 */
	public Set<Frame> findFrameByGameId(Integer gameId) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByGameId
	 *
	 */
	public Set<Frame> findFrameByGameId(Integer gameId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllFrames
	 *
	 */
	public Set<Frame> findAllFrames() throws DataAccessException;

	/**
	 * JPQL Query - findAllFrames
	 *
	 */
	public Set<Frame> findAllFrames(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNbr
	 *
	 */
	public Set<Frame> findFrameByNbr(Integer nbr) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNbr
	 *
	 */
	public Set<Frame> findFrameByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByLaneNbr
	 *
	 */
	public Set<Frame> findFrameByLaneNbr(Integer laneNbr) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByLaneNbr
	 *
	 */
	public Set<Frame> findFrameByLaneNbr(Integer laneNbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNotes
	 *
	 */
	public Set<Frame> findFrameByNotes(String notes) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNotes
	 *
	 */
	public Set<Frame> findFrameByNotes(String notes, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameById
	 *
	 */
	public Frame findFrameById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findFrameById
	 *
	 */
	public Frame findFrameById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNotesContaining
	 *
	 */
	public Set<Frame> findFrameByNotesContaining(String notes_1) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByNotesContaining
	 *
	 */
	public Set<Frame> findFrameByNotesContaining(String notes_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByPrimaryKey
	 *
	 */
	public Frame findFrameByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findFrameByPrimaryKey
	 *
	 */
	public Frame findFrameByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

}