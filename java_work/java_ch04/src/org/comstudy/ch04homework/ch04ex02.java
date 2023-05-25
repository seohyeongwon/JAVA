package org.comstudy.ch04homework;

import java.util.Scanner;

class Gra {
	int mat;
	int ko;
	int eng;

	Gra(int mat, int sci, int eng) {
		this.mat = mat;
		this.ko = ko;
		this.eng = eng;
	}

	public int ave() {
		return (mat + ko + eng) / 3;
	}
}

public class ch04ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("수학, 국어, 영어 순으로 3개의 정수 입력 >> ");
		int mat = scan.nextInt();
		int ko = scan.nextInt();
		int eng = scan.nextInt();
		Gra total = new Gra(mat, ko, eng);
		System.out.println("평균은 " + total.ave());

		scan.close();
	}
}