package org.com.ch20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch20ex05 {

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("성명 입력: ");
		String name = br.readLine();
		System.out.print("주소 입력: ");
		String address = br.readLine();
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(br.readLine());

		System.out.printf("%s, %s, %d\n", name, address, age);
	}

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\person.txt");
		FileInputStream fis = new FileInputStream(file);

		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("성명 입력: ");
		String name = br.readLine();
		System.out.print("주소 입력: ");
		String address = br.readLine();
		System.out.print("나이 입력: ");
		int age = Integer.parseInt(br.readLine());

		System.out.printf("%s, %s, %d\n", name, address, age);
	}

}
