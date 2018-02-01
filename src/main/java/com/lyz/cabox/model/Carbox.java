package com.lyz.cabox.model;

import java.io.Serializable;

public class Carbox implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer boxLength;
	private Integer stauts;
	private java.util.Date createTime;
	private java.util.Date updateTime;

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

	public Integer getStauts() {
		return stauts;
	}

	public void setStauts(Integer stauts) {
		this.stauts = stauts;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Carbox [id=" + id + ", boxLength=" + boxLength + ", stauts=" + stauts + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}

}
