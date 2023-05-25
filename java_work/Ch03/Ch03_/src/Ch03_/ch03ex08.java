package Ch03_;

import java.util.Scanner;

public class ch03ex08 {
   Scanner scan = new Scanner(System.in);
   
   public ch03ex08() {
      ex01();
   }
   
   public void ex01() {
      int startDan=2, endDan=9; // 시작단, 종료단
      System.out.print("시작 할 단 입력: ");
      startDan = scan.nextInt();
      System.out.print("종료 할 단 입력: ");
      endDan = scan.nextInt();
      if(startDan>endDan) {
    	  int tmp = startDan;
    	  startDan=endDan;
    	  endDan=tmp;
      }
      
      for(int cnt=1; cnt<=9; cnt++) {
         for(int dan=startDan; dan<=endDan; dan++) {
            System.out.format("%d*%d=%d\t", dan, cnt, dan*cnt);
         }
         System.out.println();
      }
   }

   public static void main(String[] args) {
      new ch03ex08();
   }

}