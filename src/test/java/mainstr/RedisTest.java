package mainstr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyz.common.cache.CacheEnum;
import com.lyz.common.cache.CacheMan;
import com.lyz.student.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class RedisTest {
	@Autowired
	StudentService studentService;

	@Test
	public void student() {
		CacheMan.add(CacheEnum.LIGE, "lyz.ok", 30);
	}

	// @Test
	// public void queryadd() {
	// Student s = new Student();
	// // studentService.queryStudent();
	// }

}
