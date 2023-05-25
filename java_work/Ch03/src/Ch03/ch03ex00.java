package Ch03;

public class ch03ex00 {
	public ch03ex00() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자 호출 됨");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ch03ex00 ex00;
		ch03ex00 ex00 = new ch03ex00();
		ex00.start();
		
		ex00.sayHello("won!!");
		int result = ex00.sum(10,12);
		System.out.println("result= "+result);
	}
	private int sum(int x, int y) {
		
		return x + y ;
	}
	private void sayHello(String name) {
		System.out.println("Hello"+name);
		
	}
	private void start() {
		System.out.println("start() 메소드 호출!");
		
	}

}
