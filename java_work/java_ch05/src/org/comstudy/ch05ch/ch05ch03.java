package org.comstudy.ch05ch;

class Shape { // 슈퍼 클래스
	public Shape next;

	public Shape() {
		next = null;
	}

	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class ch05ch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape start, last, obj;
		// 링크드 리스트로 도형 생성하여 연결
		start = new Shape(); // Line 객체 연결
		last = start;
		
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		
		obj = new Rect();
		last.next = obj; // Rect 객체 연결
		last = obj;
		
		obj = new Line(); // Line 객체 연결
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle 객체 연결
		last.next = obj;
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Rect();
		last.next = obj; // Rect 객체 연결
		last = obj;
		
		obj = new Line();
		last.next = obj;
		last = obj;
		
		obj = new Shape();
		last.next = obj; // Rect 객체 연결
		last = obj;
		
		
		
		// 모든 도형 출력
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;

		}
	}
}
