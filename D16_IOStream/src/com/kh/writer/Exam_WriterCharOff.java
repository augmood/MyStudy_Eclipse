package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterCharOff {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("C:\\temp\\text5.txt");
			char [] cbuf = "Ŀ�ǰ����ð�ʹ�.".toCharArray();
			writer.write(cbuf, 3, 2);
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
