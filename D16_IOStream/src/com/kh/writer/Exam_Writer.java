package com.kh.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Writer {
	public static void main(String [] args) {
		Writer writer = null;
		
		try {
			writer  = new FileWriter("C:\\temp\\text5.txt");
			char [] data = "�ڹٴ�.".toCharArray(); // ���ڱ���̶� ���� ������ �о�� �ѱ� ��� ����
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
