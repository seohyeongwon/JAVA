package Ch03;

public class ch03ex03 {
 
	int total(int a,int b){
		int total = 0;
		for(int i=a;i<=b; i++) {
		total +=i;	
		}
	return total;
	}
	public static void main(String[] args) {
		ch03ex03 ex03 = new ch03ex03();

		int a = 1;
		int b = 100;
		int s = ex03.total(a,b);
		System.out.println("total " + s);
	}

}
