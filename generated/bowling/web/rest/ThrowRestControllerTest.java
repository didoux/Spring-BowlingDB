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
 * Unit test for the <code>ThrowRestController</code> controller.
 *
 * @see bowling.web.rest.ThrowRestController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class ThrowRestControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>Throw()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Throw");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowRestController controller = (ThrowRestController) context.getBean("ThrowRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Throwthrow_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetThrowthrow_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Throw/{throw_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowRestController controller = (ThrowRestController) context.getBean("ThrowRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Throw()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PutThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Throw");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowRestController controller = (ThrowRestController) context.getBean("ThrowRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Throw()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void PostThrow() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Throw");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowRestController controller = (ThrowRestController) context.getBean("ThrowRestController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>Throwthrow_id()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void DeleteThrowthrow_id() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/Throw/{throw_id}");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ThrowRestController controller = (ThrowRestController) context.getBean("ThrowRestController");

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