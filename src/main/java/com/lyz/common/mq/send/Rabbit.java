package com.lyz.common.mq.send;

import org.apache.log4j.Logger;
import org.springframework.amqp.core.AmqpTemplate;

import com.lyz.common.util.SpringContextUtil;
import com.lyz.common.mq.dto.EmailContent;
import com.lyz.common.mq.dto.SMSDto;
import com.lyz.common.mq.dto.SMSVoiceMQDto;
import com.lyz.common.mq.util.RabbitExchange;
import com.lyz.common.mq.util.RabbitQueue;

public class Rabbit {
	private static Logger logger = Logger.getLogger("MQSend");

	private static AmqpTemplate amqpTemplate = (AmqpTemplate) SpringContextUtil.getBean("amqpTemplate"); // 消息推送

	/**
	 * 发送消息
	 * 
	 * @param queueName
	 * @param msg
	 *            需重写toString方法
	 * @Author: wangxingfei
	 * @Date: 2016年11月14日
	 */
	public static void send(RabbitQueue queueName, Object msg) {
		try {
			amqpTemplate.convertAndSend(queueName.toString(), msg);
			logger.info("发送消息成功;queue:" + queueName + ",sendMsg:" + msg);
		} catch (Exception e) {
			logger.error("发送消息失败;queue:" + queueName + ",sendMsg:" + msg, e);
			if (queueName.isSendEmail()) {
				sendEmail4MQError(queueName, "sendMsg:" + msg + ",errorMsg:" + e.getMessage());
			}
		}
	}

	/**
	 * 发送错误信息到邮箱
	 * 
	 * @param fromQueue
	 *            来源队列
	 * @param content
	 * @Author: wangxingfei
	 * @Date: 2016年11月21日
	 */
	public static void sendEmail4MQError(RabbitQueue fromQueue, String content) {
		EmailContent ec = new EmailContent();
		ec.setBusiName(fromQueue.toString());
		ec.setContent(content);
		sendEmail2MQ(ec);
	}

	/**
	 * 发送邮件
	 * 
	 * @param ec
	 * @Author: wangxingfei
	 * @Date: 2016年11月21日
	 */
	public static void sendEmail(EmailContent ec) {
		sendEmail2MQ(ec);
	}

	/**
	 * 发送邮件到MQ,mq消费者发送并记录
	 * 
	 * @param ec
	 * @Author: wangxingfei
	 * @Date: 2017年3月3日
	 */
	private static void sendEmail2MQ(EmailContent ec) {
		if (ec == null)
			return;
		try {
			amqpTemplate.convertAndSend(RabbitQueue.SEND_ERROR_EMAIL.toString(), ec);
			logger.info("发送邮件MQ成功,ec:" + ec);
		} catch (Exception e) {
			logger.error("发送邮件MQ失败;ec:" + ec, e);
		}
	}

	/**
	 * 发送邮件
	 * 
	 * @param title
	 * @param content
	 * @Author: wangxingfei
	 * @Date: 2016年11月21日
	 */
	public static void sendEmail(String title, String content) {
		EmailContent ec = new EmailContent();
		ec.setBusiName(title);
		ec.setContent(content);
		sendEmail2MQ(ec);
	}

	/**
	 * 发送邮件
	 * 
	 * @param recipients
	 *            收件人A,收件人B
	 * @param title
	 * @param content
	 * @Author: wangxingfei
	 * @Date: 2017年3月3日
	 */
	public static void sendEmail(String recipients, String title, String content) {
		EmailContent ec = new EmailContent();
		ec.setBusiName(title);
		ec.setContent(content);
		ec.setRecipients(recipients);
		sendEmail2MQ(ec);
	}

	/**
	 * 发送消息到 exchange
	 * 
	 * @param exchage名称
	 * @param routing
	 *            key
	 * @param msg
	 * @Author: wangxingfei
	 * @Date: 2016年12月21日
	 */
	public static void sendExchage(RabbitExchange exchange, String routingKey, Object msg) {
		try {
			amqpTemplate.convertAndSend(exchange.toString(), routingKey, msg);
			logger.info("发送消息成功;exchange:" + exchange + ",routingKey:" + routingKey + ",sendMsg:" + msg);
		} catch (Exception e) {
			logger.error("发送消息失败;exchange:" + exchange + ",routingKey:" + routingKey + ",sendMsg:" + msg, e);
			sendEmail("发送消息失败;exchange:" + exchange + ",routingKey:" + routingKey,
					"sendMsg:" + msg + ",errorMsg:" + e.getMessage());
		}
	}

	/**
	 * 发送短信
	 * 
	 * @param sms
	 * @Author: wangxingfei
	 * @Date: 2017年4月1日
	 */
	public static void sendSMS(SMSDto sms) {
		try {
			amqpTemplate.convertAndSend(RabbitQueue.SEND_SMS.toString(), sms);
			logger.info("发送消息成功;queue:" + RabbitQueue.SEND_SMS.toString() + ",sendMsg:" + sms);
		} catch (Exception e) {
			logger.error("发送消息失败;queue:" + RabbitQueue.SEND_SMS + ",sendMsg:" + sms, e);
		}
	}
	
	/**
	 * 发送语音
	 * 
	 * @param voice
	 * @Author: liupeng
	 * @Date: 2017年6月20日
	 */
	public static void sendSMSVoice(SMSVoiceMQDto voice) {
		try {
			amqpTemplate.convertAndSend(RabbitQueue.SEND_SMS_VOICE.toString(), voice);
			logger.info("发送消息成功;queue:" + RabbitQueue.SEND_SMS_VOICE.toString() + ",sendVoiceMsg:" + voice);
		} catch (Exception e) {
			logger.error("发送消息失败;queue:" + RabbitQueue.SEND_SMS_VOICE + ",sendVoiceMsg:" + voice, e);
		}
	}

}
