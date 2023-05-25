package ch03.ex02;

public class Ch03Ex02 {
	static final int MAX = 100;
	public static void main(String[] args) {
		// 1~ 100까지의 3의 배수를 누적하는 반복문 구현하기
		int total = 0;
		int num = 1;
		
		// 1~100까지 반복
		for(int i=num; i<MAX; i++) {
			// 3의 배수인지 판별
			if(i%3 == 0) {
				total += i;
			}
		}
		System.out.println("1~100까지 3의 배수 누적 합은 " + total);

	}

}
