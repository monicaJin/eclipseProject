package com.test.what;

import java.util.ArrayList;
import java.util.Iterator;


public class DailyTest {
	
	
	public void test04() {
		/*
		 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ� 
(2)���n<>k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ���� 
(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ���� 
		 */
		
		int i=Integer.parseInt(ReadFunc.readStr());
		int ii=2;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		while(ii<=i) {
			if(i%ii==0) {
				if (Methods.mathMethods(ii)) {
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
		 * ��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺
		 * 153��һ��"ˮ�ɻ���"����Ϊ153=1�����η���5�����η���3�����η����뵱�꣬����Щ�ⶼ�������Ҵ𰸣�����¹���Ǩ������Ҳ�ûᡣ
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
		 * ��Ŀ���ж�101-200֮���ж��ٸ���������������������� �����ֽ����������ǳ���1��������֮�⣬��Ҳû�������ܱ�������������Ҳ��������ֻ���������ӡ�
		 */
		int i, count = 1;
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (i = 101; i <= 200; i++) {
			for (int ii = 2; ii < i; ii++) {
				if (i % ii == 0) {
					break;
				}
				if ((ii + 1) == i) {
					//System.out.println("�� " + count + " ������Ϊ: " + i);
					result.add(i);
					count++;
				}
			}
		}
		
		//����ArrayList
		Iterator<Integer> it=result.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println("\ntotal = "+result.size());
		
	}

	public void test01() {
		/*
		 * �}Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ �����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�
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
		int i, j, n, m, x; // n�������洢�����ģ�m������ͳ�ƾ���һ���������ӣ�
		n = 0;
		m = 0;
		x = 0; // x������ͳ��101~200֮ǰ�����ĸ���
		for (i = 101; i <= 200; i++) { // ����ѭ��
			for (j = 1; j <= i; j++) {
				n = i % j; // ȥ�������������Ϊ�㣬���Ǹ���������
				if (n == 0) {
					m = m + 1;
				} // ͳ��ĳ���ж��ٸ�����
			}
			if (m == 2) {
				System.out.print(i + " ");
				x = x + 1;
			} // ���ĳ��������ֻ��������������һ�������������������Ӧ�����
			m = 0; // һ��Ҫ���㣬��Ȼ������ۼ�
		}
		System.out.println();
		System.out.println("��101~200֮�gһ�����ؔ���" + x + "��");
	}

}
