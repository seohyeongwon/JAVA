package org.comstudy.ch04homework;

import java.util.Arrays;
import java.util.Random;

public class ch04home04 {
	public static final int SIZE = 6;
	public static final int MAX = 12;
	public static final Random rand = new Random();
	public static final int[] lotto = new int[SIZE];
	public static final int[] ball = new int[MAX];
	static {
		for (int num = 1; num <= MAX; num++) {
			ball[num - 1] = num;
		}
	}

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(ball));
		// 볼의 랜덤한 위치에서 넘을 뽑음
		// 6번 반복
		// 뽑은 위치 0으로 표시
		for (int i = 0; i < SIZE;) {
			int idx = rand.nextInt(MAX);
			if (ball[idx] != 0) {

				lotto[i] = ball[idx];
				ball[idx] = 0;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(ball));
		System.out.println(Arrays.toString(lotto));
	}

}
