package Ch02_;

import java.util.Scanner;

public class ch02_ex02 {
    
	public static Scanner scan;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("반지름은?");
		
		double r = .0;
		double area = .0;
		double line = .0;
		r = scan.nextDouble();
		area = r*r*3.14;
		line = 2*3.14*r;
		
	    System.out.println("원의 넒이:"+ area);
		System.out.println("원의 둘레:"+ line);
		
		scan.close();
	}

}
