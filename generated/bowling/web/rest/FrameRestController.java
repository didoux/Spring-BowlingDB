package bowling.web.rest;

import bowling.dao.FrameDAO;

import bowling.domain.Frame;

import bowling.service.FrameService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Spring Rest controller that handles CRUD requests for Frame entities
 * 
 */

@Controller("FrameRestController")
public class FrameRestController {

	/**
	 * DAO injected by Spring that manages Frame entities
	 * 
	 */
	@Autowired
	private FrameDAO frameDAO;

	/**
	 * Service injected by Spring that provides CRUD operations for Frame entities
	 * 
	 */
	@Autowired
	private FrameService frameService;

	/**
	 * Show all Frame entities
	 * 
	 */
	@RequestMapping(value = "/Frame", method = RequestMethod.GET)
	@ResponseBody
	public List<Frame> listFrames() {
		return new java.util.ArrayList<Frame>(frameService.loadFrames());
	}

	/**
	 * Delete an existing Frame entity
	 * 
	 */
	@RequestMapping(value = "/Frame/{frame_id}", method = RequestMethod.DELETE)
	@ResponseBody
	public void deleteFrame(@PathVariable Integer frame_id) {
		Frame frame = frameDAO.findFrameByPrimaryKey(frame_id);
		frameService.deleteFrame(frame);
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Select an existing Frame entity
	 * 
	 */
	@RequestMapping(value = "/Frame/{frame_id}", method = RequestMethod.GET)
	@ResponseBody
	public Frame loadFrame(@PathVariable Integer frame_id) {
		return frameDAO.findFrameByPrimaryKey(frame_id);
	}

	/**
	 * Create a new Frame entity
	 * 
	 */
	@RequestMapping(value = "/Frame", method = RequestMethod.POST)
	@ResponseBody
	public Frame newFrame(@RequestBody Frame frame) {
		frameService.saveFrame(frame);
		return frameDAO.findFrameByPrimaryKey(frame.getId());
	}

	/**
	 * Save an existing Frame entity
	 * 
	 */
	@RequestMapping(value = "/Frame", method = RequestMethod.PUT)
	@ResponseBody
	public Frame saveFrame(@RequestBody Frame frame) {
		frameService.saveFrame(frame);
		return frameDAO.findFrameByPrimaryKey(frame.getId());
	}
}