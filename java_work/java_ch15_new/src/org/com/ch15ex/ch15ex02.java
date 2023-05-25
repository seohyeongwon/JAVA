package org.com.ch15ex;

import java.util.StringTokenizer;

public class ch15ex02 {

	public static void main(String[] args) {
		String str2= "1|김범준|프로그래머|38";
		
		StringBuffer strbf = new StringBuffer();
		
		strbf.append(str2);
		strbf.append("|qweqwe@nasd.com");
		System.out.println(strbf);
		
		String s = "프로그래머";
		int st = strbf.indexOf(s);
		int end = st + s.length();
		strbf.replace(st, end, "qweas");
		
		
		System.out.println(strbf);
	      // 프로그래머 -> 개발자 변경
	     
	      strbf.replace(st, end, "예술가");
	      System.out.println(strbf);
	      
	      strbf.delete(strbf.indexOf("예술가"), strbf.indexOf("예술가")+"예술가".length());
	      
	      System.out.println(strbf);
	      
	      String str1 = "1|임명철|교육생|29|경기도 성남시 중원구 성남동";
	      
	      // 문자열을 분해하기
	      StringTokenizer strtkz = new StringTokenizer(str1, "| ");
	      while(strtkz.hasMoreTokens()) {
	         System.out.println(strtkz.nextToken());
	      }

	}
	
	public static void main1(String[] args) {
		String str1= "1|김범준|프로그래머|38";
		
		int idx = str1.indexOf("프로그래머");
		System.out.println("idx = "+idx);
		
		str1.replace("프로그래머", "개발자");
		System.out.println(str1);

	}

}
