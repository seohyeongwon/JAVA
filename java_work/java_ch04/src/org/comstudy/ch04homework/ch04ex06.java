package org.comstudy.ch04homework;

import java.util.Scanner;

class Cir{
	private double x,y;
	private int rad;
	public Cir(double x, double y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;		
	}
	public void show() {
		System.out.println(x + " , "+ y + " -- "+ rad);
	}
	public double Area() {
		return Math.PI*rad;
	}
}

public class ch04ex06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cir c[] = new Cir [2];
		for (int i = 0; i < c.length; i++) {
			System.out.println("x y rad>>> ");
			double x = s.nextDouble();
			double y = s.nextDouble();
			int rad = s.nextInt();
			c[i]= new Cir(x,y,rad);
			}
		int bi=0;
		for (int i = 0; i < c.length; i++) {
			if(c[bi].Area()<c[i].Area()) {
				bi=i;
				System.out.print("big cir>>> ");
			}
		
		c[bi].show();
		s.close();
		}
	}

}
