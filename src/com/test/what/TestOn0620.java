package com.test.what;

/*
題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
*/

public class TestOn0620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		long arr[] = new long[36];
		arr[0] = arr[1] = 1;
		System.out.println("1 pair of bunnies on 1st month" + "," + "total=" + 2);
		System.out.println("1 pair of bunnies on 2nd month" + "," + "total=" + 2);
		for (i = 2; i <= 35; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(arr[i]+" pairs of bunnies on "+(i+1)+" month,"+"total="+2*arr[i]);

		}

	}

}
