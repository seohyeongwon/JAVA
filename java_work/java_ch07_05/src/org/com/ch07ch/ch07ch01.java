package org.com.ch07ch;

import java.util.Arrays;

public class ch07ch01 {
	
	static void print(int ... nums) {
		System.out.println(nums.length+"\t");
		System.out.println(Arrays.toString(nums)+"\t");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
		print(20,30);
		print(40,50,60);
		print(70,80,90,100);
	}

}
