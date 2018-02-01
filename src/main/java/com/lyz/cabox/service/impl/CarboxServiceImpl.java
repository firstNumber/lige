package com.lyz.cabox.service.impl;

import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.cabox.dao.CarboxDao;
import com.lyz.cabox.model.Carbox;
import com.lyz.cabox.service.CarboxService;
import com.lyz.common.dao.BaseDao;
import com.lyz.common.service.impl.BaseServiceImpl;

@Service("carboxService")
public class CarboxServiceImpl extends BaseServiceImpl<Carbox> implements CarboxService {

	@Autowired
	private CarboxDao carboxDaoImpl;

	@Override
	public BaseDao<Carbox> getBaseDao() {
		return carboxDaoImpl;
	}

	@Override
	public void updateBoxleng() {
		java.util.Map<String, Object> map = new HashMap<>();
		map.put("id", 1);
		map.put("oldstatus", 51);
		map.put("updateTime", new Date());
		map.put("status", 57);
		int i = carboxDaoImpl.updateBoxleng(map);

		System.out.println("================拆单============" + i);

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
		// int i = update(carbox);
		// int i = carboxDaoImpl.updateBoxleng(carbox);
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println("=============接单成功=================" + i);
	}
}
