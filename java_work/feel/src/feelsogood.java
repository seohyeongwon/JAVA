import java.util.Scanner;

public class feelsogood {

	public static void main(String[] args) {
		int num, count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		num = scanner.nextInt();
		if (num >= 1 && num <= 99) {
			int a, b;
			a = num / 10; // 10�� �ڸ����� 3,6,9, �˻�
			b = num % 10; // 1�� �ڸ����� 3,6,9 �˻�
			if (a != 0 && a % 3 == 0)
				count++; // ���� �ڸ� ������ 3,6,9�� �ϳ��� �ִ� ��� numberOf369 ����
			if (b != 0 && b % 3 == 0)
				count++; // 1�� �ڸ� ������ 3,6,9�� �ϳ��� �ִ� ��� numberOf369 ����
			
			if (count == 2) System.out.println("�ڼ�¦¦");
			else if (count == 1) System.out.println("�ڼ�¦");
			else System.out.println("�ڼ� ����");				
		} 
		else
			System.out.println("���ڰ� ������ ������ϴ�.");
		
		scanner.close();
		
	}

}