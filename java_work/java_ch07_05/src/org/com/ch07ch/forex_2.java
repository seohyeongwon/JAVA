package org.com.ch07ch;

public class forex_2 {
	public static void main1(String[] args) {
		int[] a = new int[5];
		int i;
		a[0] = 50;
		a[1] = 100;
		a[2] = 150;
		a[3] = 200;
		a[4] = 250;

		for (i = 0; i < 5; i++)
			System.out.println((i + 1) + " th a[" + i + "" + "]=" + a[i]);
	}

	public static void main2(String[] args) {
		int[] a = { 85, 90, 75, 100, 95 };
		int tot = 0;

		for (int i = 0; i < 5; i++) {
			tot += a[i];
		}
		double avg = tot / 5.0;
		// avg = (double) tot / 5.0;

		System.out.println(" 총합  = " + tot);
		System.out.println(" 평균  = " + avg);
	}

	public static void main(String[] args) {
		int[][] a = {{ 90, 85, 95 }, // 0번째 행에 대한 초기화
				{ 95, 75, 95 }, // 1번째 행에 대한 초기화
				{ 90, 80, 70 }, // 2번째 행에 대한 초기화
				{ 80, 90, 60 }, // 3번째 행에 대한 초기화
				{ 95, 65, 80 } // 4번째 행에 대한 초기화
		};
		int tot =0;
		System.out.println(" 국  수  영");
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 3; c++)
				tot += a[r][c];
				//System.out.print(" "+a[r][c]);
			//System.out.println();
			System.out.println(tot);
			tot -= tot;
		}	
	}
}
