package Ch03;

public class ch03ex01 {

	public static void main(String[] args) {
          ch03ex01 ex = new ex01();
          ex.start();
          ex.sayHello("won!!");
          
          int result = ex.sum(10,12);
  		  System.out.println("result= "+result);
	}
    private int sum(int x, int y) {
		
		return x + y ;
	}

	private void sayHello(String name) {
        System.out.println("say Ho"+ name);
		
	}

	private void start() {
		System.out.println("start 호출!@#");
		
	}

}
