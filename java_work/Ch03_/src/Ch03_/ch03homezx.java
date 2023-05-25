package Ch03_;

public class ch03homezx {
	// 2- 2 + 3 - 5 + 8 - 13 + 21 = 14
	//int 다음항 = 0, 이전항 = 0, 현재항 = 1;
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int total = 2;
		
		System.out.print(a1+"+"+a2);
		
		for(int i=0; i<=5;i++) {
			a3=a1+a2;
			if(i%2==0) {
				total-=a3;
				System.out.print("-"+a3);
			}else {
				total+=a3;
				System.out.print("+"+a3);
			}
			a1=a2;
			a2=a3;
		}
		System.out.print("="+total);
		
	}
	
	

	public static void main322(String[] args) {
		// 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;
		int total = 2;

		for (int n = 0, p = 0, c = 1, i = 0; c <= MAX; n = c + p, p = c, c = n) {
			System.out.print(c);
			if (i % 2 == 0) {
				total -= c;
				System.out.print("-" + c);
			} else {
				total += c;
				System.out.print("+" + c);
			}
			System.out.println("="+total);
		}
	}

	// 과제 : 피보나치 수열로 응용
	// 진짜로 오늘 과제
	// 1 + 1 - 2 + 3 - 5 + 8 - 13 + 21 = 14

	public static void mainqwe(String[] args) {
		// 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		final int MAX = 21;
		int total = 0;
		for (int n = 0, p = 0, c = 1; c <= MAX; n = c + p, p = c, c = n) {
			System.out.print(c);
			total += c;
			System.out.print(c < MAX ? "+" : "=");
		}
		System.out.println(total);
	}

	public static void main_pibo01(String[] args) {
		// Swap (벼룩시장 물물 교환(치환)) 알고리즘
		// 다음항 = (이전항 + 현재항)
		// 이전항 = 현재항
		// 현재항 = 다음항
		// 0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 = 54
		int 다음항 = 0, 이전항 = 0, 현재항 = 1;
		while (현재항 <= 21) {
			System.out.print(현재항 + " ");

			다음항 = 현재항 + 이전항;
			이전항 = 현재항;
			현재항 = 다음항;
		}
	}

	// 기초와 기초가 합해져서 결과가 만들어진다.
	// ---- 의사 코스 ----
	// 1. while 형태 만들기
	// 2. 초기값 선언
	// 3. 조건 만든다.
	// 4. 증감식 만든다.
	// 5. 숫자 출력
	// 6. 부호를 붙인다.
	// 9. 부호가 엇갈리게 출력되도록 한다.
	// 10. =을 붙인다.
	// 11. total에 누적
	// 12. total 출력

	// i>10 && i%3==0
	// 관계 연산을 이어주는것이 논리 연산
	// 이 뭣고?

	public static void main_ex(String[] args) {
		// 1 - 3 + 5 - 7 + 9 = 5
		int num = 1;
		int total = 0;
		boolean flag = true; // 활용도가 높다. (권장한다)
		final int MAX = 9;

		while (num <= MAX) {
			System.out.print(num);
			if (flag) {
				total += num;
				System.out.print(num < MAX ? "-" : "=");
				flag = false;
			} else {
				total -= num;
				System.out.print("+");
				flag = true;
			}

			num += 2;
		}
		System.out.println(total);
	}

	public static void main_char(String[] args) {
		int num = 1;
		int total = 0;
		char oper = '-';

		while (num <= 9) {
			System.out.print(num);
			System.out.print(oper);
			if (oper == '-') {
				oper = '+';
			} else {
				oper = '-';
			}
			num += 2;
		}
	}

	public static void main_test(String[] args) {
		int cnt = 1; // 홀작 구분
		int num = 1;
		int total = 0;

		while (num <= 9) {
			System.out.print(num);
			if (cnt % 2 != 0) {
				System.out.print("-");
			} else {
				System.out.print("+");
			}

			num += 2;
			cnt++;
		}
	}

	public static void homework01_for(String[] args) {
		// 1 + 3 + 5 + 7 + 9 = 25
		int total = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.print(i);
			total = total + i;
			if (i < 9) {
				System.out.print('+');
			}
		}
		System.out.println("=" + total);
	}

	public static void homework01_while(String[] args) {
		// 1~10까지의 숫자중 홀수만 출력하고 그 누적 값을 계산 프로그램.
		// 1 + 3 + 5 + 7 + 9 = 25
		int total = 0;
		int i = 1; // 초기값 - 반복문을 시작하는 값
		// for(;;) {
		while (i <= 9) { // i가 9보다 작거나 같을 경우 반복한다.
			System.out.print(i);
			// 누적 (누적 되는 변수는 초기값 필수)
			total = total + i;
			if (i < 9) {
				System.out.print('+');
			}
			i += 2;
		}
		System.out.println("=" + total);
		// 시작이 있고 끝이 있어야 한다.
		// 시작 하고 끝나지 않는 프로그램은 오류다.
	}

	// 선택과 집중
	// 한번에 한가지씩 하는 습관
	public static void homework01(String[] args) {
		// 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9 + 10 = 7
		final int MAX = 10;
		int total = 2;
		for (int i = 1; i <= MAX; i++) {
			// 과제
			System.out.print(i);
			if (i % 2 == 1) {
				total -= i;
				System.out.print(i == MAX ? "=" : "+");
			} else {
				total += i;
				System.out.print(i == MAX ? "=" : "-");
			}
		}
		System.out.println(total);
	}

	public static void test(String[] args) {
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		final int MAX = 10;
		for (int i = 1, total = 0; i <= MAX; i++) {
			System.out.print(i);
			total += i;
			System.out.print(i != MAX ? "+" : "=" + total);
		}
	}
} // class 문장의 끝
