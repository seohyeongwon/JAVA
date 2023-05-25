package org.comstudy.ch04homework;

import java.awt.Rectangle;

public class ch04ex04 {
	int x,y,width,height;
	
	public ch04ex04() {
		//dafault
	}
	
	public ch04ex04(int x,int y,int w, int h) {
		//생성자 오버로딩
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	
	//메소드 선언
	public void show() {
		System.out.printf("(%d, %d) area %d\n", x, y, width*height);
	}
	public int square() {
		return width*height;
	}
	
	public boolean c2(int a, int start, int end) {
		if(a>=start && x<=end) {
			return true;
		}
		return false;
	}
	
	public boolean contains(ch04ex04 r) {
		if(c2(r.x, x, x+width) && c2(r.y, y, y+height)) {
			if(c2(r.x+r.width, x, x+width) && c2(r.y+r.height, y, y+height)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		ch04ex04 r = new ch04ex04(2,2,8,7);
		ch04ex04 s = new ch04ex04(5,5,6,6);
		ch04ex04 t = new ch04ex04(1,1,10,10);
		
		r.show();
		s.show();
		t.show();
		System.out.println("r area>> "+ r.square());
		System.out.println("s area>> "+ s.square());
		System.out.println("t area>> "+ t.square());
		if(t.contains(r)) {
			System.out.println("t>r");
			}
		if(t.contains(s)) {
			System.out.println("t>s");
			}
		if(t.contains(t)) {
			System.out.println("t");
			}
	}

}
