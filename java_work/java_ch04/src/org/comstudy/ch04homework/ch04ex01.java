package org.comstudy.ch04homework;

class TV {
	String brand;
	int year;
	int inch;

	TV(String brand, int year, int inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	public void show() {
		System.out.println(brand + " " + year + "년형 " + inch + "인치 TV");
	}
}

public class ch04ex01 {
	public static void main(String[] args) {
		TV myTV = new TV("삼송", 2023, 52);
		myTV.show();
	}
}