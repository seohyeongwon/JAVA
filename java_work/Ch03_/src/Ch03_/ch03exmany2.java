package Ch03_;

import java.util.Random;
import java.util.Scanner;

public class ch03exmany2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		int a ;
		int hhh=0 , lll=0;
		
		while(true) {
		int b=0;
		lll=0;
		hhh=49;
		a = r.nextInt(50);
		System.out.print("----맞춰봐----");
		int c=scan.nextInt();

		while(true) {

		    System.out.print(hhh+"~"+lll);
			System.out.print(b+1+"");
			if(c>hhh || c<lll) {
					System.out.println("범위 벗어남");
					}
					else {
						if(c==a) {
							System.out.println("맞음");
							break;
						}
						else if(c>a){
							System.out.println("더 작게");
							hhh=c;
						}
						else {
							System.out.println("더 크게");
							lll=c;
						}
					}
					b++;
					}
				System.out.print("replay? y/n");
				if(scan.next().equals("n"));
				break;	
	}
	scan.close();
 }
}
