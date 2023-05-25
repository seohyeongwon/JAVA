package org.com.ch14;

abstract class 탈것{
	String name;
	void start() {
		System.out.println(name+" on!");
		run();
		System.out.println(name+" off!");
	}
	abstract void run();
}

class car extends 탈것{
	@Override
	void run() {
		super.name = "오토바이";
		// TODO Auto-generated method stub
		System.out.println("benz~");
	}
}

class 오토바이 extends 탈것{
	@Override
	void run() {
		 super.name = "스포츠카";
		// TODO Auto-generated method stub
		System.out.println("부웅우우우ㅜ");
	}
}

public class TemplareMethodEx {

	public static void main(String[] args) {
		탈것 bike = new 오토바이();
		bike.start();
		
		탈것 qwe = new car();
		qwe.start();
	}

}
