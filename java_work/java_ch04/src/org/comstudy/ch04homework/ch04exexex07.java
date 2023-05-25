package org.comstudy.ch04homework;

import java.util.Scanner;

class Date {
	private String work;

	public String get() {
		return work;
	}

	public void set(String work) {
		this.work = work;
	}

	public void show() {
		if (work == null) {
			System.out.println("nonono~~");
		}
	}
}

class MSC {
	Scanner s = new Scanner(System.in);
	Date[] oneee;
	int size;

	public MSC(int size) {
		this.size = size;
		this.oneee = new Date[size];
		for (int i = 0; i < size; i++) {
			this.oneee[i] = new Date();
		}
	}

	public void input() {
		System.out.println(":::: 입력 ::::");
		System.out.printf("날짜(1~%d)???", size);
		int day = s.nextInt();
		System.out.println("할일은?? 빈칸없이!!!");

		if (oneee[day - 1] == null) {
			oneee[day - 1] = new Date();
		}
		oneee[day - 1].set(s.next());
	}

	public void view() {
		System.out.println(":::: 보기 ::::");
		System.out.printf("몇일 찾노(1~%d)???", size);
		int day = s.nextInt();
		System.out.println(day + " that dat is ");

		if (oneee[day - 1] != null) {
			oneee[day - 1].show();
		}
	}

	public void fin() {
		System.out.println(":::: 끝 ::::");
		System.exit(0);
	}

	public void run() {
		System.out.println(":::: 이번달 관리 ::::");
		while (true) {
			System.out.println("1.입력 2.보기 3.끝");
			switch (s.nextInt()) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				fin();
				break;
			default:
				System.out.println("틀린듯....");
			}
			System.out.println();
		}
	}
}

public class ch04exexex07 {

	public static void main(String[] args) {
		new MSC(30).run();
	}

}
