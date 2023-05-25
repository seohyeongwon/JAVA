package org.comstudy.ch04homework;

import java.util.Arrays;
import java.util.Random;

import jdk.jfr.BooleanFlag;

public class ch04home02 {
	public static final int SIZE = 6;
	public static final int MAX = 45;
	public static final Random rand = new Random();

	public static void main(String[] args) {
		int[] lotto = new int[SIZE];
		
		for(int i=0;i<SIZE;) {
			int number = 1+rand.nextInt(MAX);
			//중복 잇나 없나 비교
			//종복 체크 위해 flag = false
			Boolean flag = true;
			for (int j = 0; j < i; j++) {
				//num와 lotto의 j번째 if
				if(number == lotto[j]) {
					flag = false;
					break;
				}	
			}
			if(flag) {
				lotto[i] = number;
				i++;
			}
			//중복없음 입력
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
