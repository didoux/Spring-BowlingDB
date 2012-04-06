package bowling.service;

import bowling.domain.Game;

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
public class GameServiceTest {

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
	protected GameService service;

	/**
	 * Instantiates a new GameServiceTest.
	 *
	 */
	public GameServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Save an existing Game entity
	 * 
	 */
	@Test
	public void saveGame() {
		// TODO: JUnit - Populate test inputs for operation: saveGame 
		Game game = new bowling.domain.Game();
		service.saveGame(game);
	}

	/**
	 * Operation Unit Test
	 * Return all Game entity
	 * 
	 */
	@Test
	public void findAllGames() {
		// TODO: JUnit - Populate test inputs for operation: findAllGames 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Game> response = null;
		response = service.findAllGames(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllGames
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Game entity
	 * 
	 */
	@Test
	public void deleteGame() {
		// TODO: JUnit - Populate test inputs for operation: deleteGame 
		Game game_1 = new bowling.domain.Game();
		service.deleteGame(game_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Game entity
	 * 
	 */
	@Test
	public void countGames() {
		Integer response = null;
		response = service.countGames();
		// TODO: JUnit - Add assertions to test outputs of operation: countGames
	}

	/**
	 * Operation Unit Test
	 * Load an existing Game entity
	 * 
	 */
	@Test
	public void loadGames() {
		Set<Game> response = null;
		response = service.loadGames();
		// TODO: JUnit - Add assertions to test outputs of operation: loadGames
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findGameByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findGameByPrimaryKey 
		Integer id = 0;
		Game response = null;
		response = service.findGameByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findGameByPrimaryKey
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
