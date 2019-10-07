package com.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 스트림 준비 - filereader
		File srcFile=new File("C:/temp");
		File destFile=new File("C:/temp2/한글.txt");
		
		if(!srcFile.exists()) {
			System.out.println("읽을 파일이 없습니다");
			return;
		}
		BufferedReader reader=null;
		
		//출력스트림 준비 - fileWriter
		FileWriter writer=null;
		
		try {
			reader=new BufferedReader(new FileReader(srcFile));
			writer=new FileWriter(destFile);
			
			String line="";
			while((line=reader.readLine()) !=null) {
				writer.write(line);
				writer.write( "\r\n");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
