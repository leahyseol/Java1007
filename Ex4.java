package com.exam;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex4 {

	
	public static void main(String[] args) {
		InputStream in =System.in;
		OutputStream out=System.out;
		
		System.out.println("데이터 입력 끝 ctrl z");
		
		int data=0;
		try {
		while((data= in.read()) != -1){
			out.write(data);
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
