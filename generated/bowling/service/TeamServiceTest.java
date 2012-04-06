package bowling.service;

import bowling.domain.Team;

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
public class TeamServiceTest {

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
	protected TeamService service;

	/**
	 * Instantiates a new TeamServiceTest.
	 *
	 */
	public TeamServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Team entity
	 * 
	 */
	@Test
	public void saveTeam() {
		// TODO: JUnit - Populate test inputs for operation: saveTeam 
		Team team = new bowling.domain.Team();
		service.saveTeam(team);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Team entity
	 * 
	 */
	@Test
	public void deleteTeam() {
		// TODO: JUnit - Populate test inputs for operation: deleteTeam 
		Team team_1 = new bowling.domain.Team();
		service.deleteTeam(team_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Team entity
	 * 
	 */
	@Test
	public void countTeams() {
		Integer response = null;
		response = service.countTeams();
		// TODO: JUnit - Add assertions to test outputs of operation: countTeams
	}

	/**
	 * Operation Unit Test
	 * Return all Team entity
	 * 
	 */
	@Test
	public void findAllTeams() {
		// TODO: JUnit - Populate test inputs for operation: findAllTeams 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Team> response = null;
		response = service.findAllTeams(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllTeams
	}

	/**
	 * Operation Unit Test
	 * Load an existing Team entity
	 * 
	 */
	@Test
	public void loadTeams() {
		Set<Team> response = null;
		response = service.loadTeams();
		// TODO: JUnit - Add assertions to test outputs of operation: loadTeams
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findTeamByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findTeamByPrimaryKey 
		Integer id = 0;
		Team response = null;
		response = service.findTeamByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findTeamByPrimaryKey
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
