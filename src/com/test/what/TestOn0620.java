package com.test.what;

/*
�}Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ
�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
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
