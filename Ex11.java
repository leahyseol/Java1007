package com.exam;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ex11 {

	public static void main(String[] args) {
		// *바이너리 파일 복사하기(바이트단위스트림 사용)
		
		// 읽을 파일객체 준비
		File srcFile = new File("E:/temp/도라에몽.jpg");
		// 쓸 파일객체 준비
		File destFile = new File("E:/temp2/도라에몽.jpg");
		
		if (!srcFile.exists()) {
			System.out.println("읽을 파일이 없습니다.");
			return;
		}
		
		
		// 입력스트림 준비 - FileReader
		BufferedInputStream is = null;
		
		// 출력스트림 준비 - FileWriter
		FileOutputStream os = null;
		
		
		try {
			// 입력스트림 객체 준비
			is = new BufferedInputStream(new FileInputStream(srcFile));
			// 출력스트림 객체 준비
			os = new FileOutputStream(destFile);
			
			int data=0;
			while ((data = is.read()) != -1) {
				
			}
			
			System.out.println(srcFile.getPath() + "를 " 
					+ destFile.getPath() + "로 복사하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // 입력스트림 객체 닫기
				writer.close(); // 출력스트림 객체 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	} // main method

}
