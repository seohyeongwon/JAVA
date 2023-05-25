package org.comstudy.ch04homework;

import java.util.Scanner;

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work + "입니다.");
		}
	}
}

class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	Day[] days;
	int size;

	public MonthSchedule(int size) {
		this.size = size;
		this.days = new Day[size];
//      for(int i=0; i<size; i++) {
//         this.days[i] = new Day();
//      }
	}

	public void input() {
		System.out.println("---- input ----");
		System.out.printf("날짜(1~%d)?", size);
		int day = scan.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		if (days[day - 1] == null) {
			days[day - 1] = new Day();
		}
		days[day - 1].set(scan.next());
	}

	public void view() {
		System.out.println("---- view ----");
		System.out.printf("날짜(1~%d)?", size);
		int day = scan.nextInt();
		System.out.print(day + "일의 할 일은 ");
		if (days[day - 1] != null) {
			days[day - 1].show();
		} else {
			System.out.println("없습니다.");
		}
	}

	public void finish() {
		System.out.println("---- finish ----");
		System.exit(0);
	}

	public void run() {
		System.out.println(":::::: 이번달 스케쥴 관리 프로그램 ::::::");
		while (true) {
			System.out.print("1.입력 2.보기 3.종료 >>");
			switch (scan.nextInt()) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
			default:
				System.out.println("해당 사항 없습니다.");
			}
			System.out.println();
		}
	}
}

public class ch04exex09 {

	public static void main(String[] args) {

		// MonthSchedule april = new MonthSchedule(30);
		new MonthSchedule(30).run();

	}

}
