package org.comstudy.ch04homework;

import java.util.Arrays;
import java.util.Random;

public class ch04home03 {
	public static final int SIZE = 6;
	public static final int MAX = 6;
	public static final Random rand = new Random();
	
	public static void main(String[] args) {
		int[] lotto = new int[SIZE];
		
		for(int i =0;i<SIZE;i++) {
			lotto[i] = 1+rand.nextInt(MAX);
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					lotto[i]=1+rand.nextInt(MAX);
					//다시 초기화
					j=-1;
					//i--;
					//break;
				
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
