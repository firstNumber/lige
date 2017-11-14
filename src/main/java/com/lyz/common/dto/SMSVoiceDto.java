package com.lyz.common.dto;

import java.io.Serializable;

/**
 * *********************************
 * 
 * @Description: 语音通知
 * @author: liupeng
 * @createdAt: 2017年6月20日上午11:19:33 
 * **********************************
 */
public class SMSVoiceDto implements Serializable {
	/**
	 * @Fields serialVersionUID:TODO
	 */
	private static final long serialVersionUID = -5136623142153322034L;
	/**
	 * 应用ID
	 */
	private String appId;
	/**
	 * 被叫号码，被叫为座机时需要添加区号，如：01052823298；被叫为分机时分机号由‘-’隔开，如：01052823298-3627
	 */
	private String to;
	/**
	 * 语音文件名称，格式 wav，播放多个文件用英文分号隔开。与mediaTxt不能同时为空。当不为空时mediaTxt属性失效。
	 */
	private String mediaName;
	/**
	 * 语音文件名的类型,表示用户语音文件； 值为1表示平台通用文件。此为json参数，在xml时为属性type值
	 */
	private String mediaNameType;
	/**
	 * 文本内容，文本中汉字要求utf8编码，默认值为空。当mediaName为空才有效
	 */
	private String mediaTxt;
	/**
	 * 来电显示的号码
	 */
	private String displayNum;
	/**
	 * 循环播放次数，1－3次
	 */
	private String playTimes;
	/**
	 * 外呼通知状态通知回调地址
	 */
	private String respUrl;
	/**
	 * 第三方私有数据
	 */
	private String userData;
	/**
	 * 文本转语音后的发音速度，取值范围：-500至500，当mediaTxt有效才生效
	 */
	private String txtSpeed;
	/**
	 * 文本转语音后的音量大小，取值范围：-20至20，当mediaTxt有效才生效
	 */
	private String txtVolume;
	/**
	 * 文本转语音后的音调，取值范围：-500至500，当mediaTxt有效才生效
	 */
	private String txtPitch;
	/**
	 * 文本转语音后的背景音编号，目前云通讯平台支持6种背景音，1到6的六种背景音编码，0为不需要背景音。当mediaTxt有效才生效
	 */
	private String txtBgsound;
	/**
	 * 是否同时播放文本和语音文件 , 0、否 1、是.优先播放文本。
	 */
	private String playMode;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public String getMediaNameType() {
		return mediaNameType;
	}

	public void setMediaNameType(String mediaNameType) {
		this.mediaNameType = mediaNameType;
	}

	public String getMediaTxt() {
		return mediaTxt;
	}

	public void setMediaTxt(String mediaTxt) {
		this.mediaTxt = mediaTxt;
	}

	public String getDisplayNum() {
		return displayNum;
	}

	public void setDisplayNum(String displayNum) {
		this.displayNum = displayNum;
	}

	public String getPlayTimes() {
		return playTimes;
	}

	public void setPlayTimes(String playTimes) {
		this.playTimes = playTimes;
	}

	public String getRespUrl() {
		return respUrl;
	}

	public void setRespUrl(String respUrl) {
		this.respUrl = respUrl;
	}

	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public String getTxtSpeed() {
		return txtSpeed;
	}

	public void setTxtSpeed(String txtSpeed) {
		this.txtSpeed = txtSpeed;
	}

	public String getTxtVolume() {
		return txtVolume;
	}

	public void setTxtVolume(String txtVolume) {
		this.txtVolume = txtVolume;
	}

	public String getTxtPitch() {
		return txtPitch;
	}

	public void setTxtPitch(String txtPitch) {
		this.txtPitch = txtPitch;
	}

	public String getTxtBgsound() {
		return txtBgsound;
	}

	public void setTxtBgsound(String txtBgsound) {
		this.txtBgsound = txtBgsound;
	}

	public String getPlayMode() {
		return playMode;
	}

	public void setPlayMode(String playMode) {
		this.playMode = playMode;
	}
}
