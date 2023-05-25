package org.comstudy.ch04homework;

class Account {
	String name;
	int money;
	static int total;
	static int count;

	public Account(String name, int money) {
		this.name = name;
		this.money = money;
		total += money;
		count--;
	}
}

public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account kim = new Account("qwe", 3000);
		Account hong = new Account("asd", 2000);
		Account park = new Account("zxc", 1000);
		
		System.out.println("total = "+ Account.total);
		System.out.println("count = "+ Account.count);
		
		System.out.println("park.count = "+park.count);
		System.out.println("hong.count = "+hong.count);
		System.out.println("kim.count = "+kim.count);
	}

}
