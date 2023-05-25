package org.comstudy.ch04;

import java.util.Arrays;

public class ch04ex03 {

	public static void reverse(int[] arr2) {
		for (int i = 0; i < arr2.length / 2; i++) {
			// i 치환
			int tmp = arr2[i];
			arr2[i] = arr2[(arr2.length - 1) - i];
			arr2[(arr2.length - 1) - i] = tmp;
			//System.out.println(Arrays.toString(arr2));
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		reverse(arr);

		System.out.println(Arrays.toString(arr));
	}

	public static void main1(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		reverse(arr);

		System.out.println(Arrays.toString(arr));

		int[] arr2 = arr;
		arr2[0] *= 100;
		arr2[1] *= 200;
		arr2[2] *= 300;
		arr2[3] *= 400;
		arr2[4] *= 500;
		System.out.println("arr>>" + Arrays.toString(arr));
		System.out.println("arr2>>" + Arrays.toString(arr));

		int[] arr3 = arr;
		arr3[0] *= 100;
		arr3[1] *= 200;
		arr3[2] *= 300;
		arr3[3] *= 400;
		arr3[4] *= 500;
		System.out.println("arr3>>" + Arrays.toString(arr));
	}

}
