package Ch03_;

import java.io.PrintStream;
import java.util.Scanner;

public class ch03ex07 {
	public static PrintStream printf(String format, Object... args) {
		return System.out.format(format, args);
	}

	static Scanner scan = new Scanner(System.in);

	public static class Ch03Ex07gugudan {

		public static PrintStream printf(String format, Object... args) {
			return System.out.format(format, args);
		}

//		public Ch03Ex07gugudan() {
//			for (int dan = 2; dan < 10; dan++) {
//				gugudan(dan);
//				System.out.println();
//			}
//		}
//
//		public void gugudan(int dan) {
//			printf("***%d***\n", dan);
//			for (int cnt = 1; cnt <= 9; cnt++) {
//
//				printf("%d*%d=%d\n", dan, cnt, dan * cnt);
//			}
//
//		}

		public static void main(String[] args) {
			// 구구단 출력

			for (int cnt = 1; cnt <= 9; cnt++) {
				for(int dan= 2; dan<5;dan++) {
					printf("%d*%d=%d\t", dan, cnt, dan * cnt);					
				}
				System.out.println();
			}
			for (int cnt = 1; cnt <= 9; cnt++) {
				for(int dan= 5; dan<8;dan++) {
					printf("%d*%d=%d\t", dan, cnt, dan * cnt);					
				}
				System.out.println();
			}
			for (int cnt = 1; cnt <= 9; cnt++) {
				for(int dan= 8; dan<10;dan++) {
					printf("%d*%d=%d\t", dan, cnt, dan * cnt);					
				}
				System.out.println();
			}

		}

	}
}
