package com.lyz.common.mainstr.sub;

import java.util.HashMap;
import java.util.Map;

public class Sub {

	public static void main(String[] args) {
		
		String str="dCcJnIOX:ZDPF:1"; 
		     String[] strarray=str.split(":"); 
		     for (int i = 0; i < strarray.length; i++) 
		          System.out.println(strarray[i]); 
		
//		Object value = "dCcJnIOX:ZDPF:1";
//		String str = value.toString();
//		
//		Map<String, Object> hm = new HashMap<String, Object>();
//		hm.put("code", str.substring(0, str.indexOf(":")));
//		hm.put("itemCode", str.substring(str.indexOf(":")+1));
//		System.out.println(hm.toString());
	}

}
