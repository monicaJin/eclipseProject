package com.test.what;

public class Methods {
	
	//判断是否是质数
	public static boolean mathMethods(int i) {
		for (int ii=2; ii<i;ii++) {
			if (i%ii==0) {
				return false;
			}
		}
		return true;
	}

}
