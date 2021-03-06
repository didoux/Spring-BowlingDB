package bowling.service;

import bowling.domain.Throw;

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
public class ThrowServiceTest {

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
	protected ThrowService service;

	/**
	 * Instantiates a new ThrowServiceTest.
	 *
	 */
	public ThrowServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Load an existing Throw entity
	 * 
	 */
	@Test
	public void loadThrows() {
		Set<Throw> response = null;
		response = service.loadThrows();
		// TODO: JUnit - Add assertions to test outputs of operation: loadThrows
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findThrowByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findThrowByPrimaryKey 
		Integer id = 0;
		Throw response = null;
		response = service.findThrowByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findThrowByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Throw entity
	 * 
	 */
	@Test
		public void saveThrow ()  {	
 			// TODO: JUnit - Populate test inputs for operation: saveThrow 
 				Throw throw = new bowling.domain.Throw();
		   		     service.saveThrow(throw);
		}

	/**
	 * Operation Unit Test
	 * Return a count of all Throw entity
	 * 
	 */
	@Test
	public void countThrows() {
		Integer response = null;
		response = service.countThrows();
		// TODO: JUnit - Add assertions to test outputs of operation: countThrows
	}

	/**
	 * Operation Unit Test
	 * Return all Throw entity
	 * 
	 */
	@Test
	public void findAllThrows() {
		// TODO: JUnit - Populate test inputs for operation: findAllThrows 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Throw> response = null;
		response = service.findAllThrows(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllThrows
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Throw entity
	 * 
	 */
	@Test
	public void deleteThrow() {
		// TODO: JUnit - Populate test inputs for operation: deleteThrow 
		Throw throw_1 = new bowling.domain.Throw();
		service.deleteThrow(throw_1);
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
