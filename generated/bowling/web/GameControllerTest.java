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
 * Unit test for the <code>GameController</code> controller.
 *
 * @see bowling.web.GameController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class GameControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteGame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteGame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteGame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>gameControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetgameControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/gameController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		GameController controller = (GameController) context.getBean("GameController");

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