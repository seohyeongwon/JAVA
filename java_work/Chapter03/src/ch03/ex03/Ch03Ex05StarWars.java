package ch03.ex03;

import static org.comstudy21.io.MyUtils.*;
import static java.lang.System.out;
public class Ch03Ex05StarWars {
	
	
	public static void printfTest(String[] args) {
		// 한번에 한개만 출력
		printf("Hello %s\n", "길동이");
	}
	
	public static void ex01(String[] args) {
		for(int i=0; i<25; i++) {
			printf("*");
			if(i!=0 && (i+1)%5==0) {
				printf("\n");
			}
		}
	}
	
	public static void ex02(String[] args) {
		// 0 : *
		// 1 : **
		// 2 : ***
		// 3 : ****
		// 4 : *****
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				printf("*");
			}
			printf("\n");
		}
	}

	public static final int MAX = 5;

	public static void ex03(String[] args) {
		// 0 : *****
		// 1 : ****
		// 2 : ***
		// 3 : **
		// 4 : *
		
		for(int row=0; row<MAX; row++) {
			for(int col=0; col<MAX-row; col++) {
				printf("*");
			}
			printf("\n");
		}
	}
	
	
	public static void ex04(String[] args) {
		// 0 :     *
		// 1 :    **
		// 2 :   ***
		// 3 :  ****
		// 4 : *****
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				printf(" ");
			}	
			for(int j=0; j<i+1; j++) {
				printf("*");
			}
			printf("\n");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				printf(j<4-i?" ":"*");
			}			
			printf("\n");
		}
		
		
		
	}
	
	public static void ex05(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		
		int end = 1;
		for(int i=0; i<9; i++) {
			for(int j=0; j<end; j++) {
				printf("*");
			}
			printf("\n");
			end = i<4 ? end+1 : end-1;
		}
		
		// 과제
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//  ****
		//   ***
		//    **
		//     *
	}
	
	
	public static void ex06(String[] args) {
		// 과제
		// 0 : *****
		// 1 :  ****
		// 2 :   ***
		// 3 :    **
		// 4 :     *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				out.printf(" ");
			}
			for(int j=0; j<5-i; j++) {
				out.printf("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// 과제
		//     *
		//    **
		//   ***
		//  ****
		// *****
		//  ****
		//   ***
		//    **
		//     *
/*
		int end = 4;
	    for(int i=0; i<9; i++) {
	         for(int j=0; j<end; j++) {
	            out.printf("^");
	         }
	         for(int j=0; j<5-end; j++) {
	            out.printf("*");
	         }
	         out.println();
	         end = i<4 ? end-1 : end+1;
	     }
 */
		/*
		int end = 4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<end + 5-end; j++) {
				out.printf(j<end ? "^" : "*");
			}
			out.println();
			end = i<4 ? end-1 : end+1;
		}
		*/
		int end = 4;
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				out.printf(j<end ? "^" : "*");
			}
			out.println();
			end = i<4 ? end-1 : end+1;
		}
	}
}
