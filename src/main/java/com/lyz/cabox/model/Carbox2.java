package com.lyz.cabox.model;

import java.io.Serializable;

public class Carbox2 implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer boxleng;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBoxleng() {
		return boxleng;
	}

	public void setBoxleng(Integer boxleng) {
		this.boxleng = boxleng;
	}

}
