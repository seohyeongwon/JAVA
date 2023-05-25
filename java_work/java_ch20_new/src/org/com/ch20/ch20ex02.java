package org.com.ch20;

import java.io.IOException;

public class ch20ex02 {
	public static int getNum() {
		int num = 0;
		int ch = 0;

		try {
			while ((ch = System.in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
					//대신 파일 출력
					//char data
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" int>>> ");

		int number = getNum();
		System.out.println("입력 된 정수는 " + number);
		System.out.println(number + " * 10 = " + number * 10);

	}

}
