package org.com.ch07ch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ch16ex01 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("3");
		set.add("6");
		
		System.out.println("set>>>>"+ set.size());
		
		//열거자 - iterator
		Iterator<String> items= set.iterator();
		while(items.hasNext()) {
			System.out.println(items.next());
		}
		System.out.println("==================");
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
