package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String [] args) {
		Reader reader = null;
		
		try {
			reader = new FileReader("C:\\temp\\text4.txt");
			int readCharNo;
			char [] cbuf = new char[2]; // 2개씩 끊어서 읽겠다.
			String data = "";
			while((readCharNo = reader.read(cbuf)) != -1) {
				data += new String(cbuf, 0 , readCharNo); 
			}
			System.out.print(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
