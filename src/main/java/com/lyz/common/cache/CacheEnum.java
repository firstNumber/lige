package com.lyz.common.cache;

import org.apache.commons.lang.StringUtils;

public enum CacheEnum {
	ZB_COMP_BATCH_SIZE("orderZhongBaoService", 0), // 众包公司压单批次的数量
	/**
	 * 众包公司上次压单时间
	 */
	ZB_COMP_BATCH_LAST_TIME("", 0), // 众包公司压单批次的数量
	ZB_BATCH_LAST_QISHI("", 0), // 众包 公司上一批次配送的骑士ID
	/**
	 * 众包站点上次配送骑士ID
	 */
	ZB_SITE_LAST_QISHI("",0),
	/**
	 * 众包骑士订单状态缓存群名
	 */
	ZB_QISHI_ORDER_STATUS("", 0),
	/**
	 * 众包骑士订单状态为18（待抢单人员确认）缓存
	 */
	ZB_QISHI_ORDER_STATUS18_TIME("", 0),
	/**
	 * 众包骑士订单状态为12（待驻仓人员取件）缓存
	 */
	ZB_QISHI_ORDER_STATUS12_TIME("", 0), 
	ZB_BATCH_LAST_SITE("", 0), // 众包 小区上一批次配送的站点ID
	/**
	 * 众包 小区上一批次配送的社区站点ID
	 */
	ZB_BATCH_LAST_SITE_COMM("", 0), 
	ZB_ZONGHECANG_CODE("zongHeCangService", 0), // 众包 小区上一批次配送的站点ID
	ZB_QISHI_TRACE_ORDER_LIST("", 0), // 骑士需要定位订单列表(全局订单号)
	ZB_QISHI_TRACE_LAST_TIME("", 30), // 骑士最后一次定位时间
	
	ZB_DRIVER_TRACE_ORDER_LIST("", 0), // 司机需要定位订单列表(全局订单号)

	DKH_PRIVATE_KEY("customerKeyService", 0), // 大客户权限认证的私钥

	US_TCZB_SITE_ID("companyTczbSiteService", 0), // 用户模块,同城众包站点信息

	QUERY_TRACE_LAST_TIME("", 3600), // 最后一次查询物流轨迹时间
	TOKEN_APP_LC_USER("", 60 * 60 * 24 * 7), // app本地用户token默认有效期
	/**
	 * app本地用户token默认有效期
	 */
	TOKEN_APP_MERCHANT_LC_USER("", 60 * 60 * 24 * 7),
	TOKEN_APP_KICK_USER("", 60 * 60 * 24 * 7), // app被踢掉的用户
	/**
	 * app被踢掉的用户
	 */
	TOKEN_APP_MERCHANT_KICK_USER("", 60 * 60 * 24 * 7),
	TOKEN_APP_EMP_USER("", 60 * 60 * 24 * 7), // app蜘点用户token默认有效期
	TOKEN_APP_EMP_KICK_USER("", 60 * 60 * 24 * 7), // app被踢掉的蜘点用户
	
	TOKEN_KEFU_USER("", 1200), // 用户token默认有效期
	DICT_LIST("dictItemService", 0), // 字典表
	DICT_ITEM("dictItemService", 0), // 字典表
	TRACK_OFFER_YC("trackOfferYcService", 0), // 远成报价表
	TRACK_OFFER_ZT("trackOfferZtService", 0), // 中通报价表
	ORDER_TRACE("", 0), // 订单物流轨迹
	TRACE_ALARM_LIST("alarmExpireService", 0), // 轨迹预警时间列表
	EXPRESS_TYPE_DICT("expressTypeDictService", 0), // 快递类型字典表

	EXPRESS_CODE_LIST("expressCodeService", 0), // 快递公司名称列表
	OFFER_TCKD_LIST("tckdOfferService", 0), // 同城快递报价表
	OFFER_ZTKY_LIST("trackOfferZtkyService", 0), // 中铁报价表

	ZB_ZBHH_BATCH_SIZE("", 0), // 周边好货压单批次的数量
	ZB_ZBHH_COUNT_LIST("", 0), // 周边好货压单池分组数量
	/**
	 * 代理商授权码
	 */
	U_MERCHANT_AUTH_CODE("",0),
	/**
	 * 代理商验证码
	 */
	U_MERCHANT_VERIFY_CODE("", 0),
	/**
	 * 代理商验证码（注册）
	 */
	U_MERCHANT_VERIFY_CODE_REGISTER("", 0),
	/**
	 * 代理商app发送验证码数量（注册）
	 */
	U_MERCHANT_VERIFY_CODE_REGISTER_COUNT("", 0),
	/**
	 * 代理商app发送验证码数量
	 */
	U_MERCHANT_VERIFY_CODE_COUNT("", 0),
	/**
	 * 代理商app发送授权验证码数量
	 */
	U_MERCHANT_AUTH_CODE_COUNT("", 0),
	ZB_DRIVER_BATCH_SIZE("", 0), // 批发通压单池分组数量
	ZB_DRIVER_COUNT_LIST("", 0), // 批发通压单池分组集合

	REG_IMAGE_CODE("", 60 * 5), // 图像验证码
	
	PCLIST("provinceService",0), //全量省市县
	PROVINCE_CODE("provinceService",0),
	PROVINCE_NAME("provinceService",0), 
	CITY_CODE("cityService",0),
	CITY_NAME("cityService",0),
	AREA_CODE("areaService",0),
	AREA_NAME("areaService",0),
	;
	private String serviceName;
	private int cacheSecond;

	/**
	 * <p>
	 * 缓存名称
	 * </p>
	 * 
	 * @param serviceName
	 *            缓存对应的serviceName名称,如果为null或"",则代表不需要去service查询
	 *            ,对应的service需要重写get4CacheFactory方法
	 * @param cacheSecond
	 *            默认缓存的时间,单位秒,0代表无限制
	 */
	CacheEnum(String serviceName, Integer cacheSecond) {
		this.serviceName = serviceName;
		this.cacheSecond = cacheSecond;
	}

	public String getServiceName() {
		return serviceName;
	}

	public int getCacheSecond() {
		return cacheSecond;
	}

	/**
	 * 是否包含这个缓存名称,如果包含则返回,否则返回null
	 * 
	 * @param cacheName
	 * @return
	 * @Author: wangxingfei
	 * @Date: 2016年5月17日
	 */
	public static CacheEnum contains(String cacheName) {
		if (StringUtils.isNotBlank(cacheName)) {
			for (CacheEnum cn : CacheEnum.values()) {
				if (cn.toString().equals(cacheName)) {
					return cn;
				}
			}
		}
		return null;
	}
}
