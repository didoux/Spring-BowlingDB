package bowling.dao;

/**
 * Created by IntelliJ IDEA.
 * User: Dan
 * Date: 4/22/12
 * Time: 2:26 PM
 */

import bowling.data.dao.LeagueDAO;
import bowling.data.domain.League;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Class used to test the basic Data Store Functionality
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class })
@Transactional
@ContextConfiguration(locations = {
        "classpath:Spring-BowlingDB-dao-test-context.xml" })
public class LeagueDAOTest {
    /**
     * The DAO being tested, injected by Spring
     *
     */

    private LeagueDAO dataStore;

    /**
     * Instantiates a new LeagueDAOTest.
     *
     */
    public LeagueDAOTest() {
    }

    /**
     * Method to test League domain object.
     *
     */
    @Rollback(false)
    @Test
    public void League() {
        League instance = new League();
        instance.setName("Nelson Stumpf Hdcp. League");
        instance.setExternalId("404");
        int year = 2011;
        int month = 9;
        int day = 1;

        String startDtString = year + "/" + month + "/" + day;
        java.util.Date startDt = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        try {
            startDt = formatter.parse(startDtString);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        instance.setStartDt(startDt);
        // Test create
        // TODO: Populate instance for create.  The store will fail if the primary key fields are blank.

        // store the object
        dataStore.store(instance);

        // Test update
        // TODO: Modify non-key domain object values for update

        // update the object
        dataStore.store(instance);

        // Test delete
        dataStore.remove(instance);

    }

    /**
     * Method to allow Spring to inject the DAO that will be tested
     *
     */
    @Autowired
    public void setDataStore(LeagueDAO dataStore) {
        this.dataStore = dataStore;
    }
}
