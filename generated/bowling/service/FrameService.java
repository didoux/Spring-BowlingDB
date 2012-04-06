package bowling.service;

import bowling.domain.Frame;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Frame entities
 * 
 */
public interface FrameService {

	/**
	 * Return all Frame entity
	 * 
	 */
	public List<Frame> findAllFrames(Integer startResult, Integer maxRows);

	/**
	 * Delete an existing Frame entity
	 * 
	 */
	public void deleteFrame(Frame frame);

	/**
	 * Load an existing Frame entity
	 * 
	 */
	public Set<Frame> loadFrames();

	/**
	 * Save an existing Frame entity
	 * 
	 */
	public void saveFrame(Frame frame_1);

	/**
	 * Return a count of all Frame entity
	 * 
	 */
	public Integer countFrames();

	/**
	 */
	public Frame findFrameByPrimaryKey(Integer id);
}