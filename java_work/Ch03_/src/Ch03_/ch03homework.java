package Ch03_;

public class ch03homework {

	public static void main(String[] args) {
		int total = 0;
		int num = 1;
		boolean flag = true;
		final int max = 9;

		while (num <= max) {
			System.out.print(num);
			if (flag) {
				System.out.print(num < max ? "-" : "=");
				total += num;
				flag = false;
			} else {
				System.out.print("+");
				total -= num;
				flag = true;
			}
			num += 2;
		}
		System.out.print(total);
	}

	public static void ch03extest1(String[] args) {
		int total = 0;
		int i = 1;
		while (i <= 16) {
			System.out.print(i);
			total += i;
			if (i < 15) {
				System.out.print("+");
			}

			// if (i % 2 == 0) {
			// System.out.print(i == 16 ? "=" : "+");
			// total += i;
			// }
			// i++;
			i += 2;
		}
		System.out.print("=" + total);
	}
}
