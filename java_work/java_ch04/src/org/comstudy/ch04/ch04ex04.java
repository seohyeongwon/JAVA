package org.comstudy.ch04;

import java.util.Arrays;

public class ch04ex04 {

	public static int[] concatArrr(int[] a1, int[] a2) {
		int[] result = new int[a1.length + a2.length];
		for (int i = 0; i < result.length; i++) {
			if(i<3) {
				result[i]=a1[i];
			}else {
				result[i]=a2[i-3];
			}	
			System.out.print(result[i]);
		}
		return result;
	}
	
	public static int[] sumArr(int[] a1, int[] a2) {
		int[] result = new int[a2.length];
		for (int i = 0; i < result.length; i++) {
			if(i<3) {
				result[i]= a1[i] + a2[i];
			}else {
				result[i]= a2[i];
			}
			System.out.println(result[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a1 = { 10, 20, 30 };
		int[] a2 = { 40, 50, 60, 70 };

		int[] a3 = concatArrr(a1, a2);
	    int[] a4 = sumArr(a1, a2);
		//50 70 90 0+70

		System.out.println(Arrays.toString(a4));
		// 10 20 30 40 50 60 70
	}

}
