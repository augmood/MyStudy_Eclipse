package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByteOff {
	public static void main(String [] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:\\temp\\text1.txt");
			int readByteNo;
			byte [] readBytes = new byte[8]; // 8개를 전부 읽는다.
			readByteNo = is.read(readBytes, 1, 4); // 알파벳을 처음부터 읽고, 이 위치에 출력을 하겠다.
			for (int i = 0; i < readBytes.length; i++) {
				System.out.print(readBytes[i]);
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
