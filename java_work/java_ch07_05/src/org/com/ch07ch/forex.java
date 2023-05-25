package org.com.ch07ch;

public class forex {

	public static void main1(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(" " + i);
			System.out.println("\n--------");
		}

		for (int i = 1; i <= 10; i += 2) {
			System.out.println("" + i);
		}
		for (int i = 2; i <= 10; i += 2) {
			System.out.println("" + i);
		}
		for (int i = 10; i >= 1; i--) {
			System.out.println(" " + i);
		}

	}

	public static void main2(String[] args) {
		int i = 1;
		int total = 0;
		while (i <= 10) {
			total += i;
			i++;
		}
		System.out.println("1+2+3+4+5+6+7+8+9+10=" + total);
	}

	public static void main3(String[] args) {
		int i = 1;
		while (i++ < 5) {
			System.out.println(" " + i);
		}
		i = 1;
		while (++i < 5) {
			System.out.println(" " + i);
		}
		i = 0;
		while (i++ < 5) {
			System.out.println(" " + i);
		}
	}

	public static void main4(String[] args) {
		int tot = 0;
		int i = 1;
		do {
			tot += i;
			i++;
		} while (i <= 10);
		System.out.println(tot);

	}

	public static void main5(String[] args) {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total = total + i;
			if (i % 10 == 0)
				System.out.println(" 1부터 " + i + "까지의 자연수 합계는 " + total);
		}
	}

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 10; dan++) {
			System.out.println(dan+" ");
			for (int n = 1; n <= 10; n++) {
				System.out.println(dan + " * " + n + " = " + dan * n);
			}
		}
	}
}
