package org.comstudy.ch04;

import java.util.Scanner;
import static java.lang.System.*;

import java.io.PrintStream;

public class ch04exhome {

	static Scanner scan = new Scanner(System.in);
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month, day;
	static int total;
	static int max = 100;
	static int nextDay;
	static int nextMon;

	public static final void print(String str) {
		out.print(str);
	}

	public static PrintStream printf(String format, Object... args) {
		return java.lang.System.out.format(format, args);
	}

	public static void main(String[] args) {
		print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.printf("%d월 %d일의 100일 후는 ", month, day);

		total = max;
		total -= days[month - 1] - day;
		int idx = month % 12;
		while (total > days[idx]) {
			idx %= 12;
			total -= days[idx];
			idx++;
		}
		nextDay = total;
		nextMon = idx+1;

		System.out.printf("%d월 %d일입니다.\n", nextMon, nextDay);
	}

	public static void main2(String[] args) {
		print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();

		System.out.printf("%d월 %d일의 100일 후는 ", month, day);

		// 1. total을 100으로 초기화 한다.
		// 2. total에서 현재월의 남은 일수를 뺀다.
		// 3. 계속해서 다음달의 날수를 total에서 계속 뺀다.
		// 4. total이 다음 월의 날짜보다 작으면 그만 뺀다.
		// 5. 결과 출력, 남은 토탈은 nextDay가 된다.
		int total = 100;
		total = total - (days[month - 1] - day);
		nextMon = month;
		// nextDay = day;
		nextMon %= 12;
		while (days[nextMon] < total) {
			// nextDay %= 12;
			nextMon %= 12;
			total -= days[nextMon];
			nextMon++;
		}
		nextDay = total;
		nextMon++;

		System.out.printf("%d월 %d일입니다.\n", nextMon, nextDay);

	}

	public static void main1(String[] args) {
		print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		System.out.printf("%d월 %d일의 100일 후는 ", month, day);
		// total max(100) 될때까지 월의 날짜 수 누적
		// total 현재 월 남은 날짜
		// total 100이하면 현재 월 다음 달부터 total 누적
		// total 100 이상이면 마지막달 날짜 수에서 넘치는 만큼 빼기
		// nextDay = days[nextMon-1] - (total - max)
		total = days[month - 1] - day;
		nextMon = month;
		while (total < max) {
			nextDay %= 12;
			total += days[nextMon];
			nextMon++;
		}
		nextDay = days[nextMon - 1] - (total - max);

		System.out.printf("%d %d \n", nextMon, nextDay);

	}
}