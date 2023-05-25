package Ch03_;

public class ch03ex09 {

	public static void main(String[] args) {
		  // 자바 배열 선언
	      // 배열도 참조
	      int[] arr = new int[7];
	      System.out.println("arr.length => " + arr.length); // 7
	      
	      arr[0] = 10;
	      arr[1] = 7;
	      arr[2] = 5;
	      arr[3] = 100;
	      arr[4] = 30;
	      arr[5] = 25;
	      arr[6] = 55;  // 배열의 마지막 요소 첨자(index) == 배열.length - 1
	      
	      // 변수를 첨자로 사용 가능
	      // 배열의 요소중 가장 큰값 찾기
	      //System.out.println(Integer.MIN_VALUE);
	      int max = Integer.MIN_VALUE;
	      int min = Integer.MAX_VALUE;
	      for(int i=0; i<arr.length; i++) {
	         //System.out.println(arr[i]);
	         // 배열을 반복 하면서 가장 큰 요소 값을 max에 대입한다.
	         if(max < arr[i]) {
	            max = arr[i];
	         }
	         // 배열의 요소중 가장 작은 요소를 min에 대입.
	         if(min > arr[i]) {
	            min = arr[i];
	         }
	      }
	      System.out.println("Max => " + max);
	      System.out.println("Min => " + min);

	}

}
