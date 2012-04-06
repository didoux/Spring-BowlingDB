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
 * Unit test for the <code>FrameController</code> controller.
 *
 * @see bowling.web.FrameController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class FrameControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteFrame()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteFrame() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteFrame");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>frameControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetframeControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/frameController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		FrameController controller = (FrameController) context.getBean("FrameController");

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