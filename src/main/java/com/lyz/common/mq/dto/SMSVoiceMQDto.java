package com.lyz.common.mq.dto;

import java.io.Serializable;

import com.lyz.common.dto.SMSVoiceDto;

/**
 * *********************************
 * 
 * @Description: 语音通知
 * @author: liupeng
 * @createdAt: 2017年6月20日上午11:19:33 
 * **********************************
 */
public class SMSVoiceMQDto extends SMSVoiceDto implements Serializable {
	/** 
	 * @Fields serialVersionUID:TODO 
	 */
	private static final long serialVersionUID = 4866576210064702955L;
	/**
	 * 请求url
	 */
	private String reqUrl;
	/**
	 * 主账号ID
	 */
	private String accountId;
	/**
	 * 主账号token
	 */
	private String authToken;
	
	public String getReqUrl() {
		return reqUrl;
	}
	public void setReqUrl(String reqUrl) {
		this.reqUrl = reqUrl;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	@Override
	public String toString() {
		return "SMSVoiceMQDto [reqUrl=" + reqUrl + ", accountId=" + accountId + ", authToken=" + authToken + "]";
	}
}
