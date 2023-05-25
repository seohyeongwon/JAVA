package org.comstudy.ch05ex;

class Point {
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ch05ex05 extends Point {
	int x,y;
	String col;
	ch05ex05(int x, int y, String col){
		super(x,y);
		this.col = col;
	}
	public void setXY(int x,int y) {
		move(x,y);
	}
	public void setCol(String col) {
		this.col = col;
	}
	@Override
	public String toString() {
		return "col " + col +" " +getX() + " ,"+getY();
	}
	
	public static void main(String[] args) {
		ch05ex05 cp = new ch05ex05(14,34,"YE");
		cp.setXY(53,54);
		cp.setCol("Red");
		String str = cp.toString();
		System.out.println(str+ " ~~~~");

	}

}
