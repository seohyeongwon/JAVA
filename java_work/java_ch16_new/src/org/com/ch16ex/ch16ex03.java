package org.com.ch16ex;

import java.util.ArrayList;
import java.util.HashMap;

public class ch16ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      HashMap<String, Object> saram1 = new HashMap<String, Object>();
	      saram1.put("no", 1);
	      saram1.put("name", "홍길동");
	      saram1.put("phone", "010-1234-5678");
	      saram1.put("email", "hong@saram.com");
	      
	      HashMap<String, Object> saram2 = new HashMap<String, Object>();
	      saram2.put("no", 2);
	      saram2.put("name", "김길동");
	      saram2.put("phone", "010-1234-5555");
	      saram2.put("email", "kim@saram.com");
	      
	      HashMap<String, Object> saram3 = new HashMap<String, Object>();
	      saram3.put("no", 3);
	      saram3.put("name", "박길동");
	      saram3.put("phone", "010-1234-6666");
	      saram3.put("email", "park@saram.com");
	      
	      ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
	      list.add(saram1);
	      list.add(saram2);
	      list.add(saram3);
	      System.out.println(saram1);
	      System.out.println(saram2);
	      System.out.println(saram3);


	}

}
