package com.lyz.common.dynamic;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.lyz.common.util.dynmic.DynamicDataSourceHolder;

//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//	@Override
//	protected Object determineCurrentLookupKey() {
//		return DataSourceContextHolder.getDataSourceType();
//	}
//	
//}

public class DynamicDataSource extends AbstractRoutingDataSource {

	private transient Logger log = LoggerFactory.getLogger(this.getClass());

	/** 写数据源 */
	private Object masterDataSource;

	/** 多个读数据源 */
	private Map<Object, DataSource> slaveDataSources;

	/** 读数据源个数 */
	private int slaveDataSourceSize;

	/** 获取读数据源方式，0：随机，1：轮询 */
	private int slaveDataSourcePollPattern = 0;

	private AtomicLong counter = new AtomicLong(0);

	private static final Long MAX_POOL = Long.MAX_VALUE;

	private final Lock lock = new ReentrantLock();

	@Override
	public void afterPropertiesSet() {
		if (this.masterDataSource == null) {
			throw new IllegalArgumentException("Property 'masterDataSource' is required");
		}
		/* setDefaultTargetDataSource(masterDataSource); */
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		targetDataSources.put(DataSourceEnum.MASTER.getValue(), masterDataSource);
		if (slaveDataSources.isEmpty()) {
			slaveDataSourceSize = 0;
		} else {
			for (Map.Entry<Object, DataSource> entry : this.slaveDataSources.entrySet()) {
				targetDataSources.put(entry.getKey(), entry.getValue());
			}
			slaveDataSourceSize = slaveDataSources.size();
		}
		setTargetDataSources(targetDataSources);
		super.afterPropertiesSet();
	}

	@Override
	protected Object determineCurrentLookupKey() {

		DataSourceEnum dse = DynamicDataSourceHolder.getDataSourceKey();

		if (dse == null || dse == DataSourceEnum.MASTER || slaveDataSourceSize <= 0) {
			return DataSourceEnum.MASTER.getValue();
		}

		int index = 1;

		if (slaveDataSourcePollPattern == 1) {
			// 轮询方式
			long currValue = counter.incrementAndGet();
			if ((currValue + 1) >= MAX_POOL) {
				try {
					lock.lock();
					if ((currValue + 1) >= MAX_POOL) {
						counter.set(0);
					}
				} finally {
					lock.unlock();
				}
			}
			index = (int) (currValue % slaveDataSourceSize);
		} else {
			// 随机方式
			index = ThreadLocalRandom.current().nextInt(0, slaveDataSourceSize);
		}
		log.info("被选中的从数据库为:{}", dse.getValue() + index);
		return dse.getValue() + index;
	}

	public void setMasterDataSource(Object masterDataSource) {
		this.masterDataSource = masterDataSource;
	}

	public void setSlaveDataSources(Map<Object, DataSource> slaveDataSources) {
		this.slaveDataSources = slaveDataSources;
	}

	public void setSlaveDataSourcePollPattern(int slaveDataSourcePollPattern) {
		this.slaveDataSourcePollPattern = slaveDataSourcePollPattern;
	}

}
