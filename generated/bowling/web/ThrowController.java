package bowling.web;

import bowling.dao.ThrowDAO;

import bowling.domain.Throw;

import bowling.service.ThrowService;

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
 * Spring MVC controller that handles CRUD requests for Throw entities
 * 
 */

@Controller("ThrowController")

	
public class ThrowController 
		{
	
	
	
		
		

/**
 * DAO injected by Spring that manages Throw entities
 * 
 */
@Autowired
private ThrowDAO throwDAO;

/**
 * Service injected by Spring that provides CRUD operations for Throw entities
 * 
 */
@Autowired
private ThrowService throwService;
 	
	
/**
 * Edit an existing Throw entity
 * 
 */
@RequestMapping("/editThrow") public ModelAndView editThrow (@RequestParam Integer idKey)  
{ModelAndView mav = new ModelAndView();

mav.addObject("throw",throwDAO.findThrowByPrimaryKey(idKey));
mav.setViewName("throw/editThrow.jsp");

return mav;}/**
 * Show all Throw entities
 * 
 */
@RequestMapping("/indexThrow") public ModelAndView listThrows ()  
{ModelAndView mav = new ModelAndView();

mav.addObject("throws",throwService.loadThrows());

mav.setViewName("throw/listThrows.jsp");

return mav;
}/**
 * Entry point to show all Throw entities
 * 
 */
public String indexThrow ()  
{return "redirect:/indexThrow";
}/**
 * Select the Throw entity for display allowing the user to confirm that they would like to delete the entity
 * 
 */
@RequestMapping("/confirmDeleteThrow") public ModelAndView confirmDeleteThrow (@RequestParam Integer idKey)  
{ModelAndView mav = new ModelAndView();

mav.addObject("throw",throwDAO.findThrowByPrimaryKey(idKey));
mav.setViewName("throw/deleteThrow.jsp");

return mav;}/**
 * Select an existing Throw entity
 * 
 */
@RequestMapping("/selectThrow") public ModelAndView selectThrow (@RequestParam Integer idKey)  
{ModelAndView mav = new ModelAndView();

mav.addObject("throw",throwDAO.findThrowByPrimaryKey(idKey));
mav.setViewName("throw/viewThrow.jsp");

return mav;}/**
 * Save an existing Throw entity
 * 
 */
@RequestMapping("/saveThrow") public String saveThrow (@ModelAttribute Throw throw)  
{throwService.saveThrow(throw);
return "forward:/indexThrow";}/**
 */
@RequestMapping("/throwController/binary.action") public ModelAndView streamBinary (@ModelAttribute HttpServletRequest request,@ModelAttribute HttpServletResponse response)  
{	ModelAndView mav = new ModelAndView();
	mav.setViewName("streamedBinaryContentView");
	return mav;

}/**
 * Delete an existing Throw entity
 * 
 */
@RequestMapping("/deleteThrow") public String deleteThrow (@RequestParam Integer idKey)  
{Throw throw = throwDAO.findThrowByPrimaryKey(idKey);
throwService.deleteThrow(throw);
return "forward:/indexThrow";}/**
 * Create a new Throw entity
 * 
 */
@RequestMapping("/newThrow") public ModelAndView newThrow ()  
{ModelAndView mav = new ModelAndView();

mav.addObject("throw",new Throw());
mav.addObject("newFlag", true);
mav.setViewName("throw/editThrow.jsp");

return mav;}/**
 * Register custom, context-specific property editors
 * 
 */
@InitBinder  public void initBinder (WebDataBinder binder,HttpServletRequest request)  
{	// Register static property editors.
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
	}}