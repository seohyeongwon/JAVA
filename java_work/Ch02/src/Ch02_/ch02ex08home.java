package Ch02_;

import java.util.Scanner;

public class ch02ex08home {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("2자리 정수?");
		int i = scan.nextInt();
		if (i < 10 || i > 99) {
			System.out.print("10~99쓰셈");
			scan.close();
			return;
		}
		int ten = i / 10;
		int one = i % 10;

		if (ten == one) {
			System.out.println("10자리=1자리");
		} else {
			System.out.println("10자리 x 1자리");
			scan.close();
		}
	}

	public static void main01(String[] args) {
		final double many = 1100.0;
		System.out.print("원은?");
		int won = scan.nextInt();
		double dol = won / many;
		System.out.print(won + "원  $" + dol);
		scan.close();
	}

}
