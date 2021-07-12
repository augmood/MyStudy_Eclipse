package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Writer {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer  = new FileWriter("C:\\temp\\text5.txt");
			char [] data = "자바다.".toCharArray(); // 문자기반이라 문자 단위로 읽어내서 한글 출력 가능
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
