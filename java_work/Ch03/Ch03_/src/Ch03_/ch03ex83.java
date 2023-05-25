package Ch03_;

import java.util.Scanner;

public class ch03ex83 {
	int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	Scanner scan = new Scanner(System.in);
	int month;

	public ch03ex83() {

	}

	public void ex01() {
		System.out.print("월입력: ");
		month = scan.nextInt();
		System.out.println(month + "월은 " + days[month - 1] + "일까지 있다.");
	}

	public static void main(String[] args) {
		new ch03ex83();

	}

}
