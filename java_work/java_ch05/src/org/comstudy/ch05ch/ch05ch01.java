package org.comstudy.ch05ch;


class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x =x;
		this.y = y;
	}
	public void show() {
		System.out.println(x+" , "+y);
	}
}

class CP extends Point{
	private String col;

	public void setCol(String col) {
		this.col = col;
	}
	
	public void showcpp() {
		System.out.println(col);
		show();
		
	}
	}


public class ch05ch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.set(1, 2);
		p.show();
		
		CP cp = new CP();
		cp.set(3, 4);
		cp.setCol("red");
		cp.showcpp();
	}

}
