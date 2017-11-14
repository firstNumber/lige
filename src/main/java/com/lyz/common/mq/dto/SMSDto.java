package com.lyz.common.mq.dto;

import java.io.Serializable;
import java.util.Arrays;

public class SMSDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String phone;
	private String templateId;
	private String[] args;
	private String serverIP;
	private String serverPort;
	private String accountSid;
	private String accountToken;
	private String appId;

	public SMSDto() {

	}

	public SMSDto(String phone, String templateId, String serverIP, String serverPort, String accountSid,
			String accountToken, String appId) {
		this.phone = phone;
		this.templateId = templateId;
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.accountSid = accountSid;
		this.accountToken = accountToken;
		this.appId = appId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getAccountSid() {
		return accountSid;
	}

	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}

	public String getAccountToken() {
		return accountToken;
	}

	public void setAccountToken(String accountToken) {
		this.accountToken = accountToken;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String[] getInits() {
		String[] inits = { serverIP, serverPort, accountSid, accountToken, appId };
		return inits;
	}

	@Override
	public String toString() {
		return "SMSDto [phone=" + phone + ", templateId=" + templateId + ", args=" + Arrays.toString(args)
				+ ", serverIP=" + serverIP + ", serverPort=" + serverPort + ", accountSid=" + accountSid
				+ ", accountToken=" + accountToken + ", appId=" + appId + "]";
	}

}
