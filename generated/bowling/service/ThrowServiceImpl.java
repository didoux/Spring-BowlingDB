package bowling.service;

import bowling.dao.ThrowDAO;

import bowling.domain.Throw;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


/**
 * Spring service that handles CRUD requests for Throw entities
 * 
 */

@Service("ThrowService")

	@Transactional 
public class ThrowServiceImpl  implements 
	ThrowService
	{
	
	 	

/**
 * DAO injected by Spring that manages Throw entities
 * 
 */
@Autowired
private ThrowDAO throwDAO;
 	
	/**
	 * Instantiates a new ThrowServiceImpl.
	 *
 	 */
	public ThrowServiceImpl() {
	}
 	
/**
 * Load an existing Throw entity
 * 
 */
	@Transactional 
public Set<Throw> loadThrows ()  
{return throwDAO.findAllThrows();
} 	
/**
 */
	@Transactional 
public Throw findThrowByPrimaryKey (Integer id)  
{ return throwDAO.findThrowByPrimaryKey(id);} 	
/**
 * Save an existing Throw entity
 * 
 */
	@Transactional 
public void saveThrow (Throw throw)  
{Throw existingThrow = throwDAO.findThrowByPrimaryKey(throw.getId());

if (existingThrow != null)	{
	if (existingThrow != throw) {
			existingThrow.setId (throw.getId());
			existingThrow.setFrameId (throw.getFrameId());
			existingThrow.setNbr (throw.getNbr());
			existingThrow.setNbrOfPinsDown (throw.getNbrOfPinsDown());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_pin (throw.get_pin());
			existingThrow.set_0pin (throw.get_0pin());
			existingThrow.setPinBinaryArray (throw.getPinBinaryArray());
			existingThrow.setBallNameTxt (throw.getBallNameTxt());
			existingThrow.setTarget (throw.getTarget());
			existingThrow.setPosition (throw.getPosition());
			existingThrow.setNoteTxt (throw.getNoteTxt());
	}
	throw = throwDAO.store(existingThrow);
}
else	{
	throw = throwDAO.store(throw);
}
throwDAO.flush();
} 	
/**
 * Return a count of all Throw entity
 * 
 */
	@Transactional 
public Integer countThrows ()  
{	return ((Long)throwDAO.createQuerySingleResult("select count(o) from Throw o").getSingleResult()).intValue();
} 	
/**
 * Return all Throw entity
 * 
 */
	@Transactional 
public List<Throw> findAllThrows (Integer startResult,Integer maxRows)  
{ return new java.util.ArrayList<Throw>(throwDAO.findAllThrows(startResult, maxRows));} 	
/**
 * Delete an existing Throw entity
 * 
 */
	@Transactional 
public void deleteThrow (Throw throw)  
{throwDAO.remove(throw);
throwDAO.flush();
}	
 }
