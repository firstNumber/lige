package com.lyz.user.service;

import com.lyz.common.dynamic.DataSource;
import com.lyz.user.model.Carbox;

public interface DynamicService {
	@DataSource(name=DataSource.salveDataSource)
	public Carbox querycar();
}
