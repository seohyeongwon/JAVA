package org.comstudy.ch04;

class Circle {
	int rad;
	String name;
	
	public Circle() {}
	
	public double Area() {
		return 3.14*rad*rad;
	}
} 
public class ch04excircle {

	public static void main(String[] args) {
	 //Circle pizza;
	 Circle pizza = new Circle();
	 pizza.rad = 10;
	 pizza.name = "자바 피자";
	 double area = pizza.Area();
	 System.out.println(pizza.name + " area " + area);
	 
	 Circle donut = new Circle();
	 
	 donut.rad = 2;
	 donut.name = "도넛";
	 area = donut.Area();
	 System.out.println(donut.name + " area "+ area);

	}

}
