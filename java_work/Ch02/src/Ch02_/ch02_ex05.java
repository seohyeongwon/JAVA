package Ch02_;
import java.util.Scanner;
public class ch02_ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
				
		System.out.print("점수(0~100):");
		 int score = scanner.nextInt();
		 if(score>=90) {
			 grade='A';
			 if(score>=97&&score<=100)
				 System.out.println("A+");
			 else if(score<=93)
				 System.out.println("A-");
			 
		 }
		 else if(score>=80) {
			 grade='B';
			 if(score>=87)
				 System.out.println("B+");
			 else if(score<=83)
				 System.out.println("B-");
		 }
		 else if(score>=70) {
			 grade='C';
			 if(score>=77)
				 System.out.println("C+");
			 else if(score<=73)
				 System.out.println("C-");
		 }
		 else if(score>=60) {
			 grade='D';
			 if(score>=67)

				 System.out.println("D+");
			 else if(score<=63)
				 System.out.println("D-");
		 }
		 else
			 grade='F';
			//System.out.print("학점은 "+grade+"용");
		 scanner.close();

	}

}
