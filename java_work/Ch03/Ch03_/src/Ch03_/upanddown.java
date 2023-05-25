package Ch03_;


import java.util.Random;
import java.util.Scanner;

public class upanddown {
   Random r = new Random();
   Scanner scan = new Scanner(System.in);
   int k;
   int num = -1; // 사용자 입력
   int max, min;
   
   // 생성자(constructor) 이름은 클래스명과 동일하다.
   // 생성자는 리턴형이 없다.
   // Ctrl + spacebar 단축키
   public upanddown() {
      // 생성자, 상속, 다형성, 캡슐화 ...
      while(true) {         
         game();
         System.out.println("재 시도 하시겠습니까?");
         char yn = scan.next().charAt(0);
         while(!(yn=='y' || yn=='n')) {
            System.out.println("'y'또는 'n'만 입력 하세요!");
            System.out.print("다시 입력 >>");
            yn = scan.next().charAt(0);
         }
         if(yn == 'n') {
            System.out.println("다음 기회에 ...");
            break;
         }
      }
      System.out.println("게임 종료!!");
   }
   
   public void game() {
      System.out.println("::::: Up & Down 게임 :::::");
      min = 0; 
      max = 99;
      k = Math.abs(r.nextInt(max+1) );
      System.out.printf("수를 결정하였습니다. 맞추어 보세요.(이스트에그: %d)\n", k);
      int cnt=0;
      int size = 5;
      while(cnt<size ) {
         System.out.printf("Hint: %d~%d사이의 값을 입력 하시오\n", min, max);
         System.out.printf("%d번째 시도. 기회는 %d회 남음>> ", cnt+1, size-cnt);
         num = scan.nextInt();
         // 유효성 검사
         while(!(num>=min && num<=max) ) {
            System.out.println("범위를 초과했습니다.");
            System.out.printf("Hint: %d~%d사이의 값을 입력 하시오\n", min, max);
            System.out.printf("%d번째 시도. 기회는 %d회 남음>> ", cnt+1, size-cnt);
            num = scan.nextInt();
         }
         if(num > k) {
            System.out.println("더 낮게");
            max = num - 1;
         } else if(num < k) {
            System.out.println("더 높게");
            min = num + 1;
         } else {
            break;
         }
         cnt++;
      }
      if(cnt<5) {
         System.out.println("정답");
      } else {
         System.out.println("기회를 모두 소진 했습니다. 실격!");
      }
   }

   public static void main(String[] args) {
      new upanddown(); // 객체 생성, 생성자 호출
   }
}