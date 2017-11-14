package com.lyz.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.lyz.common.dao.impl.BaseDaoImpl;
import com.lyz.user.dao.CarboxDao;
import com.lyz.user.model.Carbox;

@Repository("carboxDaoImpl")
public class CarboxDaoImpl extends BaseDaoImpl<Carbox> implements CarboxDao {

}
