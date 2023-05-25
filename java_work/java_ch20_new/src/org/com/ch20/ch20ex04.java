package org.com.ch20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class ch20ex04 {

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream myIn = System.in;
		//OutputStream myOut = System.out;
		OutputStream myOut = new FileOutputStream("D:\\test_data.txt");
		
		int data=0;
		while((data=myIn.read()) !=-1) {
			
			myOut.write(data);
		}
		System.out.println("------");
	}
	
	public static void main2(String[] args) throws IOException {
		InputStream myIn = new FileInputStream("D:\\test_data.txt");
		OutputStream myOut = System.out;
		int data=0;
		while((data=myIn.read()) !=-1) {
			
			myOut.write(data);
		}

		myIn.close();
		myOut.close();
		System.out.println("---------");
	}
	
	public static void main(String[] args) throws IOException {
	      File file = new File("D:\\test_data.txt");
	      if(!file.exists()) {
	         System.err.println("오류: 파일이 존재하지 않습니다");
	         if(file.createNewFile()) {
	            System.out.println("새 파일이 생성 되었습니다");
	         }
	         //return;
	      }
	            
	      InputStream myIn = new FileInputStream(file);
	      OutputStream myOut = System.out;
	      
	      
	      int data = 0;
	      while((data = myIn.read()) != -1) {
	         myOut.write(data);
	      }
	      
	      
	      myIn.close();
	      myOut.close();
	      System.out.println("====== 완료 =====");
	      
	}
}
