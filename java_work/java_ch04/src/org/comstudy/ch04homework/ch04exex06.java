package org.comstudy.ch04homework;

class TV2 {
	private int size;
	private String manu;

	public TV2() {
		size = 32;
		manu = "lg";
		System.out.println(size + " " + manu);
	}

	public TV2(String manu) {
		this.size = 32;
		this.manu = manu;
		System.out.println(size + " " + manu);
	}

	public TV2(int size, String manu) {
		this.size = size;
		this.manu = manu;
		System.out.println(size + " " + manu);
	}

	@Override
	public String toString() {
		return "{\"size\":" + size + ", \"manufacturer\":\"" + manu + "\"}";
	}
	// Object클래스의 toString()메소드 오버라이드
}

public class ch04exex06 {

	public static void main(String[] args) {
		// TV 객체 생성
		// int는 정수 타입이다.
		// class는 참조 타입이다.
		// int age;

		TV2 lgTV = new TV2();
		TV2 samsungTV = new TV2("samsung");
		TV2 sonyTV = new TV2(43, "sony");

		System.out.println(lgTV.toString());
		System.out.println(samsungTV);
		System.out.println(sonyTV);
	}

}
