package org.com.ch07ch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class ch16ex01_2 {

	public static void main(String[] args) {
		HashSet<String> is = new HashSet<String>();
		
		is.add("1");
		is.add("2");
		is.add("3");
		is.add("4");
		is.add("5");
		is.add("3");
		is.add("6");
		
		System.out.println("is>>>"+is.size());
		
		Iterator<String> qwe = is.iterator();
		while(qwe.hasNext()) {
			System.out.println(qwe.next());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		
		String[] asd = new String[is.size()];
		is.toArray(asd);
		
		System.out.println(Arrays.toString(asd));
	}

}
