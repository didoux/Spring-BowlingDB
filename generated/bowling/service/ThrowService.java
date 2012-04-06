
package bowling.service;

import bowling.domain.Throw;

import java.util.List;
import java.util.Set;


/**
 * Spring service that handles CRUD requests for Throw entities
 * 
 */
public interface ThrowService  {

 			
		/**
 * Load an existing Throw entity
 * 
 	 	 */
		public Set<Throw> loadThrows () ;
 			
		/**
 	 	 */
		public Throw findThrowByPrimaryKey (Integer id) ;
 			
		/**
 * Save an existing Throw entity
 * 
 	 	 */
		public void saveThrow (Throw throw) ;
 			
		/**
 * Return a count of all Throw entity
 * 
 	 	 */
		public Integer countThrows () ;
 			
		/**
 * Return all Throw entity
 * 
 	 	 */
		public List<Throw> findAllThrows (Integer startResult,Integer maxRows) ;
 			
		/**
 * Delete an existing Throw entity
 * 
 	 	 */
		public void deleteThrow (Throw throw_1) ;
}