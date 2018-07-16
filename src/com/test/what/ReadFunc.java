package com.test.what;

import java.io.*;

public class ReadFunc {
	public  static String readStr() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		
		System.out.println("pls input your value: ");
		
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return str;
		
	}

}
