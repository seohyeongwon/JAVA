import java.util.Scanner;
public class wei2{
	public static void main(String args[]) {
		System.out.println("이름 도시 나이 체중 독신 여부");
		Scanner scanner = new Scanner(System.in);
		
		int a1 = scanner.nextInt();
		System.out.println("한개 " + a1 + "," );
		
		int a2 = scanner.nextInt();
		System.out.println("한개 " + a2 + "," );
		System.out.print(a1+a2);		


		String name = scanner.next();
		System.out.println("이름 " + name + "," );
		
		String city = scanner.next();
		System.out.println("도시 " + city + "," );
		
		int age = scanner.nextInt();
		System.out.println("나이 " + age + "," );
		
		Double weigt = scanner.nextDouble();
		System.out.println("체중 " + weigt + "," );
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("독신 여부 " + isSingle + "입니다" );
		scanner.close();
	}
}

