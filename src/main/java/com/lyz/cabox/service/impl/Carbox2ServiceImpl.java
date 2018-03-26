package com.lyz.cabox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.common.service.impl.BaseServiceImpl;
import com.lyz.common.dao.BaseDao;
import com.lyz.cabox.dao.Carbox2Dao;
import com.lyz.cabox.model.Carbox2;
import com.lyz.cabox.service.Carbox2Service;


@Service("carbox2Service")
public class Carbox2ServiceImpl extends BaseServiceImpl<Carbox2> implements Carbox2Service{

	@Autowired
	private Carbox2Dao carbox2DaoImpl;
	
	@Override
	public BaseDao<Carbox2> getBaseDao() {
		return carbox2DaoImpl;
	}
}
