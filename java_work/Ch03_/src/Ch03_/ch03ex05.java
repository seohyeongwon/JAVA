package Ch03_;

public class ch03ex05 {

	public static void main(String[] args) {
		System.out.println("--------------");
		final int max = 10;
		int total = 2;
		for (int i = 1; i <= max; i++) {
			System.out.print(i);
			if (i % 2 == 1) {
				total -= i;
				System.out.print(i == max ? "=" : "+");
			} else {
				total += i;
				System.out.print(i == max ? "=" : "-");
			}
		}
		System.out.print(total);

	}

}
