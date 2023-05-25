package Ch03_;

import java.io.PrintStream;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Scanner;


public class ch03ex04 {

	public static PrintStream printf(String format, Object... args) {
		return System.out.format(format, args);
	}
	
	public static void main(String[] args) {
	    boolean flag = true;
	      for(int k=0; k<3; k++) {
	         int cnt = 2;
	         int i=1;
	         if(flag) {
	            cnt = 1; i=0;
	            flag = false;
	         }
	         for(; i<9; i++) {
	            for(int j=0; j<9; j++) {
	               boolean ccc = j==5-cnt || j==3+cnt;
	               ccc = ccc || j==0 || j==8;
	               ccc = ccc || i==0 || i==8;
	               System.out.print(ccc?"*":" ");
	            }
	            for(int j=1; j<9; j++) {
		               boolean ccc = j==5-cnt || j==3+cnt;
		               ccc = ccc || j==0 || j==8;
		               ccc = ccc || i==0 || i==8;
		               System.out.print(ccc?"*":" ");
		            }
	            for(int j=1; j<9; j++) {
		               boolean ccc = j==5-cnt || j==3+cnt;
		               ccc = ccc || j==0 || j==8;
		               ccc = ccc || i==0 || i==8;
		               System.out.print(ccc?"*":" ");
		            }
	            
	            System.out.println();
	            cnt = i<4 ? cnt+1 : cnt-1;
	         }
	      }

	}
	
	
	
	
	
	public static int getNum() {
	      int num = 0;
	      int ch = 0;

	      try {
	         while((ch=System.in.read())!='\n') {
	            if(ch>='0' && ch<='9') {
	               num = num * 10 + ch - '0';
	            }
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	      return num;
	   }


	
	public static void main14(String[] args) {
	      int cnt = 1;
	      System.out.print("Input Size : ");
	      int size = getNum();
	      for(int i=0; i<size; i++) {
	         for(int j=0; j<size; j++) {
	            //System.out.print(j<5-cnt || j>=4+cnt?"^":"*");
	            System.out.print(j>size/2-cnt && j<size/2+cnt?"*":"^");
	         }
	         
	         System.out.println();
	         cnt = i<size/2 ? cnt+1 : cnt-1;
	      }
	   }


	
	
	public static void main98(String[] args) {
		int end = 1;
		int asd = 4;
		
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < end; j++) {
				printf("*");
			}
			for (int j = 9; j < 2*end; j++) {
				printf("^");
			}
			for (int j = 0; j < end; j++) {
				printf("*");
			}
		
			printf("\n");
			end = i < 3 ? end + 1 : end - 1;
			asd = i < 3 ? asd - 1 : asd + 1;

		}
	}
	
	public static void main03(String[] args) {
		int end = 1;
		int asd = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < asd; j++) {
				printf("^");
			}
			for (int j = 0; j < 2*end-1; j++) {
				printf("*");
			}
			printf("\n");
			end = i < 4 ? end + 1 : end - 1;
			asd = i < 4 ? asd - 1 : asd + 1;

		}
	}
	
	public static void main02(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <   i; j++) {
				printf(" ");
			}
			for (int j = 0; j < 9-2*i; j++) {
				printf("*");
			}

			printf("\n");
		}		
	}

	public static void main01(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				printf(" ");
			}
			for (int j = 0; j < 2*i+1 ; j++) {
				printf("*");
			}
			printf("\n");
		}

	}

}
