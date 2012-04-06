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
 * Unit test for the <code>PlayerController</code> controller.
 *
 * @see bowling.web.PlayerController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class PlayerControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexPlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexPlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectPlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectPlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editPlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editPlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>savePlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsavePlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/savePlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newPlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewPlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newPlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeletePlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeletePlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeletePlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deletePlayer()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeletePlayer() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deletePlayer");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>playerControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetplayerControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/playerController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		PlayerController controller = (PlayerController) context.getBean("PlayerController");

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