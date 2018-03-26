package com.lyz.cabox.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.cabox.dao.CarboxDao;
import com.lyz.cabox.model.Carbox;
import com.lyz.cabox.service.Carbox2Service;
import com.lyz.cabox.service.CarboxService;
import com.lyz.common.dao.BaseDao;
import com.lyz.common.service.impl.BaseServiceImpl;

@Service("carboxService")
public class CarboxServiceImpl extends BaseServiceImpl<Carbox> implements CarboxService {

	@Autowired
	private Carbox2Service carbox2Service;
	@Autowired
	private CarboxDao carboxDaoImpl;

	@Override
	public BaseDao<Carbox> getBaseDao() {
		return carboxDaoImpl;
	}

	@Override
	public void updateBoxleng() {
		Carbox carbox = new Carbox();
		carbox.setStauts(100);
		carbox.setCreateTime(new Date());
		carboxDaoImpl.updateBoxleng(carbox);
	}

	@Override
	public void updateBoxleng2() {
		Carbox carbox = findUniqueBy("stauts", 51);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(carbox.toString());
		carbox.setStauts(52);
		int i = carboxDaoImpl.updateBoxleng(carbox);

		System.out.println("=============接单成功=================" + i);
	}
}
