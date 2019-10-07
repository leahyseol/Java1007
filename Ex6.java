package com.exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// byte입력스트림 -> char입력스트림 변환 처리 -> 버퍼 처리
		
		InputStreamReader reader = null;
				
		try {
			reader = new InputStreamReader(
					new FileInputStream("C:\\temp\\hangul.txt"), 
					"utf-8");
			
			String line="";
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // IO 객체 자원닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
