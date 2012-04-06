package bowling.dao;

import bowling.domain.Throw;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Throw entities.
 * 
 */
public interface ThrowDAO extends JpaDao<Throw> {

	/**
	 * JPQL Query - findThrowById
	 *
	 */
	public Throw findThrowById(Integer id) throws DataAccessException;

	/**
	 * JPQL Query - findThrowById
	 *
	 */
	public Throw findThrowById(Integer id, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNoteTxt
	 *
	 */
	public Set<Throw> findThrowByNoteTxt(String noteTxt) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNoteTxt
	 *
	 */
	public Set<Throw> findThrowByNoteTxt(String noteTxt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNbrOfPinsDown
	 *
	 */
	public Set<Throw> findThrowByNbrOfPinsDown(Integer nbrOfPinsDown) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNbrOfPinsDown
	 *
	 */
	public Set<Throw> findThrowByNbrOfPinsDown(Integer nbrOfPinsDown, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy5pin
	 *
	 */
	public Set<Throw> findThrowBy5pin(Boolean _pin) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy5pin
	 *
	 */
	public Set<Throw> findThrowBy5pin(Boolean _pin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy3pin
	 *
	 */
	public Set<Throw> findThrowBy3pin(Boolean _pin_1) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy3pin
	 *
	 */
	public Set<Throw> findThrowBy3pin(Boolean _pin_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPrimaryKey
	 *
	 */
	public Throw findThrowByPrimaryKey(Integer id_1) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPrimaryKey
	 *
	 */
	public Throw findThrowByPrimaryKey(Integer id_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy4pin
	 *
	 */
	public Set<Throw> findThrowBy4pin(Boolean _pin_2) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy4pin
	 *
	 */
	public Set<Throw> findThrowBy4pin(Boolean _pin_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy9pin
	 *
	 */
	public Set<Throw> findThrowBy9pin(Boolean _pin_3) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy9pin
	 *
	 */
	public Set<Throw> findThrowBy9pin(Boolean _pin_3, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy8pin
	 *
	 */
	public Set<Throw> findThrowBy8pin(Boolean _pin_4) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy8pin
	 *
	 */
	public Set<Throw> findThrowBy8pin(Boolean _pin_4, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy7pin
	 *
	 */
	public Set<Throw> findThrowBy7pin(Boolean _pin_5) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy7pin
	 *
	 */
	public Set<Throw> findThrowBy7pin(Boolean _pin_5, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByFrameId
	 *
	 */
	public Set<Throw> findThrowByFrameId(Integer frameId) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByFrameId
	 *
	 */
	public Set<Throw> findThrowByFrameId(Integer frameId, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNoteTxtContaining
	 *
	 */
	public Set<Throw> findThrowByNoteTxtContaining(String noteTxt_1) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNoteTxtContaining
	 *
	 */
	public Set<Throw> findThrowByNoteTxtContaining(String noteTxt_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy1pin
	 *
	 */
	public Set<Throw> findThrowBy1pin(Boolean _pin_6) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy1pin
	 *
	 */
	public Set<Throw> findThrowBy1pin(Boolean _pin_6, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy6pin
	 *
	 */
	public Set<Throw> findThrowBy6pin(Boolean _pin_7) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy6pin
	 *
	 */
	public Set<Throw> findThrowBy6pin(Boolean _pin_7, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNbr
	 *
	 */
	public Set<Throw> findThrowByNbr(Integer nbr) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByNbr
	 *
	 */
	public Set<Throw> findThrowByNbr(Integer nbr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPosition
	 *
	 */
	public Set<Throw> findThrowByPosition(Integer position) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPosition
	 *
	 */
	public Set<Throw> findThrowByPosition(Integer position, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy10pin
	 *
	 */
	public Set<Throw> findThrowBy10pin(Boolean _0pin) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy10pin
	 *
	 */
	public Set<Throw> findThrowBy10pin(Boolean _0pin, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByTarget
	 *
	 */
	public Set<Throw> findThrowByTarget(Integer target) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByTarget
	 *
	 */
	public Set<Throw> findThrowByTarget(Integer target, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByBallNameTxtContaining
	 *
	 */
	public Set<Throw> findThrowByBallNameTxtContaining(String ballNameTxt) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByBallNameTxtContaining
	 *
	 */
	public Set<Throw> findThrowByBallNameTxtContaining(String ballNameTxt, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy2pin
	 *
	 */
	public Set<Throw> findThrowBy2pin(Boolean _pin_8) throws DataAccessException;

	/**
	 * JPQL Query - findThrowBy2pin
	 *
	 */
	public Set<Throw> findThrowBy2pin(Boolean _pin_8, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPinBinaryArray
	 *
	 */
	public Set<Throw> findThrowByPinBinaryArray(Integer pinBinaryArray) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByPinBinaryArray
	 *
	 */
	public Set<Throw> findThrowByPinBinaryArray(Integer pinBinaryArray, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllThrows
	 *
	 */
	public Set<Throw> findAllThrows() throws DataAccessException;

	/**
	 * JPQL Query - findAllThrows
	 *
	 */
	public Set<Throw> findAllThrows(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByBallNameTxt
	 *
	 */
	public Set<Throw> findThrowByBallNameTxt(String ballNameTxt_1) throws DataAccessException;

	/**
	 * JPQL Query - findThrowByBallNameTxt
	 *
	 */
	public Set<Throw> findThrowByBallNameTxt(String ballNameTxt_1, int startResult, int maxRows) throws DataAccessException;

}