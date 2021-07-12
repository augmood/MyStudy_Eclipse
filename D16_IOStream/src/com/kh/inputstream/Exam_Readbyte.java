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
			int readByteNo; // ��� ��� ���� ������
			byte [] readBytes = new byte[3]; // 3���� ��� �д´�.
			String data = "";
			while (true) {
				readByteNo = is.read(readBytes); 
				// ��� �о �� 3���� �о��.
				if(readByteNo == -1) break;
				data += new String(readBytes, 0 ,readByteNo);
				// ������ �о������� 0������ ���ʴ�� �����ؼ� ����Ѵ�. 
				
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
