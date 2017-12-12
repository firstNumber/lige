package com.lyz.user.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.support.FormattingConversionServiceFactoryBean;
import org.springframework.stereotype.Service;

import com.lyz.common.cache.CacheMan;
import com.lyz.common.dao.BaseDao;
import com.lyz.common.mq.send.Rabbit;
import com.lyz.common.mq.util.RabbitQueue;
import com.lyz.common.service.impl.BaseServiceImpl;
import com.lyz.user.dao.CarboxDao;
import com.lyz.user.model.Carbox;
import com.lyz.user.service.CarboxService;


@Service("carboxService")
public class CarboxServiceImpl extends BaseServiceImpl<Carbox> implements CarboxService{

	@Autowired
	private CarboxDao carboxDaoImpl;
	
	FormattingConversionServiceFactoryBean dateConversionService;
	
	@Override
	public BaseDao<Carbox> getBaseDao() {
		return carboxDaoImpl;
	}

	@Override
	public void newRedis() {
		CacheMan.postLock("lyz001", 100);
		String key =CacheMan.get("lyz123", String.class);
		CacheMan.unLock("lyz001");
		Carbox carbox = new Carbox();
		carbox.setBoxLength(18);
		carbox.setCreateTime(new Date());
		Rabbit.send(RabbitQueue.LIGE_RABBITMQ, carbox);
		
	}
	
	
}
