package com.lyz.common.tool;

import java.util.HashMap;
import java.util.Map;

import com.lyz.common.tool.scaffold.ScaffoldGen;

public class ScaffoldGenerator {
	// public static String DB_URL =
	// "jdbc:mysql://localhost:3306/wuliu_order?useUnicode=true&characterEncoding=utf8";
	// public static String DB_URL =
	// "jdbc:mysql://localhost:3306/wuliu_user?useUnicode=true&characterEncoding=utf8";
	// public static String DB_URL =
	// "jdbc:mysql://localhost:3306/wuliu_trace?useUnicode=true&characterEncoding=utf8";
	// public static String DB_URL =
	// "jdbc:mysql://localhost:3306/wuliu_lingdan?useUnicode=true&characterEncoding=utf8";
	public static String DB_URL = "jdbc:mysql://localhost:3306/lyztest?useUnicode=true&characterEncoding=utf8";
	public static String DB_USERNAME = "root";
	public static String DB_PASSWORD = "123456";

	public static String COMPANY_NAME = "lyz";
	public static String ROOT_PATH = "D:/officeware/eclipse/workespace2/lige/";
	// public static String ROOT_PATH = "E:/src/zd/zhidian-wuliu/";
	// public static String ROOT_PATH = "D:/gitWorkSpaceV2/zhidian-wuliu/";

	// public static String moduleName = "order";
	// public static String moduleName = "zhongbao";
	// public static String moduleName = "carebox/";
	// public static String moduleName = "user";
	public static Map<String, String> pathMap = new HashMap<String, String>() {
		{
			put("Model.txt", ROOT_PATH);
			put("SqlMap.txt", ROOT_PATH);
			put("Dao.txt", ROOT_PATH);
			put("DaoImpl.txt", ROOT_PATH);
			put("Service.txt", ROOT_PATH);
			put("ServiceImpl.txt", ROOT_PATH);
			// put("Controller.txt", ROOT_PATH);
		}
	};

	public static void main(String[] args) {
		// arg1 子系统名
		// arg2 业务对象名,即Model,双词以上要求单词首字大写
		// arg3 表名
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "OrderDriver","order_driver");
		ScaffoldGen generator = new ScaffoldGen("cabox", "Carbox2", "Carbox2");

		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "OrderDriverPackage","order_driver_package");
		// ScaffoldGen generator = new ScaffoldGen("user.account",
		// "IdentityVerifyLog","wuliu_user_idverify_log");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "Driver","driver");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.order",
		// "OrderZhongBao", "order_zhongbao");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.qishi", "Qishi",
		// "qishi");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "OrderDriverPackage","order_driver_package");
		// ScaffoldGen generator = new ScaffoldGen("user.account",
		// "IdentityVerifyLog","wuliu_user_idverify_log");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "OrderDriver","order_driver");
		// ScaffoldGen generator = new ScaffoldGen("user.core",
		// "WuliuUserMerchant", "wuliu_user_merchant");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.driver",
		// "Driver","driver");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.order",
		// "OrderZhongBao", "order_zhongbao");
		// ScaffoldGen generator = new ScaffoldGen("zhongbao.qishi", "Qishi",
		// "qishi");

		// true 控制台 false 文件
		generator.execute(false);
	}

}
