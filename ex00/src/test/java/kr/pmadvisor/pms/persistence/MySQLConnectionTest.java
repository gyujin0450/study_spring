package kr.pmadvisor.pms.persistence;

import java.sql.Connection;
 
import javax.inject.Inject;
import javax.sql.DataSource;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MySQLConnectionTest {
    
    @Inject
    private DataSource ds;
    private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
 
    @Test
    public void testConnection() throws Exception {
 
        try (Connection con = ds.getConnection()) {
 
            logger.info("Connection 출력 : " + con + "\n");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}