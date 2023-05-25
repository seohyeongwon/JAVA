package org.com.ch16ex;

import java.util.HashMap;
import java.util.Iterator;

public class ch16ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("홍길동", "010-1111-1111");
		map.put("막하동", "010-1113-1111");
		map.put("걸", "010-1112-1111");
		map.put("개길동", "010-1114-1111");
		map.put("밈길동", "010-1115-1111");
		map.put("뱍길동", "010-1116-1111");
		
		Iterator<String>  keys= map.keySet().iterator();
		while(keys.hasNext()) {
		      String key = keys.next();
		      System.out.println(key + " : " + map.get(key));
		}
		}

}
