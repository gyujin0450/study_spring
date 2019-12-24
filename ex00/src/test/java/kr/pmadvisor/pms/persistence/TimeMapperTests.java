package kr.pmadvisor.pms.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.pmadvisor.pms.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TimeMapperTests {
	
	@Autowired
	private TimeMapper timeMapper;

	@Test
	public void testGetTime() {
//		logger.info(timeMapper.getClass().getName());
//		logger.info(timeMapper.getTime());
	}

	@Test
	public void tetGetTime2() {

//		logger.info("getTime2");
//		logger.info(timeMapper.getTime2());

	}

}
