package com.lyz.common.mq.dto;

import java.io.Serializable;

public class EmailContent implements Serializable{
    /**
	 * @Fields serialVersionUID:TODO
	 */
	private static final long serialVersionUID = 1L;
	private String busiName;
    private String content;
    private String recipients;
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRecipients() {
		return recipients;
	}
	public void setRecipients(String recipients) {
		this.recipients = recipients;
	}
	@Override
	public String toString() {
		return "EmailContent [busiName=" + busiName + ", content=" + content + ", recipients=" + recipients + "]";
	}
    
}
