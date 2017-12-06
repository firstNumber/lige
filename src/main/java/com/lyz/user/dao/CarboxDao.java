package com.lyz.user.dao;

import com.lyz.common.dao.BaseDao;
import com.lyz.common.dynamic.DataSource;
import com.lyz.user.model.Carbox;



public interface CarboxDao extends BaseDao<Carbox>{
	 public Carbox  querycarbox();
}

