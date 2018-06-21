package com.test.what;

import java.util.ArrayList;
import java.util.Iterator;


public class DailyTest {

	public void test02() {
		/*
		 * 题目：判断101-200之间有多少个素数，并输出所有素数。 素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。
		 */
		int i, count = 1;
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (i = 101; i <= 200; i++) {
			for (int ii = 2; ii < i; ii++) {
				if (i % ii == 0) {
					break;
				}
				if ((ii + 1) == i) {
					//System.out.println("第 " + count + " 个素数为: " + i);
					result.add(i);
					count++;
				}
			}
		}
		
		//遍历ArrayList
		Iterator<Integer> it=result.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\ntotal = "+result.size());
		
	}

	public void test01() {
		/*
		 * 題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一 对兔子，假如兔子都不死，问每个月的兔子总数为多少？
		 */
		int i;
		long arr[] = new long[36];
		arr[0] = arr[1] = 1;
		System.out.println("1 pair of bunnies on 1st month" + "," + "total=" + 2);
		System.out.println("1 pair of bunnies on 2nd month" + "," + "total=" + 2);
		for (i = 2; i <= 35; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(arr[i] + " pairs of bunnies on " + (i + 1) + " month," + "total=" + 2 * arr[i]);

		}

	}

	public void template() {
		int i, j, n, m, x; // n是用来存储余数的；m是用来统计具体一个数的因子；
		n = 0;
		m = 0;
		x = 0; // x是用来统计101~200之前素数的个数
		for (i = 101; i <= 200; i++) { // 两重循环
			for (j = 1; j <= i; j++) {
				n = i % j; // 去余数，如果余数为零，就是该数的因子
				if (n == 0) {
					m = m + 1;
				} // 统计某数有多少个因子
			}
			if (m == 2) {
				System.out.print(i + " ");
				x = x + 1;
			} // 如果某数的因子只有两个，那它就一定是素数，那这个数就应该输出
			m = 0; // 一定要清零，不然会继续累加
		}
		System.out.println();
		System.out.println("在101~200之間一共有素數：" + x + "個");
	}

}
