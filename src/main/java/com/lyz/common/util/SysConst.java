package com.lyz.common.util;

import org.apache.commons.lang.StringUtils;

/**
 * 一些常量
 */
public class SysConst {
	public static final String APP_RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDAhu++B7ERRJmSh4oQtcdGYDFRBMimuB+25fmiLgXZEa9KIlFTohIdsNKG8+vAs3GD5IGzzvfaJRvF5tZMxETU7hm9VEljmjx3+3zMzFOT+vgkqRuliSqOA1OnuosC6mcfT32V/EJ+9TvyYdwD73FxWuFK3RNMtz8zFrxgJLvk8QIDAQAB";
	public static final String APP_RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAMCG774HsRFEmZKHihC1x0ZgMVEEyKa4H7bl+aIuBdkRr0oiUVOiEh2w0obz68CzcYPkgbPO99olG8Xm1kzERNTuGb1USWOaPHf7fMzMU5P6+CSpG6WJKo4DU6e6iwLqZx9PfZX8Qn71O/Jh3APvcXFa4UrdE0y3PzMWvGAku+TxAgMBAAECgYBzj0rNjD5a+AsZ6aMUfpebBVf0omNxtqjKlmVtVCSMc1H8tHaONYScL6td94D1TIABQ6IadEtOs+Fkuza8Iz6QacrLMWtkiSejuFg6nEtW8J5sm6fsqyhh7qKcvNhgEKpeuihKu+aGOledvnYhz0QjVfl18Kw6iKnQluc8VpiDRQJBAN6Rlon2IG/eokDW5kRmca/jz5ybhU1nozefaaB7f89OuPf0YX8MM6Xz13Sjfmv2HsOMOkqC+ratQao7BxP/AicCQQDdcilaYS0tqIvHwVaFfiCy+aRYv+1LuzsVSp+8gl69VxMSAXpHOkayTMVQrMG9x5CcQpORinmTyETjm11jQIcnAkAa/fUPzjWo24s56dYLPZFUD4DCMWo9NPBqcn7Q46lgbt+n0o9wZP5uhd//WUSfuz2H4Z3AI5pcRS7NglMdbbPJAkEAy9kwehNkjFhQPFUcuYwuu7KU+GHNJl63d9UXEGgOoEtMsdGMZ48czztek/JD8tiHpWCgCWUon8LGr6Mwp5IaFwJBAJR2Bqu5rP65Omiwt4UVYNUkDzIZTLjHYjwvazpzVc1pEnCgf6VGTWgvS2NzttiUSKLLYcsMajVjymVbXQEr6PM=";
	/**
	 * 代理商app获取短信验证码私钥
	 */
	public static final String APP_MERCHANT_RSA_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMHphRPAESGNCA7TFJUpz68A+DrqLDyjc5YNtqCy7mvCE+eLrfXnDh7FjnuQ6UxF/pxAVhoz7kX8SKMHUC0bK/a5B8Sv+A0UbpKHED7wEtwaoolAH+gPyTeNo0BijhQAR9SHBFlVLSa66bsYXOGRKaxPAqtd8vwVgYvtHf0CeE/BAgMBAAECgYB+Yg7EEpiXv22TC+wMVBXyP7WJ4Ho4g2egUwvGrRhLz1Bdx2H4NUG0uJnm20nS1oPdnuj/Zv1TS9yjtO6Cl4UMxEUm975s5NpawntWdFWQ61wnBwLlchb2sVropN78lAGraD7xzQlNQ9EBjG8Y7gICZN+hgJ0oQc89QUkhnCR+AQJBAOmsfzzHbj4QMVXvxNFrK1EpCuWSW3SBMRt7x5L1CBclaqfdYsT76AnobTnnBShJbIPr6Q+onH5I8da0uWlwMJECQQDUcHr3GGEoe2ns2ZslI8T3kasd+Pu6uFLrTmF5YTQrBhq/ezGDk2PkNe36jaiMb1UBJhZ2hqMnaYNkwQNp0MQxAkBicMn1d+qoeLfgBS98LdLE0S6HAj5G+XoPovizn0h2P8wLxccrRxg8vE7verSAgVYWyVaYwyaSSPagxefqVFoRAkB4NwZ+mX8xh1UTwLg4thsZ9YaduW3J5dCWc45ZP5Zj2lp8jNwiFt/qHlKC/HKqtb2mnsULYXkmLmE6PLcPxCGhAkEAv+l527k558AylXK4ja8mw/fXHf5pqgbxmkLh6TD309P+NuTNDQcQRL9S4AYfAtayJWdxOHcvZPRuG8mkUWiUeg==";
	/**
	 * 代理商app获取短信验证码公钥
	 */
	public static final String APP_MERCHANT_RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDB6YUTwBEhjQgO0xSVKc+vAPg66iw8o3OWDbagsu5rwhPni6315w4exY57kOlMRf6cQFYaM+5F/EijB1AtGyv2uQfEr/gNFG6ShxA+8BLcGqKJQB/oD8k3jaNAYo4UAEfUhwRZVS0muum7GFzhkSmsTwKrXfL8FYGL7R39AnhPwQIDAQAB";
	// public static final String KD_COMP_NAME_ZT = "中通";
	// public static final String KD_COMP_NAME_EMS = "EMS";
	// public static final String KD_COMP_CODE_ZT = "zhongtong";
	// public static final String KD_COMP_CODE_EMS = "ems";
	public static final String LD_COMP_NAME_YC = "远成物流";
	public static final String LD_COMP_CODE_YC = "yuancheng";
	// public static final String KD_COMP_CODE_GT = "guotongkuaidi";
	// public static final String KD_COMP_CODE_ST = "shentong";

