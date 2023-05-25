package org.comstudy.ch04homework;

class Per{
	private int age;
	
	public void sAge(int age) {
		this.age=age;
		System.out.println("age..."+ age);
	}
	public int gAge() {
		return age;
	}
}


public class ch04exex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Per aPer = new Per();
		//aPer.age= 18;
		aPer.sAge(18);
		System.out.println(aPer);
	}

}
