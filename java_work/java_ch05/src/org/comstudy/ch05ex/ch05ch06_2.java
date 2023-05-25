package org.comstudy.ch05ex;

interface TV2 {
	// 추상메소드, 상수 필수 사용(변수 사용 부라능)
	// public static final 생략 되어도 컴파일러가 추가 한다.
	String name = "TV";

	void powerOn();
}

class SamsungTV implements TV2 {
	public void powerOn() {
		System.out.println("삼성 " + TV2.name + " 켜기");
	}
}

class LgTV implements TV2 {
	public void turnOn() {
		System.out.println("LG " + TV2.name + " 켜기");
	}

	@Override
	public void powerOn() {
		turnOn();
	}
}

public class ch05ch06_2 {
	public static void TvRunner(TV2	 tv) {
		tv.powerOn();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRunner(new SamsungTV());
		TvRunner(new LgTV());

	}

}
