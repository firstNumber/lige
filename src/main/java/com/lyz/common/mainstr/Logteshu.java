package com.lyz.common.mainstr;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.lyz.common.mainstr.model.TestJson;

public class Logteshu {
	private Logger logger = Logger.getLogger(Logteshu.class);
	
	public void query(){
		
	}
	public void calcNodePrice(TestJson originshortNode, List<TestJson> shortNodeList) {
		Iterator<TestJson> it = shortNodeList.iterator();
		if(originshortNode.getStr().equals("小明")){
			return;
		}
		TestJson a= it.next();
		while(it.hasNext()){
			it.remove();
			calcNodePrice(a,shortNodeList);
		}
	}
}
