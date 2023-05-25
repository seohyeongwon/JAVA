package org.com.ch20;

import static java.lang.System.*;

import java.io.IOException;

public class ch20ex01 {

	public static void main(String[] args) throws IOException {
		int data = 0 ;
		//EOF end of file ctrl+z
		System.out.println("데이터 입력 ctrl+z 는 끝 : ");
		while((data= in.read())!=-1) {
			System.out.print((char)(data));
		}
		System.out.println("-----------");
	}

} 
