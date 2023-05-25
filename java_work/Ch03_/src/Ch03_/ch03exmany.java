package Ch03_;
import java.util.Scanner;
public class ch03exmany {
	
public static void main(String[] args) {
	int n [][] = { {1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
	
	for(int i=0; i<n.length; i++) {
		for(int j=0; j<n[i].length; j++) {
			System.out.print(n[i][j]);
		}
		System.out.println();			
	}

}





	public static void main01(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 치셈 홀수만!!! : ");
		int n = scanner.nextInt();
		if(n%2==0) {
			System.out.print("홀수만 가능");
			scanner.close();
			return;
		}
		for (int i=n; i>0; i--) {
			for (int j=0; j<i; j++) { 
				System.out.print('*');
			}
			System.out.println();
		}
		scanner.close();

	}

}
