package Ch03_;

import java.util.Arrays;
import java.util.Scanner;


public class ch03ex10 {
	   static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		   System.out.print("배열의 크기: ");
		      int size = scan.nextInt();
		      int[] arr = new int[size];
		      System.out.println("arr.length => " + arr.length);
		      // 배열의 크기만큼 반복해서 정수 입력 후 배열에 저장.
		      int sum = 0;
		      for(int i=0; i<arr.length; i++) {
		         System.out.print(i+1+"번째 요소 입력: ");
		         arr[i] = scan.nextInt();
		         sum+=arr[i];
		      }
		      System.out.println(Arrays.toString(arr));
		      System.out.println("sum => " + sum);
		   }


	}


