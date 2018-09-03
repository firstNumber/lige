package com.lyz.common.enumlei;

public enum MerEnum {
	AUDIT_4(2, "请提供审核人信息", "A4", "审核人未登录");

	private String code;
	private String desc;
	private Integer errorCode;
	private String errorMsg;

	MerEnum(Integer errorCode, String errorMsg, String code, String desc) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.code = code;
		this.desc = desc;
	}

	public MerEnum find(String code) {
		for (MerEnum m : MerEnum.values()) {
			if (code.equals(m.getCode())) {
				return m;
			}
		}
		return null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
