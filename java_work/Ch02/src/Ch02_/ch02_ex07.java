package Ch02_;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class ch02_ex07 {
   public static void puts(String str) {
      System.out.print(str);
   }
   
   private static int getNum() {
      int num = 0;
      int ch=0;
      boolean flag = false;
      try {
         while((ch=System.in.read())!='\n') {
            if(ch>='0' && ch<='9') {
               num = num*10; // 앞에 입력 숫자 자릿수 올리기
               num += ch - '0'; // 현재 입력된 숫자 더하기
               flag = true;
            }
         }
      } catch (IOException e) {}
      
      if(!flag) {
         System.out.println("경고: 부적절한 사용법입니다!");
         System.out.println("숫자을 입력하고 Enter 치세요!");
         System.out.print("다시 입력: ");
         num = getNum(); // 재귀호출
      }
      return num;
   }
   
   public static PrintStream printf(String format, Object ... args) {
        return out.format(format, args);
    }
   
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      // 월을 입력 받아서 해당 월은 몇일까지인지 출력한다.
      // switch~case로 구현
      // 예)
      // 월입력 : 2
      // 2월은 28일까지입니다.
      int month = 0;
      int day = 31;
      
      System.out.print("월 입력: ");
      month = scan.nextInt();
      while(month<1 || month>12) {
         System.out.println("잘못 입력 했습니다. 월의 범위는 1~12사이 입니다.");
         System.out.print("다시 입력: ");
         month = scan.nextInt();
      }
      
      switch(month) { //논리 값이 아닌 정수 or 문자열 값을 입력한다. 
      case 2 : day = 28; break;
      case 4 : case 6 : case 9 : case 11 : day = 30; break;
      }
      
      // printf는 print format
      // C언어의 출력함수 printf()와 사용법이 동일 함.
      printf("%d월은 %d일까지 있다\n", month, day);
      
      main(null);
      
      scan.close();
   }

   public static void test01(String[] args) {
      puts("---- MENU ----\n");
      puts("1.INPUT 2.OUTPUT 3.SEARCH 4.FINISH\n");
      puts("Choice: ");
      int no = getNum();
      
      switch(no) { //논리 값이 아닌 정수 or 문자열 값을 입력한다. 
      case 1 : puts("#### 입력 기능 ####\n"); break;
      case 2 : puts("#### 출력 기능 ####\n"); break;
      case 3 : puts("#### 검색 기능 ####\n"); break;
      case 4 : puts("#### 종료 ####\n"); break;
      default : puts("#### 해당 사항 없슴! ####\n");
      }
   }

}