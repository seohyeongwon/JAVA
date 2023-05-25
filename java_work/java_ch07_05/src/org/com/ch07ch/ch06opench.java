package org.com.ch07ch;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class ch06opench {
	
	static String readString() {
	      System.out.println("영어 적고 점 찍어");
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
	      
	      while(true) {
	         String line = scan.nextLine();
	         if(".".equals(line)) break;
	         sb.append(line);
	      }
	      return sb.toString();

	}

	public static void main(String[] args) {
		int[] chArr = new int['Z'-65+1];
		
		Hashtable<String, String> histo = new Hashtable<String, String>();
		String res= readString().toUpperCase();
		
	    System.out.println("\n그린다???");
		for (int i = 0; i < chArr.length; i++) {
			String key = "" + (char)(i+65);
			histo.put(key,"");
		}
		
	      for(int i=0;i<res.length();i++) {
	          String key = res.charAt(i)+"";
	          histo.put(key, histo.get(key)+"♨");
	       }

		
		for (int i = 0; i<='Z'-65; i++) {
			String key = "" + (char)(i+65);
			System.out.println(key+ " : "+histo.get(key));
		}
		//System.out.println(Arrays.toString(chArr));
		
	}

}
