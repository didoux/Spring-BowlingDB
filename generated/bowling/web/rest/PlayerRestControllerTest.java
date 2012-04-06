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
 * Unit test for the <code>PlayerRestController</code> controller.
 *
 * @see bowling.web.rest.PlayerRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class PlayerRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Player()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Player");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerRestController controller = (PlayerRestController) context.getBean("PlayerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Playerplayer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetPlayerplayer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Player/{player_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerRestController controller = (PlayerRestController) context.getBean("PlayerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Player()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Player");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerRestController controller = (PlayerRestController) context.getBean("PlayerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Player()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Player");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerRestController controller = (PlayerRestController) context.getBean("PlayerRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Playerplayer_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeletePlayerplayer_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Player/{player_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerRestController controller = (PlayerRestController) context.getBean("PlayerRestController");

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