	/**
	 * 承运类型--第三方合作站点
	 */
	public static final Integer CARRIER_TYPE_THIRD = 333;
	public static final Integer CARRIER_TYPE_ZX = 555;// 专线
	public static final Integer CARRIER_TYPE_DIRECT_FINISH = 111;// 直接完成

	public static final Integer OPERATION_TIME = 3; // 一些更新操作动作默认缓存的秒数,用于防止重复提交
	/**
	 * 验证码有效时间300s
	 */
	public static final Integer VERIFICATION_CODE_TIME = 5 * 60;
	/**
	 * 重新获取验证码时间为50秒
	 */
	public static final Integer PHONE_CODE_OPERATION_TIME = 50;

	public static final Integer TOKEN_VALID_TIME = 1200; // token有效期,20分钟
	public static final Integer TOKEN_VALID_TIME_APP = 60 * 60 * 24 * 7; // app-token有效期,7天

	public static final Integer GENERAL_USER = 1; // 普通用户标识

	public static final Integer COMPANY_USER = 2; // 企业用户标识

	public static final Integer CUSTOMER_USER = 3; // 大客户标识
	/**
	 * 同城众包
	 */
	public static final Integer COMPANY_CONTENT_TCZB = 1;
	/**
	 * 同城快递
	 */
	public static final Integer COMPANY_CONTENT_TCKD = 2;
	/**
	 * 专线公司
	 */
	public static final Integer COMPANY_CONTENT_ZXGS = 3;
	/**
	 * 合同物流公司
	 */
	public static final Integer COMPANY_CONTENT_HTWL = 4;
	/**
	 * 货运公司
	 */
	public static final Integer COMPANY_CONTENT_HYGS = 5;
	/**
	 * 仓储服务
	 */
	public static final Integer COMPANY_CONTENT_CCFW = 6;

	public static final Integer STATUS_COMMON = 1;

	/********************************************* 审核状态 ***********************************************/
	/**
	 * 待审核
	 */
	public static final Integer AUDIT_STATUS_DSH = 1;
	/**
	 * 补充审核
	 */
	public static final Integer AUDIT_STATUS_BCSH = 2;
	/**
	 * 待复审
	 */
	public static final Integer AUDIT_STATUS_DFS = 3;
	/**
	 * 审核不通过
	 */
	public static final Integer AUDIT_STATUS_SHBTG = 4;
	/**
	 * 审核通过
	 */
	public static final Integer AUDIT_STATUS_SHTG = 5;
	/**
	 * 复审通过
	 */
	public static final Integer AUDIT_STATUS_FSTG = 6;
	/**
	 * 撤销
	 */
	public static final Integer AUDIT_STATUS_CX = 7;
	/**
	 * 证件逾期
	 */
	public static final Integer AUDIT_STATUS_ZJYQ = 8;

	/********************************************************************************************/

	/*******************************************
	 * ↓↓↓用户信息↓↓↓
	 ***********************************************/
	public static final String TOKEN_GENERAL_USER = "TOKEN_GUSER"; // 根据token找用户
																	// 普通用户
	public static final String TOKEN_COMPANY_USER = "TOKEN_CUSER"; // 根据token找用户
																	// 企业用户
	public static final String TOKEN_CUSTOMER_USER = "TOKEN_CUSTOMER"; // 根据token找用户
																		// 企业用户
	public static final String TOKEN_AUDIT_USER = "TOKEN_AUDIT"; // 根据token找用户，审核新系统登陆
	/**
	 * 代理商用户
	 */
	public static final String TOKEN_MERCHANT_USER = "TOKEN_MERCHANT"; // 代理商用户

