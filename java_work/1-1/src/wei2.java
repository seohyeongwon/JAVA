import java.util.Scanner;
public class wei2{
	public static void main(String args[]) {
		System.out.println("�̸� ���� ���� ü�� ���� ����");
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		System.out.println("�Ѱ� " + a1 + "," );
		
		int a2 = scanner.nextInt();
		System.out.println("�Ѱ� " + a2 + "," );
		System.out.print(a1+a2);		


		String name = scanner.next();
		System.out.println("�̸� " + name + "," );
		
		String city = scanner.next();
		System.out.println("���� " + city + "," );
		
		int age = scanner.nextInt();
		System.out.println("���� " + age + "," );
		
		Double weigt = scanner.nextDouble();
		System.out.println("ü�� " + weigt + "," );
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("���� ���� " + isSingle + "�Դϴ�" );
		scanner.close();
	}
}

