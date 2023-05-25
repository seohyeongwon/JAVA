package org.comstudy.ch05ex;

import java.util.Scanner;

abstract class ktm{
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

class ch05ex04 extends ktm {
	ch05ex04(double rat) {
		this.rat = rat;
	}

	@Override
	double con(double src) {
		return src / rat;
	}

	@Override
	String gss() {
		return "km";
	}

	@Override
	String gds() {
		return "mile";
	}

	public static void main(String[] args) {
		ch05ex04 kmtom = new ch05ex04(1.6);
		kmtom.run();
	}
}
