package org.comstudy.ch04homework;

import java.util.Scanner;

class ch04ex0512 {
	private double x,y;
	private int rad;
	public ch04ex0512(double x, double y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	
	@Override
	public String toString() {
		return String.format("(%.1f, %.1f) %d",x,y,rad);
	}

	public void show() {
		System.out.println(this);
	}
}
public class ch04ex05{
	public static final int SIZE=1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ch04ex0512 c[] = new ch04ex0512[SIZE];
		for (int i = 0; i < c.length; i++) {
			System.out.println("x y rad>>> ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int rad = scan.nextInt();
			c[i] = new ch04ex0512(x, y, rad);
		}
		for (int i = 0; i < SIZE; i++) {
			c[i].show();
		}
		scan.close();
		
	}
}

