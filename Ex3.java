package com.exam;

import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//표준입출력
		//입력(키보드) system.inread()
		//출력 (모니터 콘솔)system.out.println()
		
		System.out.println("데이터 입력 끝내려면 ctrl z(-1)를 누르세요");
		
		int data=0;
		
		try {
			while ((data=System.in.read()) !=-1) {
				System.out.print(data+" ");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
