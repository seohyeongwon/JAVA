package ch03.ex01;

public class Ch03Ex04 {
	
	int total(int a, int b) {
		int total = 0;
		for(int i=a; i<=b; i++) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		Ch03Ex04 ex04 = new Ch03Ex04();
		
		int a = 1;
		int b = 100;
		int s = ex04.total(a, b); // a부터 b까지의 수를 누적하는 total함수
		System.out.println("토탈은 " + s);
	}

}
