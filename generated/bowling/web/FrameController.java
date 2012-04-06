package bowling.web;

import bowling.dao.FrameDAO;

import bowling.domain.Frame;

import bowling.service.FrameService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Frame entities
 * 
 */

@Controller("FrameController")
public class FrameController {

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
	 * Create a new Frame entity
	 * 
	 */
	@RequestMapping("/newFrame")
	public ModelAndView newFrame() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("frame", new Frame());
		mav.addObject("newFlag", true);
		mav.setViewName("frame/editFrame.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Frame entities
	 * 
	 */
	public String indexFrame() {
		return "redirect:/indexFrame";
	}

	/**
	 * Delete an existing Frame entity
	 * 
	 */
	@RequestMapping("/deleteFrame")
	public String deleteFrame(@RequestParam Integer idKey) {
		Frame frame = frameDAO.findFrameByPrimaryKey(idKey);
		frameService.deleteFrame(frame);
		return "forward:/indexFrame";
	}

	/**
	 * Save an existing Frame entity
	 * 
	 */
	@RequestMapping("/saveFrame")
	public String saveFrame(@ModelAttribute Frame frame) {
		frameService.saveFrame(frame);
		return "forward:/indexFrame";
	}

	/**
	 */
	@RequestMapping("/frameController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Show all Frame entities
	 * 
	 */
	@RequestMapping("/indexFrame")
	public ModelAndView listFrames() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("frames", frameService.loadFrames());

		mav.setViewName("frame/listFrames.jsp");

		return mav;
	}

	/**
	 * Edit an existing Frame entity
	 * 
	 */
	@RequestMapping("/editFrame")
	public ModelAndView editFrame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("frame", frameDAO.findFrameByPrimaryKey(idKey));
		mav.setViewName("frame/editFrame.jsp");

		return mav;
	}

	/**
	 * Select the Frame entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteFrame")
	public ModelAndView confirmDeleteFrame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("frame", frameDAO.findFrameByPrimaryKey(idKey));
		mav.setViewName("frame/deleteFrame.jsp");

		return mav;
	}

	/**
	 * Select an existing Frame entity
	 * 
	 */
	@RequestMapping("/selectFrame")
	public ModelAndView selectFrame(@RequestParam Integer idKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("frame", frameDAO.findFrameByPrimaryKey(idKey));
		mav.setViewName("frame/viewFrame.jsp");

		return mav;
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
}