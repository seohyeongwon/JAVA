package org.comstudy.ch04homework;

public class ch04ex03 {
	private String title;
	private String art;
	private int year;
	private String coun;
	
	public ch04ex03() {}
	public ch04ex03(String title, String art, int year, String coun) {
		this.title = title;
		this.art = art;
		this.year = year;
		this.coun = coun;
	}
	
	public void show() {
		System.out.println("year>> "+year);
		System.out.println( "coun>> "+coun);
		System.out.println("sing>>> "+art);
		System.out.println("song>>> "+title);
	}
	
	

	public static void main(String[] args) {
		ch04ex03 mf = new ch04ex03("qwer", "asdf",2345, "usa");
		mf.show();
	}

}
