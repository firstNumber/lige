package com.lyz.cabox.dao.impl;

import org.springframework.stereotype.Repository;

import com.lyz.cabox.dao.CarboxDao;
import com.lyz.cabox.model.Carbox;
import com.lyz.common.dao.impl.BaseDaoImpl;

@Repository("carboxDaoImpl")
public class CarboxDaoImpl extends BaseDaoImpl<Carbox> implements CarboxDao {

	@Override
	public int updateBoxleng(Carbox carbox) {
		return this.getSqlSession().update("updateStatus", carbox);
	}

}
