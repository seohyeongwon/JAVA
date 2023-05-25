package org.comstudy.ch05ch;

class Per{}
class Stu extends Per{}
class Res extends Per{}
class Pro extends Res{}

public class ch05ch02 {
	static void print(Per p) {
		if(p instanceof Per)
			System.out.println("Per");
		
		if(p instanceof Stu)
			System.out.println("Stu");
		
		if(p instanceof Res)
			System.out.println("Res");
		
		if(p instanceof Pro)
			System.out.println("Pro");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Stu>>>"); 
		print(new Stu());
		System.out.print("new Res>>>"); 
		print(new Res());
		System.out.print("new Pro>>>"); 
		print(new Pro());
	}

}
