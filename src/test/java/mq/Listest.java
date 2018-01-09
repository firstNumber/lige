package mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class Listest {

	@Test
	public void student() {
		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "我是第一个 Mq.");
	}

}
