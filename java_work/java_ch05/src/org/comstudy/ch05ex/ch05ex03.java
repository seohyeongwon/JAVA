package org.comstudy.ch05ex;

import java.util.Scanner;

abstract class CON2 {
	abstract double con(double src);

	abstract String gss();

	abstract String gds();

	double rat;

	void run() {
		Scanner s = new Scanner(System.in);
		System.out.println(gss() + " " + gds() + " change");
		System.out.println(gss() + " >>>>");
		double val = s.nextDouble();
		double res = con(val);
		System.out.println("change: " + res + " " + gds());
		s.close();
	}
}

class ch05ex03 extends CON2 {
	ch05ex03(double rat) {
		this.rat = rat;
	}

	@Override
	double con(double src) {
		return src / rat;
	}

	@Override
	String gss() {
		return "원";
	}

	@Override
	String gds() {
		return "달러";
	}

	public static void main(String[] args) {
		ch05ex03 tod = new ch05ex03(1360);
		tod.run();
	}
}
