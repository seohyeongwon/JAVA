package org.comstudy.ch04.ex2;

import java.util.Scanner;

public class ch03ex14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cou[] = { "java", "c", "html", "ph" };
		int sco[] = { 76, 86, 65, 76 };

		while (true) {
			// boolean a = false;
			System.out.println("과목>>>");
			String name = s.next();
			int i;
			if (name.equals("stop")) {
				System.out.println("bye");
				break;
			}
			
			for (i = 0; i < sco.length; i++) {
				if (cou[i].equals(name)) {
					System.out.println(name + " sco " + sco[i]);
					// a = true;
					break;
				}

			}
			// if(a == false) {
			if (i == sco.length) {
				System.out.println("잘못");
			}

		}
	}
}
