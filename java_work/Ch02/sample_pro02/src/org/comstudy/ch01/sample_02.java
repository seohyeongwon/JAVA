package org.comstudy.ch01;
import java.util.Scanner;

public class sample_02 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.next();
        System.out.print("이름은"+ name + ",");
        
        String city = scanner.next();
        System.out.print("도시은"+ city + ",");
        
        int age = scanner.nextInt();
        System.out.print("나이은"+ age + "살,");
        
        double weight = scanner.nextDouble();
        System.out.print("체중은"+ weight + "kg,");
        
        boolean single = scanner.nextBoolean();
        System.out.print("독신여부는"+ single + "입니다");
        
        scanner.close();
        
	}

}
