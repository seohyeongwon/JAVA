package qwert;

import java.util.Scanner;

public class qwerttyu {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	      System.out.print("점수를 입력: ");
	      int score = scan.nextInt();

	      String grade = "";
	      if (score >= 97 && score <= 100) {
	         grade = "A+";
	      } else if (score >= 94 && score <= 96) {
	         grade = "A";
	      } else if (score >= 90 && score <= 93) {
	         grade = "A-";
	      } else if (score >= 87 && score <= 89) {
	         grade = "B+";
	      } else if (score >= 84 && score <= 86) {
	         grade = "B";
	      } else if (score >= 80 && score <= 83) {
	         grade = "B-";
	      } else if (score >= 77 && score <= 79) {
	         grade = "C+";
	      } else if (score >= 74 && score <= 76) {
	         grade = "C";
	      } else if (score >= 70 && score <= 73) {
	         grade = "C-";
	      } else if (score >= 60 && score <= 69) {
	         grade = "D";
	      } else if (score < 60) {
	         grade = "F";
	      }
	      System.out.println("학점 " + grade + "입니당");
	   }
	

}
