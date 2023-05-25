package Ch03home;

public class ch03ex03home {
	public static void main(String[] args) {
		final int max =10;
		 for(int i=1, total=0; i<=max;i++) {
			 if(i%2==0) {
				 total+=i;
			 }else {
				 total-=i;
			 }
			 if(i%2==0) {	
				 System.out.print("+"+i);
			 }else if(i==1){
				 System.out.print(i);
			 }else {
				 System.out.print("-"+i);
			 }
			 System.out.print("="+total);
			 } 
	}

}
