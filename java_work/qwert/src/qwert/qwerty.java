package qwert;

import java.util.Scanner;

public class qwerty {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("3개의 정수를 적으셈 ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max, mid, min;
       
       max = a;
       if (b > max) {
         max = b;
       }
       if (c > max) {
         max = c;
       }
       
       min = a;
       if (b < min) {
         min = b;
       }
       if (c < min) {
         min = c;
       }
       
       if ((a > b && a < c) || (a < b && a > c)) {
         mid = a;
       } else if ((b > a && b < c) || (b < a && b > c)) {
         mid = b;
       } else {
         mid = c;
       }
       

        System.out.println("최대 " + max);
        System.out.println("중간 " + mid);
        System.out.println("최소 " + min);
	}

}
