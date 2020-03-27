package com.what.func_test;

import java.util.ArrayList;

import com.what.Utils.PrintFunc;
import com.what.Utils.ReadFunc;

import java.util.*;

public class DailyTest {
	
	
	public void test07() {
		/*
		 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 
		 */
		
		
		
		
		
		
		
	}
	
	public void test06() {
		/*
		 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
		 */
		
		int firstnum=Integer.parseInt(ReadFunc.readStr("pls input your first number: "));
		int secondnum=Integer.parseInt(ReadFunc.readStr("pls input your second number: "));
		ArrayList<Integer> firstlist=new ArrayList<Integer>(Methods.getPrimeFactor(firstnum));
		ArrayList<Integer> secondlist=new ArrayList<Integer>(Methods.getPrimeFactor(secondnum));

		ArrayList<Integer> commonFactorList=new ArrayList<Integer>();
		ArrayList<Integer> uniqueFactorList=new ArrayList<Integer>();
		Integer commonFactor=1,commonMultiple=1;
	
		ArrayList<Boolean> firstboo=new ArrayList<Boolean>();
		ArrayList<Boolean> secondboo=new ArrayList<Boolean>();
		
		//initializing boo list
		for (Integer i:firstlist) {
			firstboo.add(false);
		}		
		for (Integer i:secondlist) {
			secondboo.add(false);
		}
	
		//generate commonFactor list & partial commonMultiple list
		for (int i=0;i<firstlist.size();i++) {
			for (int ii=0;ii<secondlist.size();ii++) {
				if (secondlist.get(ii)==firstlist.get(i)) {
					if (secondboo.get(ii)==false && firstboo.get(i)==false) {
						commonFactorList.add(firstlist.get(i));
						secondboo.add(ii,true);
						firstboo.add(i,true);
						break;
					}
				}
			}
			if (firstboo.get(i)==false) {
				uniqueFactorList.add(firstlist.get(i));
			}
		}

		if (commonFactorList.size()!=0) {
			Iterator<Integer> ite=commonFactorList.iterator();
			while(ite.hasNext()) {
				commonFactor=commonFactor*ite.next();
			}
		}
		System.out.println("commonFactor is : "+commonFactor);
		
		
		///////////////generate  Common Multiple
		
		for (int i=0;i<secondlist.size();i++) {
			if(secondboo.get(i)==false) {
				uniqueFactorList.add(secondlist.get(i));
			}
		}
		
		Iterator<Integer> uniqueite=uniqueFactorList.iterator();		
		while(uniqueite.hasNext()) {
			int uni=uniqueite.next();
			System.out.println("uni: "+uni);
			commonMultiple=commonMultiple*uni;
		}
		commonMultiple=commonMultiple*commonFactor;
		System.out.println("commonMultiple is : "+commonMultiple);
		
		
	}
	
	
	public void test04() {
		/*
		 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。 
(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。 
(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。 
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。 
		 */
		
		int i=Integer.parseInt(ReadFunc.readStr(""));
		int ii=2;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		while(ii<=i) {
			if(i%ii==0) {
				if (Methods.isPrime(ii)) {
					list.add(ii);
					i=i/ii;
					ii=2;
					continue;
				}
			}
			ii++;
		}
		PrintFunc.printResult(list);
		
	}
	
	public void test03(){
		/*
		 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
		 * 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。想当年，做这些题都是网上找答案，如今事过境迁，不会也得会。
		 */
		
		int i;
		ArrayList<Integer> result=new ArrayList<Integer>();
		
		for (i=101;i<=999;i++) {
			int a=(i%1000)/100;
			int b=(i%100)/10;
			int c=i%10;
			int sum=a*a*a+b*b*b+c*c*c;
			if(sum!=i) {
				continue;
			}
			result.add(i);
		}
		
		PrintFunc.printResult(result);
		
		
	}

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
