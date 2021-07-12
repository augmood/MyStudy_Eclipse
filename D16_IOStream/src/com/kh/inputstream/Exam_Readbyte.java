package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Readbyte {
	public static void main(String [] ars) {
		InputStream is = null;
		try {
			is = new FileInputStream("C:\\temp\\text1.txt");
			int readByteNo; // 몇개씩 끊어서 읽을 것인지
			byte [] readBytes = new byte[3]; // 3개씩 끊어서 읽는다.
			String data = "";
			while (true) {
				readByteNo = is.read(readBytes); 
				// 계속 읽어낼 것 3개씩 읽어낸다.
				if(readByteNo == -1) break;
				data += new String(readBytes, 0 ,readByteNo);
				// 무엇을 읽었는지를 0번부터 차례대로 저장해서 출력한다. 
				
			}
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
