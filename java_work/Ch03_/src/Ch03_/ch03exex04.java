package Ch03_;

import java.util.Scanner;

public class ch03exex04 {
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args) {
      System.out.print("소문자 알파벳 하나를 입력하시오>>");
      char ch = scan.next().charAt(0);
      
      for(char j='z'; j>='a'; j--) {
         for(char i='a'; i<=j; i++) {
            System.out.print((char)i);
         }
         System.out.println();
      }
   }

}