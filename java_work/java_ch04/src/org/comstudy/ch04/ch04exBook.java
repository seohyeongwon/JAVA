package org.comstudy.ch04;

import java.util.Scanner;

class Book {
	String title, author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class ch04exBook {

	public static void main(String[] args) {
		Book[] book = new Book[2];

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.println("name>>> ");
			String title = s.nextLine();
			System.out.println("aut>>> ");
			String author = s.nextLine();
			book[i] = new Book(title, author);
		}
		for (int i = 0; i < book.length; i++)
			
		System.out.println("(" + book[i].title + "," + book[i].author + ")");
		s.close();
	}

}
