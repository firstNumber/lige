package com.lyz.common.mq.util;

/**
 * *********************************
 * 
 * @Description: 队列名称(规则:发送方模块名称_接收方模块名称_业务说明)
 * @author: liyongzhen
 * @createdAt: 2016年11月15日下午8:32:30
 **********************************
 */
public enum RabbitQueue {
	LIGE_RABBITMQ(false),
	SEND_ERROR_EMAIL(false), // 发送邮件
	SEND_SMS(false), // 发送短信
	/**
	 * 发送语音
	 */
	SEND_SMS_VOICE(false), TRACE_OTHER_PUSH_TRACE(false), // 订单物流轨迹,推送其他平台
	TRACE_TRACE_QUERY_BATCH(false), // 订单物流轨迹, 批量自动查询
	ORDER_TRACE_ADD_ORDER(true), // 新增订单,同步到轨迹中心
	// ORDER_LINGDAN_ADD_ORDER(true), // 新增订单,同步到零担平台
	ORDER_ZB_ADD_ORDER(true), // 新增订单,同步到众包平台
	// ORDER_TRACE_UPDATE_MAILNO(true), //修改运单号,同步到轨迹中心
	// USER_ORDER_UPDATE_INFO(true), //承运方修改运单号,运费等,同步到订单中心
	USER_OTHER_UPDATE_ORDER(true), // 承运方修改订单信息,同步到外部系统
	USER_TASK_SETTLE_ACCOUNT(true), // 确认结算，推送结算中心
	USER_TASK_PUSH_ACCOUNT(true), // 确认取件，推送结算中心
	ZHONGBAO_TASK_PUSH_ACCOUNT_TCZB(true), // 同城众包 骑士，推送结算中心
	TASK_PUSH_ACCOUNT_TCZB_SETTLED_ZC(true), // 驻仓结算
	TASK_PUSH_ACCOUNT_TCZB_SETTLED_DDY(true), // 调度员结算
	TASK_PUSH_ACCOUNT_SETTLED_DRIVER(true), // 司机结算
	DELAY_ORDER_SYNC(false), // 死信队列,延迟发送使用, 用欧冠与同步订单信息
	/**
	 * 众包按包处理
	 */
	ZHONGBAO_ZB_YADAN(true), // 众包压单
	/**
	 * 众包按单处理（有站点信息）
	 * 
	 * ZHONGBAO_ZB_ORDER_SITE(true),
	 */
	/**
	 * 众包按单处理（无站点信息）
	 */
	ZHONGBAO_ZB_ORDER_NO_SITE(true),

	EX_ZHONGBAO_UPDATE_INFO(true), // 众包同步订单状态

	ZHONGBAO_ZBHH_YADAN(true), // 周边好货压单

	APP_MESSAGE_PUSH(false), // app推送消息
	;

	private boolean sendEmail;// 异常时是否发送邮件

	RabbitQueue(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public boolean isSendEmail() {
		return sendEmail;
	}

	/**
	 * 根据名称找对象
	 * 
	 * @param queueName
	 * @return
	 * @Author: liyongzhen
	 * @Date: 2016年11月18日
	 */
	public static RabbitQueue getByName(String queueName) {
		for (RabbitQueue qs : RabbitQueue.values()) {
			if (qs.toString().equals(queueName)) {
				return qs;
			}
		}
		return null;
	}
}
