package org.comstudy.ch04.ex2;

import java.util.Scanner;


class Circle{
	int rad;
	String name;
	
	public Circle() {
		rad = 1;
		name = "";
	}
	
	public Circle(int r, String n) {
		rad = r;
		name = n;
	}
	
	public double Area() {
		return 3.14*rad*rad;
	}
}
public class ch04excir2 {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "피자 여잇노");
		//Scanner s = new Scanner(System.in);
		
		double area = pizza.Area();
		System.out.println(pizza.name + "area " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛 피자";
		area = donut.Area();
		System.out.println(donut.name + "area " + area);
	}
}


