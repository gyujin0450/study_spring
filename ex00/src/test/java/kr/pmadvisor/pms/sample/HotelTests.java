package kr.pmadvisor.pms.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class HotelTests {

	  private SampleHotel hotel;  

	  @Test
	  public void testExist() {
	    
	    assertNotNull(hotel);
	    
//	    logger.info(hotel);
//	    logger.info("----------------------------------");
//	    logger.info(hotel.getChef());
//	    
	  }
}
