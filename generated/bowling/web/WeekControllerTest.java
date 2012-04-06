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
 * Unit test for the <code>WeekController</code> controller.
 *
 * @see bowling.web.WeekController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
public class WeekControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>indexWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteWeek()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteWeek() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteWeek");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>weekControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetweekControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/weekController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		WeekController controller = (WeekController) context.getBean("WeekController");

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