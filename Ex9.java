package com.exam;

import java.io.File;
import java.util.Date;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("C:/temp");
		File file = new File("C:/temp/test2.txt");
		
		System.out.println("디렉토리여부: "+directory.isDirectory());
		System.out.println("파일여부: " + file.isFile());
		
		System.out.println("파일이름: " + file.getName());
		System.out.println("파일경로: " + file.getAbsolutePath());
		System.out.println("파일수정일: " + new Date(file.lastModified()));
		System.out.println("파일크기: "+ file.length()+"바이트");
		System.out.println("파일쓰기속성: "+ file.canWrite());
		System.out.println("파일존재여부: "+ file.exists());
		//파일이 존재하면 삭제
		
		if(file.exists()) {
			file.delete();
		}
		System.out.println("파일존재여부: "+ file.exists());
		
		File directory2 = new File("E:/temp/2019-10-07");
		if (!directory2.exists()) {
			directory2.mkdir(); // 디렉토리 생성하기
			
			//디렉토리에 포함된 파일정보 목록
			File[] files = directory.listFiles();
			for(File f:files) {
				System.out.println(f.getPath()+"|t");
				System.out.println(f.getParent());
				System.out.println(f.getName());
				
			}//for
		}//main
		
	}

}
