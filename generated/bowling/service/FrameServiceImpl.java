package bowling.service;

import bowling.dao.FrameDAO;

import bowling.domain.Frame;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Frame entities
 * 
 */

@Service("FrameService")
@Transactional
public class FrameServiceImpl implements FrameService {

	/**
	 * DAO injected by Spring that manages Frame entities
	 * 
	 */
	@Autowired
	private FrameDAO frameDAO;

	/**
	 * Instantiates a new FrameServiceImpl.
	 *
	 */
	public FrameServiceImpl() {
	}

	/**
	 * Return all Frame entity
	 * 
	 */
	@Transactional
	public List<Frame> findAllFrames(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Frame>(frameDAO.findAllFrames(startResult, maxRows));
	}

	/**
	 * Delete an existing Frame entity
	 * 
	 */
	@Transactional
	public void deleteFrame(Frame frame) {
		frameDAO.remove(frame);
		frameDAO.flush();
	}

	/**
	 * Load an existing Frame entity
	 * 
	 */
	@Transactional
	public Set<Frame> loadFrames() {
		return frameDAO.findAllFrames();
	}

	/**
	 * Save an existing Frame entity
	 * 
	 */
	@Transactional
	public void saveFrame(Frame frame) {
		Frame existingFrame = frameDAO.findFrameByPrimaryKey(frame.getId());

		if (existingFrame != null) {
			if (existingFrame != frame) {
				existingFrame.setId(frame.getId());
				existingFrame.setGameId(frame.getGameId());
				existingFrame.setNbr(frame.getNbr());
				existingFrame.setLaneNbr(frame.getLaneNbr());
				existingFrame.setNotes(frame.getNotes());
			}
			frame = frameDAO.store(existingFrame);
		} else {
			frame = frameDAO.store(frame);
		}
		frameDAO.flush();
	}

	/**
	 * Return a count of all Frame entity
	 * 
	 */
	@Transactional
	public Integer countFrames() {
		return ((Long) frameDAO.createQuerySingleResult("select count(o) from Frame o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Frame findFrameByPrimaryKey(Integer id) {
		return frameDAO.findFrameByPrimaryKey(id);
	}
}
