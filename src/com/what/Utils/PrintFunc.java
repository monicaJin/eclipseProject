package com.what.Utils;

import java.util.*;

public class PrintFunc {
	
	public static void printResult(ArrayList<?> list) {
		Iterator<?> i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println("\ntotal = "+list.size());
	}
	
}
