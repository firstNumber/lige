package mq;

import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class Listest {

	// @Test
	// public void student() {
	// Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "我是第一个 Mq.");
	// }

	public void pushlis() {
		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, "我是第一个 Mq.");
	}

}
