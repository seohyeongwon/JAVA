package org.comstudy.ch04homework;

import java.util.Scanner;

class PB {
	String name;
	int tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public void show() {
		if (name == null && tel == 0) {
			System.out.println("nonono~~~~");
		}
	}
}

class Book {
	Scanner s = new Scanner(System.in);
	

}

public class ch04ex10 {

	public static void main(String[] args) {

	}

}
