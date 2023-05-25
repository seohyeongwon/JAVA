package org.comstudy.ch04.ex2;

import java.util.Scanner;

class Rect{
	int w;
	int he;
	public int Area() {
		return w*he;
	}
}

public class ch04exrec {

	public static void main(String[] args) {
		Rect rect = new Rect();
		Scanner s = new Scanner(System.in);
		System.out.println(">>> ");
		rect.w= s.nextInt();
		rect.he = s.nextInt();
		System.out.println("area " + rect.Area());
		s.close();
	}

}
