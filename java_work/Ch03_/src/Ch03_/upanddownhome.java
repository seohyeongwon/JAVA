package Ch03_;

import java.util.Random;
import java.util.Scanner;

public class upanddownhome {
	Random r = new Random();
	Scanner scan = new Scanner(System.in);
	int k;
	int num = -1;
	int max, min;

	public upanddownhome() {
		while (true) {
			game();
			System.out.println("다시 ㄱㄱ?");
			char yn = scan.next().charAt(0);
			while (!(yn == 'y' || yn == 'n')) {
				System.out.println("y/n만 입력 하셔!!!!!!");
				System.out.print("다시 입력");
				yn = scan.next().charAt(0);
			}
			if (yn == 'n') {
				System.out.println("우리 다음에 만나");
				break;
			}
		}
		System.out.println("게임 종료!!");
	}

	public void game() {
		System.out.println("::::: Up & Down 게임 :::::");
		min = 0;
		max = 99;
		k = Math.abs(r.nextInt(max + 1));
		System.out.printf("수를 결정하였습니다. 맞추어 보세요.(이스트에그: %d)\n", k);
		int cnt = 0;
		int size = 7;
		while (cnt < size) {
			System.out.printf("Hint: %d~%d사이의 값을 입력 하시오\n", min, max);
			System.out.printf("%d번째 시도. 기회는 %d회 남음>> ", cnt + 1, size - cnt);
			num = scan.nextInt();
			
			while (!(num >= min && num <= max)) {
				System.out.println("범위를 초과했습니다.");
				System.out.printf("Hint: %d~%d사이의 값을 입력 하시오\n", min, max);
				System.out.printf("%d번째 시도. 기회는 %d회 남음>> ", cnt + 1, size - cnt);
				num = scan.nextInt();
			}
			if (num > k) {
				System.out.println("더 낮게");
				max = num - 1;
			} else if (num < k) {
				System.out.println("더 높게");
				min = num + 1;
			} else {
				break;
			}
			cnt++;
		}
		if (cnt < 5) {
			System.out.println("정답!!!");
		} else {
			System.out.println("그만 틀려 쫌!!!");
		}
	}

	public static void main(String[] args) {
		new upanddownhome();
	}

}
