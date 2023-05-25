package org.com.ch07ch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ch16lotto {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> is = new HashSet<Integer>();
		System.out.println("--------lotto--------");
		while(is.size()<6) {
			is.add(1+r.nextInt(45));
		}
		
		Iterator<Integer> lo = is.iterator();
		while(lo.hasNext()) {
			System.out.println(lo.next()+"");
		}
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.addAll(is);
		Collections.sort(arr);
		//System.out.println(arr);


	}

}
