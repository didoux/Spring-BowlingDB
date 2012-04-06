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
 * Unit test for the <code>FrameRestController</code> controller.
 *
 * @see bowling.web.rest.FrameRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class FrameRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Frame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Frame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameRestController controller = (FrameRestController) context.getBean("FrameRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Frameframe_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetFrameframe_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Frame/{frame_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameRestController controller = (FrameRestController) context.getBean("FrameRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Frame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Frame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameRestController controller = (FrameRestController) context.getBean("FrameRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Frame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Frame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameRestController controller = (FrameRestController) context.getBean("FrameRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Frameframe_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteFrameframe_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Frame/{frame_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameRestController controller = (FrameRestController) context.getBean("FrameRestController");

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