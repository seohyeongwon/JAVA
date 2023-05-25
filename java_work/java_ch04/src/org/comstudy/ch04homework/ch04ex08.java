package org.comstudy.ch04homework;

import java.util.Scanner;

class PB {
	private String name;
	private String tel;

	public PB(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

class Book {
	Scanner s = new Scanner(System.in);

	private PB[] qwe;

	void read() {
		System.out.println("people>>>");
		int n = s.nextInt();

		qwe = new PB[n];

		for (int i = 0; i < qwe.length; i++) {
			System.out.println("name ph>>>");
			String name = s.next();
			String tel = s.next();
			qwe[i] = new PB(name, tel);
		}
		System.out.println("save...");
	}

	String sea(String name) {
		for (int i = 0; i < qwe.length; i++) {
			if (qwe[i].getName().equals(name))
				return qwe[i].getTel();
		}
		return null;
	}

	void run() {
		read();
		while (true) {
			System.out.println("name>>>");
			String name = s.next();
			if (name.equals("stop"))
				break;
			String tel = sea(name);
			if (tel == null) {
				System.out.println(name + " no~~~");
			} else {
				System.out.println(name + " ph " + tel);
			}
		}
		s.close();
	}
}

public class ch04ex08 {

	public static void main(String[] args) {
		new Book().run();
	}
}