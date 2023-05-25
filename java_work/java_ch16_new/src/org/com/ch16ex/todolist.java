package org.com.ch16ex;

import java.util.Arrays;
import java.util.Scanner;

class ToDoList1 {
	private String work;
	private String task;

	@Override
	public String toString() {

		return task;
	}

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

class todo {
	Scanner s = new Scanner(System.in);
	ToDoList1[] oness;
	int size;
	int day;

	@Override
	public String toString() {
		return "바로>>> " + oness[day - 1].toString();
	}

	public todo(int size) {
		this.size = size;
		this.oness = new ToDoList1[size];
		for (int i = 0; i < size; i++) {
			this.oness[i] = new ToDoList1();
		}
	}

	public void input() {
		System.out.println(":::: 입력 ::::");
		System.out.printf("날짜(1~%d)???", size);
		int day = s.nextInt();
		System.out.println("할일은?? 빈칸없이!!!");

		if (oness[day - 1] == null) {
			oness[day - 1] = new ToDoList1();
		}
		oness[day - 1].set(s.next());
	}

	public void view() {
		System.out.println(":::: 보기 ::::");
		System.out.printf("몇일 찾노(1~%d)???", size);
		int day = s.nextInt();
		System.out.println(day + "일은" + " 그날은 바로 바로 ");

		if (oness[day - 1] != null) {
			oness[day - 1].show();
			System.out.println("바로>>> " + oness[day - 1].toString());
		} else {
			System.out.println("옶옹");
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

public class todolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new todo(30).run();
	}

}
