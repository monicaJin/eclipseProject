package com.what.Utils;

import java.io.*;

public class ReadFunc {
	public  static String readStr(String introduction) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		
		if (introduction=="") {
			introduction="pls input your value: ";
		}
		
		System.out.println(introduction);
		
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return str;
		
	}

}
