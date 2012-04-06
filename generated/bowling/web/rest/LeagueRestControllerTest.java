package bowling.web.rest;

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
 * Unit test for the <code>LeagueRestController</code> controller.
 *
 * @see bowling.web.rest.LeagueRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class LeagueRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>League()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/League");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueRestController controller = (LeagueRestController) context.getBean("LeagueRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Leagueleague_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetLeagueleague_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/League/{league_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueRestController controller = (LeagueRestController) context.getBean("LeagueRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>League()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/League");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueRestController controller = (LeagueRestController) context.getBean("LeagueRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>League()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostLeague() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/League");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueRestController controller = (LeagueRestController) context.getBean("LeagueRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Leagueleague_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteLeagueleague_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/League/{league_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		LeagueRestController controller = (LeagueRestController) context.getBean("LeagueRestController");

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