package Ch03home;

public class ch03ex02home {
	
	//int total(int a,int b) {
		//int total =0;
		//for(int i=a; i<=b; i++) {
			//total +=i;
		//}
		//return total;
	//}

	public static void main(String[] args) {
		 //ch03ex02home ex02 = new ch03ex02home();
		 final int max =10;
		 for(int i=1, total=0; i<=max;i++) {
		 //System.out.print(i);
		 
		 if(i%2==0) {
	
			 System.out.print("+"+i);
		 }else if(i==1){
			 System.out.print(i);
		 }else {
			 
			 System.out.print("-"+i);
		 }
		 if(i%2==0) {
			 total+=i;
			 
		 }else {
			 total-=i;
			 
		 }
		 
		 
		 System.out.print("="+total);
		 } 
		 
		 //int a=1;
		 //int b=10;
		 //int s=ex02.total(a,b);
		 //System.out.println("total "+s);
	}

}
