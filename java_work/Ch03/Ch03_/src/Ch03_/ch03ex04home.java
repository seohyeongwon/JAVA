package Ch03_;

import java.io.PrintStream;

public class ch03ex04home {
	public static PrintStream printf(String format, Object... args) {
		return System.out.format(format, args);
	}

	public static final int MAX = 5;

	public static void main(String[] args) {
		// 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10 = 7
		final int MAX = 10;
		int total = 2;
		for (int i = 1; i <= MAX; i++) {
			// 과제
			System.out.print(i);
			if (i % 2 == 1) {
				total -= i;
				System.out.print(i == MAX ? "=" : "+");
			} else {
				total += i;
				System.out.print(i == MAX ? "=" : "-");
			}
		}
		System.out.println(total);
	}

	public static void main23143(String[] args) {
		final int MAX = 21;

		int total = 2;

		boolean flag = true;

		boolean flag1 = true;

		while (flag1)

		{

			for (int n = 0, p = 0, c = 1; c <= MAX; n = c + p, p = c, c = n)

			{

				System.out.print(c);

				if (flag)

				{

					System.out.print("+");

					flag = false;

					total -= c;

				} else

				{

					flag = true;

					total += c;

					System.out.print(c == 21 ? "=" + total : "-");

				}

			}

			flag1 = false;

		}
	}

	public static void main12(String[] args) {
		int end = 1;
		int asd = 4;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < asd; j++) {
				printf(" ");
			}
			for (int j = 0; j < end; j++) {
				printf("*");
			}
			printf("\n");
			end = i < 4 ? end + 1 : end - 1;
			asd = i < 4 ? asd - 1 : asd + 1;

		}

	}

	public static void main123456(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				printf("*");
			}
			for (int j = 0; j < 4 - i; j++) {
				printf(" ");
			}
		}

	}
}
