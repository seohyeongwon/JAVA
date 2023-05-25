package org.comstudy.ch04homework;

import java.util.Arrays;
import java.util.Random;


public class ch04home {
	//상수선언
	public static final int SIZE = 3;
	public static final int MAX = 6;
	public static final Random rand = new Random();

	public static void main(String[] args) {
		int[] lotto = new int[SIZE];
		int idx = 0;
		while (idx < SIZE){
			//System.out.println(idx);
			//idx 첨자 몇 번째 
			lotto[idx]=1+rand.nextInt(MAX);//1~45
			for(int j=0;j<idx;j++) {
				if (lotto[idx]==lotto[j]) {
					idx--;
					break;
				}
			}
			idx++;
		}
		//배열에 저장된 요소값 확인
//		for(int i=0; i<SIZE; i++) {
//			System.out.printf("%d\t", lotto[i]);
//		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

}
