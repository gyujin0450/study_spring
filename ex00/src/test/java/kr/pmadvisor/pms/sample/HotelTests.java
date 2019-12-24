package kr.pmadvisor.pms.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class HotelTests {

	  @Autowired	
	  private SampleHotel hotel;
	  private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

	  @Test
	  public void testExist() {
	    
	    assertNotNull(hotel);
	    
	    logger.info("{}",hotel);
	    logger.info("----------------------------------");
	    logger.info("{}",hotel.getChef());
	    
	  }
}
