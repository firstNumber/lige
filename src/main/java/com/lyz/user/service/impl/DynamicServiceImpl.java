package com.lyz.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.common.dao.BaseDao;
import com.lyz.common.dynamic.DataSource;
import com.lyz.common.service.impl.BaseServiceImpl;
import com.lyz.user.dao.CarboxDao;
import com.lyz.user.model.Carbox;
import com.lyz.user.service.DynamicService;

@Service("dynamicService")
public class DynamicServiceImpl extends BaseServiceImpl<Carbox> implements DynamicService {
	@Autowired
	private CarboxDao carboxDaoImpl;

	@Override
	public BaseDao<Carbox> getBaseDao() {
		return carboxDaoImpl;
	}

	@Override
	public Carbox querycar() {
		return carboxDaoImpl.querycarbox();
	}

}