	public static final String TOKEN_APP_PREFIX = "zdws"; // app中token以uid+此为前缀
	/**
	 * 代理商app中token以uid+此为前缀
	 */
	public static final String TOKEN_APP_MERCHANT_PREFIX = "muidc";
	public static final String TOKEN_COMPANY_PREFIX = "cmpy"; // 公司账户中token以uid+此为前缀
	public static final String TOKEN_APP_EMP_PREFIX = "zdme"; // app_emp中token以uid+此为前缀

	/*******************************************
	 * ↑↑↑用户信息↑↑↑
	 ***********************************************/

	public static final Integer EMS_OFFER_CODE = 999999999;

	/**
	 * ********************************* 订单 分类
	 * 
	 * @author: liyongzhen
	 * @createdAt: 2016年8月12日下午5:01:43
	 ********************************** 
	 */
	public enum OrderModuleType {
		KUAIDI, TONGCHENG, ZHENGCHE, LINGDAN, ZBHH;
	}

	/**
	 * 众包单 状态
	 * 
	 * @author: liyongzhen
	 * @createdAt: 2016年8月3日上午10:31:50
	 ********************************** 
	 */
	public enum ZhongBaoOrderStatus {
		待抢单(1), 待取货(2), 待配送(3), 已送达(4), 异常关闭(5), 异常完成(6);
		private Integer value;

		ZhongBaoOrderStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (ZhongBaoOrderStatus qs : ZhongBaoOrderStatus.values()) {
				if (qs.getCode().equals(status)) {
					return qs.toString();
				}
			}
			return null;
		}
	}

	/**
	 * *********************************
	 * 
	 * @Description:用户类型
	 * @author: liyongzhen
	 * @createdAt: 2017年8月30日下午3:06:04
	 ********************************** 
	 */
	public enum UserType {
		普通用户(1), 公司用户(2), 大客户用户(3), 审核系统用户(4);
		private Integer value;

		UserType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

	}

	/**
	 * *********************************
	 * 
	 * @Description: 用户操作类型
	 * @author: liyongzhen
	 * @createdAt: 2017年8月30日下午3:43:05
	 ********************************** 
	 */
	public enum UserOperationType {
		禁用用户(1), 启用用户(2),;
		private Integer value;

		UserOperationType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

	}

	/**
	 * 众包单审核状态
	 */
	public enum ZhongBaoAuditStatus {
		订单未完成(0),
		/**
		 * 确认送达后,进入48小时自动审核时间,如果有投诉,变为客服审核中
		 */
		审核中(1), 审核完成(2), 审核不通过(3),
		/**
		 * 被投诉的订单,需要客服审核
		 */
		客服审核中(4), 异常关闭(5);
		private Integer value;

		ZhongBaoAuditStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 订单来源平台
	 * 
	 * @author: liyongzhen
	 * @createdAt: 2016年8月3日上午11:26:35
	 ********************************** 
	 */
	public enum OrderOrigin {
		// 蜘点生活端,进销存综合仓零售,进销存集采仓零售,合作一件代发,蜘点商家端,蜘点批发端,进销存集采仓批发,个人发单 ,周边好货,社区仓零售
		ZDSH, ERPZHCZYLS, ERPJCCZYLS, HZYJDF, ZDSJ, ZDPF, ERPJCCPF, GRFD, ZBHH, SQCLS;
		// 判断类型是否正确
		public static boolean contains(String type) {
			boolean b = false;
			if (StringUtils.isNotBlank(type)) {
				for (OrderOrigin ft : OrderOrigin.values()) {
					if (ft.toString().equalsIgnoreCase(type)) {
						b = true;
						break;
					}
				}
			}
			return b;
		}
	}

	/**
	 * 客户端 来源 类型 *********************************
	 * 
	 * @author: liyongzhen
	 * @createdAt: 2015年8月19日下午4:07:44
	 ********************************** 
	 */
	public enum FromType {
		web, ios, android;
		// 判断类型是否正确
		public static boolean contains(String type) {
			boolean b = false;
			if (StringUtils.isNotBlank(type)) {
				for (FromType ft : FromType.values()) {
					if (ft.toString().equalsIgnoreCase(type)) {
						b = true;
						break;
					}
				}
			}
			return b;
		}
	}

	/**
	 * 发车类型
	 */
	public enum SendType {
		整车(1), 零担(2), 个人(3);
		private Integer value;

		SendType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 消息场景
	 */
	public enum SceneType {
		抢单提醒(1);
		private Integer value;

		SceneType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		/**
		 * 根据场景值返回消息标题
		 * 
		 * @param sceneType
		 * @return
		 * @Author: xiedonghua
		 * @Date: 2017年8月7日
		 */
		public static String getTitleBySceneType(SceneType sceneType) {
			switch (sceneType) {
			case 抢单提醒:
				return "新订单提醒";
			default:
				return null;
			}
		}

		/**
		 * 根据场景值返回消息内容
		 * 
		 * @param sceneType
		 * @return
		 * @Author: xiedonghua
		 * @Date: 2017年8月7日
		 */
		public static String getContentBySceneType(SceneType sceneType) {
			switch (sceneType) {
			case 抢单提醒:
				return "附近有新订单，请及时查看";
			default:
				return null;
			}

		}

		public static SceneType getByCode(Integer code) {
			for (SceneType s : SceneType.values()) {
				if (s.getCode().equals(code)) {
					return s;
				}
			}
			return null;
		}
	}

	/**
	 * 骑士认证状态
	 */
	public enum QishiStatus {
		审核中(1), 审核通过(2), 审核未通过(3);
		private Integer value;

		QishiStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (QishiStatus qs : QishiStatus.values()) {
				if (qs.getCode().equals(status)) {
					return qs.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 骑士认证类型
	 */
	public enum QishiAuthType {
		个人认证(1), 公司驻仓(2), 公司站点员工(3),;
		private Integer value;

		QishiAuthType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (QishiAuthType qs : QishiAuthType.values()) {
				if (qs.getCode().equals(status)) {
					return qs.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 用户角色
	 */
	public enum UserRole {
		系统管理员(1), 企业管理员(2), 调度员(3),;
		private Integer value;

		UserRole(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 综合仓同步小区操作类型
	 */
	public enum ZhcOperType {
		添加小区信息(1), 修改小区信息(2), 删除小区信息(3),;
		private Integer value;

		ZhcOperType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 交易状态
	 */
	public enum TradeStatus {
		未交易(1), 交易中(2), 交易完成(3), 交易失败(4),;
		private Integer value;

		TradeStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 交易超上限时审核状态
	 */
	public enum TradeAuditStatus {
		审批中(1), 审批通过(2), 审批未通过(3);
		private Integer value;

		TradeAuditStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}
	}

	/**
	 * 司机认证状态
	 */
	public enum DriverStatus {
		审核中(1), 审核通过(2), 审核未通过(3);
		private Integer value;

		DriverStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (DriverStatus ds : DriverStatus.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 司机认证类型
	 */
	public enum DriverAuthType {
		个人认证(1),;
		private Integer value;

		DriverAuthType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (DriverAuthType ds : DriverAuthType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 车辆类型
	 */
	public enum TruckType {
		高栏(1), 厢式货车(2), 冷藏车(3), 平板(4), 其他(5);
		private Integer value;

		TruckType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckType ds : TruckType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}

		public static Integer name2Code(String value) {
			for (TruckType ds : TruckType.values()) {
				System.out.println(ds.value + "====" + ds.getCode());
				if (ds.getCode().equals(value)) {
					return ds.value;
				}
			}
			return null;
		}
	}

	/**
	 * 整车认证类型
	 */
	public enum TruckAuthType {
		个人认证(1), 代理商推荐(2), 司机录入(3),;
		private Integer value;

		TruckAuthType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckAuthType ds : TruckAuthType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 整车推荐类型
	 */
	public enum TruckAgentType {
		代理商(1), 仓库员工(2),;
		private Integer value;

		TruckAgentType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckAgentType ds : TruckAgentType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 整车认证状态
	 */
	public enum TruckStatus {
		审核中(1), 审核通过(2), 审核未通过(3), 待授权(4);
		private Integer value;

		TruckStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckStatus ds : TruckStatus.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 整车绑定类型
	 */
	public enum TruckBindStatus {
		已绑定(1), 未绑定(2);
		private Integer value;

		TruckBindStatus(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckBindStatus ds : TruckBindStatus.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 整车绑定类型
	 */
	public enum TruckBindType {
		人车入驻(1), 司机录入(2), 车辆绑定司机(3);
		private Integer value;

		TruckBindType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckBindType ds : TruckBindType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 整车绑定操作日志类型
	 */
	public enum TruckBindOperType {
		人车绑定(1), 司机绑定车辆(2), 车辆绑定司机(3), 司机解绑车辆(4), 车辆解绑司机(5);
		private Integer value;

		TruckBindOperType(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (TruckBindOperType ds : TruckBindOperType.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}

	/**
	 * 操作人
	 */
	public enum ZbOrderOperationUser {
		发件方, 系统, 定时任务, 管理员, 骑手,;
	}

	/**
	 * 代理级别
	 */
	public enum ProxyLevel {
		省级代理(1), 市级代理(2), 县级代理(3);
		private Integer value;

		ProxyLevel(Integer value) {
			this.value = value;
		}

		public Integer getCode() {
			return this.value;
		}

		public static String code2Name(Integer status) {
			for (DriverStatus ds : DriverStatus.values()) {
				if (ds.getCode().equals(status)) {
					return ds.toString();
				}
			}
			return null;
		}
	}
}
