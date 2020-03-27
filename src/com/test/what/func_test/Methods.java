package com.test.what.func_test;

import java.util.ArrayList;

import com.test.what.Utils.PrintFunc;

public class Methods {
	
	//判断是否是质数
	public static boolean isPrime(int i) {
		for (int ii=2; ii<i;ii++) {
			if (i%ii==0) {
				return false;
			}
		}
		return true;
	}

	//将一个正整数分解质因数
	public static ArrayList<Integer> getPrimeFactor(int i) {
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
		return list;
		
	}

}
