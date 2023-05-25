package org.comstudy.ch05ex;


import java.util.Scanner;

abstract class ktm2{
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

public class ch05ex04_2 extends ktm2 {

	ch05ex04_2(double rat) {
		this.rat = rat;
	}

	@Override
	double con(double src) {
		return src / rat;
	}

	@Override
	String gss() {
		return "평";
	}

	@Override
	String gds() {
		return "m^2";
	}

	public static void main(String[] args) {
		ch05ex04_2 kmtom = new ch05ex04_2(3.305785);
		kmtom.run();
	}
}
