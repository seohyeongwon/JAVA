package org.com.ch20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ch20ex06 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\persom.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("프로그래머");
		fw.close();
		
		main1(null);
	}

	public static void main1(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\persom.txt");
		FileReader fr = new FileReader(file);
		
		Scanner fscan = new Scanner(fr);
		while(fscan.hasNextLine()) {
			System.out.println(fscan.nextLine());
		}
		fscan.close();
		fr.close();
	}

}
