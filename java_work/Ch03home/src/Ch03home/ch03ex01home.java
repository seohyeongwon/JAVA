package Ch03home;

public class ch03ex01home {
	
	public ch03ex01home() {
		System.out.println("나오나봐라");
	}

	public static void main(String[] args) {
		ch03ex01home ex01 = new ch03ex01home();

		ex01.start();
		ex01.sayHello("won!@#$#@!");
		int hello = ex01.sum(27,300);
		System.out.println("답은 = "+ hello);
	
	}

	private int sum(int i, int j) {
		return i+j + i-j;
	}

	private void sayHello(String name) {

		System.out.println("Hi "+name);
	}

	private void start() {
		System.out.println("start 불러라");
		
	}

}
