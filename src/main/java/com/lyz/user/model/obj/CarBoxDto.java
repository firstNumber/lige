package com.lyz.user.model.obj;

public class CarBoxDto {
	private Integer id;
	private Integer boxLength;
	private java.util.Date createTime;
	private String type = "dto";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBoxLength() {
		return boxLength;
	}

	public void setBoxLength(Integer boxLength) {
		this.boxLength = boxLength;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarBoxDto [id=" + id + ", boxLength=" + boxLength + ", createTime=" + createTime + ", type=" + type
				+ "]";
	}
}
