package Ch03_;

import java.io.PrintStream;

public class ch03ex06starwars {
	public static PrintStream printf(String format, Object... args) {
		return System.out.format(format, args);
	}

	public static void main123(String[] args) {
		printf("Hello %s\n", "won");

	}

	public static void main1234(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				printf("*");
			}
			printf("\n");
		}
	}

	public static void main12345(String[] args) {
		for (int i = 20; i > 5; i--) {
			for (int j = 0; j < i - 1; j++) {
				printf("*");
			}
			printf("\n");
		}
	}

	public static void main12(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				printf("*");
			}
			printf("\n");
		}
	}

	public static void main1(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-i;j++) {
				printf(" ");
			}
			for(int j=0;j<i+1;j++) {
				printf("*");
			}
			printf("\n");
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5;j++) {
				printf(j<4-i?" ":"*");
			}
			printf("\n");
		}		
	}
}
