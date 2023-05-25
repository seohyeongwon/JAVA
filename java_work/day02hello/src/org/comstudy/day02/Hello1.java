package org.comstudy.day02;

// int, double, boolean, String, char
public class Hello1 {
	// Hello ȫ�浿 5 "���� ����" 444
	// Application�� ������...
	public static void main(String[] args) {
		// ���ڿ� ���� ����
		String name = "JAVA";
		name = args.length>0 ? args[0] : name; //���� = ���� ? �� : ����;
		String greeting = "Hello "+ name +" world!";
		
		int size = 1;
		if(args.length > 1) {
			// �Ķ���Ϳ� ���޵Ǵ� �����ʹ� ������ ��� String Ÿ���̴�.
			size = Integer.parseInt( args[1] ); // numeric�� ���� ���� ����ȯ.
		}
		for(int i=0; i<size; i++) {
			System.out.println(greeting);
		}
	}
	
}