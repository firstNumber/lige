package sss.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyz.cabox.service.CarboxService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class TrantS {
	@Autowired
	private CarboxService carboxService;

	@Test
	public void student() {
		carboxService.mogodbQuery();
	}
}
