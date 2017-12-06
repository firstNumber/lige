package lige;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyz.user.model.Carbox;
import com.lyz.user.service.DynamicService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context2.xml"})
public class DataMain {
	@Autowired
	DynamicService dynamicService;
	
	@Test
	public void testCache(){
		Carbox carbox = dynamicService.querycar();
		System.out.println(carbox.toString());
	}
}
