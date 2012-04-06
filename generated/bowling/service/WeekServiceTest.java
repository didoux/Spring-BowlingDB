package bowling.service;

import bowling.domain.Week;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/Spring-BowlingDB-security-context.xml",
		"file:./resources/Spring-BowlingDB-service-context.xml",
		"file:./resources/Spring-BowlingDB-dao-context.xml",
		"file:./resources/Spring-BowlingDB-web-context.xml" })
@Transactional
public class WeekServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected WeekService service;

	/**
	 * Instantiates a new WeekServiceTest.
	 *
	 */
	public WeekServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Week entity
	 * 
	 */
	@Test
	public void deleteWeek() {
		// TODO: JUnit - Populate test inputs for operation: deleteWeek 
		Week week = new bowling.domain.Week();
		service.deleteWeek(week);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Week entity
	 * 
	 */
	@Test
	public void countWeeks() {
		Integer response = null;
		response = service.countWeeks();
		// TODO: JUnit - Add assertions to test outputs of operation: countWeeks
	}

	/**
	 * Operation Unit Test
	 * Save an existing Week entity
	 * 
	 */
	@Test
	public void saveWeek() {
		// TODO: JUnit - Populate test inputs for operation: saveWeek 
		Week week_1 = new bowling.domain.Week();
		service.saveWeek(week_1);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findWeekByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findWeekByPrimaryKey 
		Integer id = 0;
		Week response = null;
		response = service.findWeekByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findWeekByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Return all Week entity
	 * 
	 */
	@Test
	public void findAllWeeks() {
		// TODO: JUnit - Populate test inputs for operation: findAllWeeks 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Week> response = null;
		response = service.findAllWeeks(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllWeeks
	}

	/**
	 * Operation Unit Test
	 * Load an existing Week entity
	 * 
	 */
	@Test
	public void loadWeeks() {
		Set<Week> response = null;
		response = service.loadWeeks();
		// TODO: JUnit - Add assertions to test outputs of operation: loadWeeks
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
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
