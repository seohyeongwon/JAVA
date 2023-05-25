package org.comstudy.ch04.ex2;

class book {
	String title;
	String author;

	void show() {
		System.out.println(title + " " + author);
	}

	public book() {
		this("", "");
		System.out.println("생성자 호출");
	}

	public book(String title) {
		this(title, "작자미상");
	}

	public book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class ch04book02 {

	public static void main(String[] args) {
		book lp = new book("qwe", "asd");
		book ls = new book("zxc");
		book eb = new book();
		lp.show();
		ls.show();
		eb.show();
	}

}
