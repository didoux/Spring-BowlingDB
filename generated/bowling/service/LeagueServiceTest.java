package bowling.service;

import bowling.domain.League;

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
public class LeagueServiceTest {

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
	protected LeagueService service;

	/**
	 * Instantiates a new LeagueServiceTest.
	 *
	 */
	public LeagueServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all League entity
	 * 
	 */
	@Test
	public void findAllLeagues() {
		// TODO: JUnit - Populate test inputs for operation: findAllLeagues 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<League> response = null;
		response = service.findAllLeagues(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllLeagues
	}

	/**
	 * Operation Unit Test
	 * Return a count of all League entity
	 * 
	 */
	@Test
	public void countLeagues() {
		Integer response = null;
		response = service.countLeagues();
		// TODO: JUnit - Add assertions to test outputs of operation: countLeagues
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findLeagueByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findLeagueByPrimaryKey 
		Integer id = 0;
		League response = null;
		response = service.findLeagueByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findLeagueByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing League entity
	 * 
	 */
	@Test
	public void deleteLeague() {
		// TODO: JUnit - Populate test inputs for operation: deleteLeague 
		League league = new bowling.domain.League();
		service.deleteLeague(league);
	}

	/**
	 * Operation Unit Test
	 * Save an existing League entity
	 * 
	 */
	@Test
	public void saveLeague() {
		// TODO: JUnit - Populate test inputs for operation: saveLeague 
		League league_1 = new bowling.domain.League();
		service.saveLeague(league_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing League entity
	 * 
	 */
	@Test
	public void loadLeagues() {
		Set<League> response = null;
		response = service.loadLeagues();
		// TODO: JUnit - Add assertions to test outputs of operation: loadLeagues
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
