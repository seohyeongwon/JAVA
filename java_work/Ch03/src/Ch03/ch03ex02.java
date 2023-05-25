package Ch03;

public class ch03ex02 {

	String hello(String str1, String str2){
		return str1+" "+str2;
	}
	public static void main(String[] args) {
        ch03ex02 obj = new ch03ex02();
		
		String greet = obj.hello("Hello ", "won");
		System.out.println("message: "+greet);

	}

}
