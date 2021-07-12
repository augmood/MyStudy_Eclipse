package com.kh.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {
	public static void main(String [] args) {
		Reader reader = null;
		
		try {
			// reader ��Ʈ�� ��ü ����, text4 ������ ������ְ� ������ �Է��صд�.
			reader = new FileReader("C:\\temp\\text4.txt"); 
			int readData;
			// ���� -1�� �ƴҶ����� �ݺ� �����
			while((readData = reader.read()) != -1) {
				System.out.print((char)readData);
				// ���� ���� char�� ����ȯ�Ͽ� ���
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				reader.close(); // ��Ʈ�� �ڿ� ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
