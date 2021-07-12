package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String [] args) {
		Reader reader = null;
		
		try {
			// reader 스트림 객체 생성, text4 파일을 만들어주고 내용을 입력해둔다.
			reader = new FileReader("C:\\temp\\text4.txt"); 
			int readData;
			// 값이 -1이 아닐때까지 반복 출력함
			while((readData = reader.read()) != -1) {
				System.out.print((char)readData);
				// 읽은 값을 char로 형변환하여 출력
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				reader.close(); // 스트림 자원 해제
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
