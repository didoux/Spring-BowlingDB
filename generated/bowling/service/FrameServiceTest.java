package bowling.service;

import bowling.domain.Frame;

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
public class FrameServiceTest {

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
	protected FrameService service;

	/**
	 * Instantiates a new FrameServiceTest.
	 *
	 */
	public FrameServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return all Frame entity
	 * 
	 */
	@Test
	public void findAllFrames() {
		// TODO: JUnit - Populate test inputs for operation: findAllFrames 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Frame> response = null;
		response = service.findAllFrames(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllFrames
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Frame entity
	 * 
	 */
	@Test
	public void deleteFrame() {
		// TODO: JUnit - Populate test inputs for operation: deleteFrame 
		Frame frame = new bowling.domain.Frame();
		service.deleteFrame(frame);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Frame entity
	 * 
	 */
	@Test
	public void loadFrames() {
		Set<Frame> response = null;
		response = service.loadFrames();
		// TODO: JUnit - Add assertions to test outputs of operation: loadFrames
	}

	/**
	 * Operation Unit Test
	 * Save an existing Frame entity
	 * 
	 */
	@Test
	public void saveFrame() {
		// TODO: JUnit - Populate test inputs for operation: saveFrame 
		Frame frame_1 = new bowling.domain.Frame();
		service.saveFrame(frame_1);
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Frame entity
	 * 
	 */
	@Test
	public void countFrames() {
		Integer response = null;
		response = service.countFrames();
		// TODO: JUnit - Add assertions to test outputs of operation: countFrames
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findFrameByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findFrameByPrimaryKey 
		Integer id = 0;
		Frame response = null;
		response = service.findFrameByPrimaryKey(id);
		// TODO: JUnit - Add assertions to test outputs of operation: findFrameByPrimaryKey
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
