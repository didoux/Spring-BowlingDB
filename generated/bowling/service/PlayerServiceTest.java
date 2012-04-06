package bowling.service;

import bowling.domain.Player;

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
public class PlayerServiceTest {

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
	protected PlayerService service;

	/**
	 * Instantiates a new PlayerServiceTest.
	 *
	 */
	public PlayerServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Player entity
	 * 
	 */
	@Test
	public void findAllPlayers() {
		// TODO: JUnit - Populate test inputs for operation: findAllPlayers 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Player> response = null;
		response = service.findAllPlayers(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllPlayers
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findPlayerByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findPlayerByPrimaryKey 
		Integer id = 0;
		Player response = null;
		response = service.findPlayerByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findPlayerByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Player entity
	 * 
	 */
	@Test
	public void deletePlayer() {
		// TODO: JUnit - Populate test inputs for operation: deletePlayer 
		Player player = new bowling.domain.Player();
		service.deletePlayer(player);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Player entity
	 * 
	 */
	@Test
	public void savePlayer() {
		// TODO: JUnit - Populate test inputs for operation: savePlayer 
		Player player_1 = new bowling.domain.Player();
		service.savePlayer(player_1);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Player entity
	 * 
	 */
	@Test
	public void loadPlayers() {
		Set<Player> response = null;
		response = service.loadPlayers();
		// TODO: JUnit - Add assertions to test outputs of operation: loadPlayers
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Player entity
	 * 
	 */
	@Test
	public void countPlayers() {
		Integer response = null;
		response = service.countPlayers();
		// TODO: JUnit - Add assertions to test outputs of operation: countPlayers
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
