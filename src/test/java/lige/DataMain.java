package lige;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context2.xml" })
public class DataMain {
	// @Autowired
	// DynamicService dynamicService;

	@Test
	public void testCache() {
		// Carbox carbox = dynamicService.querycar();
		// System.out.println(carbox.toString());
		// AnnotationUtils.getAnnotationAttributes();
	}

	@Test
	public void testaaa() {
	}
}
