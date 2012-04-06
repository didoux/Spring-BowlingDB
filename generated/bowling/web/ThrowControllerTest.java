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
 * Unit test for the <code>ThrowController</code> controller.
 *
 * @see bowling.web.ThrowController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class ThrowControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteThrow()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteThrow");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>throwControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetthrowControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/throwController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowController controller = (ThrowController) context.getBean("ThrowController");

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