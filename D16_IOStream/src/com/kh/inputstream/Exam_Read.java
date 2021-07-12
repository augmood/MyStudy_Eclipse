package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null; // 추상클래스라서 new InputStream 불가능
		// Checked Exception 이라고 함 (예외 처리 강제)
		try {
			is = new FileInputStream("C:\\temp\\text1.txt"); // abcde를 입력한 txt파일 
			int readByte; // catch를 추가해서 예외처리를 해준다
			while(true) {
				readByte = is.read(); // test.1을 계속 읽어들인다.
				if(readByte == -1) break; // -1이 되면 그만 읽는다.
				System.out.println(readByte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
