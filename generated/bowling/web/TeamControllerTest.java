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
 * Unit test for the <code>TeamController</code> controller.
 *
 * @see bowling.web.TeamController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class TeamControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteTeam()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteTeam() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteTeam");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>teamControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetteamControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/teamController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		TeamController controller = (TeamController) context.getBean("TeamController");

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