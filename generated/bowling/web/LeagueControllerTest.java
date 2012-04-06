package bowling.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>LeagueController</code> controller.
 *
 * @see bowling.web.LeagueController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class LeagueControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteLeague()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteLeague");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>leagueControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetleagueControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/leagueController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueController controller = (LeagueController) context.getBean("LeagueController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}