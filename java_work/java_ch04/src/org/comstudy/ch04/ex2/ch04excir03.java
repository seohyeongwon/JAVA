package org.comstudy.ch04.ex2;

class Cir {
	int rad;

	public Cir(int rad) {
		this.rad = rad;
	}

	public double Area() {
		return 3.14 * rad * rad;
	}
}

public class ch04excir03 {
	public static void main(String[] args) {
		Cir[] c;
		c = new Cir[5];

		for (int i = 0; i < c.length; i++)
			
		c[i] = new Cir(i);

		for (int i = 0; i < c.length; i++)
			
		System.out.println((int) (c[i].Area()) + " ");
	}
}
