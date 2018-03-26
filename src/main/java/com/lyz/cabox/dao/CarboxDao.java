package com.lyz.cabox.dao;

import com.lyz.cabox.model.Carbox;
import com.lyz.common.dao.BaseDao;

public interface CarboxDao extends BaseDao<Carbox> {

	public int updateBoxleng(Carbox carbox);

}
