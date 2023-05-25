package ch03.ex01;

// 같은 패키지 안에서만 접근 가능한 패키지 멤버 클래스
class KKK {
	public void kkkFn() {
		System.out.println("kkkFn함수 호출");
	}
}

// public 붙은 클래스는 파일명과 동일해야한다.
// public 접근지정자자 붙이 않으면 디폴트 (패키지)
public class Ch03Ex02 {
	
	// (접근 지정자 생략 할 시) 디폴트 접근 지정자 
	// package 접근 : 디폴트 접근 지정자는 같은 폴더 내에서 접근 가능.
	void start() {
		System.out.println("1. 시작!");
	}
	
	String sayHello(String name) {
		System.out.println("2. Hello " + name);
		
		return null; 
		// 함수의 반환형(return type)이 void가 아닌
		// 있다는 것은 return문이 있다는 약속.
	}
	
	short sum(int a, int b) {
		System.out.println("3...");
		return (short)(a + b);
	}

	public static void main(String[] args) {
		// 클래스 변수 = new 클래스();
		// 변수.메서드();
		KKK k = new KKK();
		k.kkkFn();
		
		Ch03Ex02 ex = new Ch03Ex02();
		
		// 다음 메서드들이 정상 실행 가능하도록 메서드를 구현 하라.
		ex.start();
		ex.sayHello("길동이");
		int result = ex.sum(10, 12);
	}
}
