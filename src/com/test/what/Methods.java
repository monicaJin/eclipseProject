package com.test.what;

public class Methods {
	
	//�ж��Ƿ�������
	public static boolean mathMethods(int i) {
		for (int ii=2; ii<i;ii++) {
			if (i%ii==0) {
				return false;
			}
		}
		return true;
	}

}
