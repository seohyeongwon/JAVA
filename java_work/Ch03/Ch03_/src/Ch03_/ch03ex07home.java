package Ch03_;

import static java.lang.System.out;

import java.util.Scanner;

public class ch03ex07home {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		out.print("행의 수: ");
		int size = scan.nextInt();
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<=i; j++) {
				out.print("*");
			}
			out.println();
		}
	}
}
