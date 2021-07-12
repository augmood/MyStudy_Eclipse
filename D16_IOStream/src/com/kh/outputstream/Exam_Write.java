package com.kh.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String [] args) {
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\temp\\text2.txt"); // �� ������ ����
			byte [] data = "Hello Java I/O".getBytes(); // �� ������ byte�� ��ȯ�Ͽ� ����Ϸ��� ��
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]); // data�� ����� ������ ó������ ������ ����Ѵ�.
			}
			os.flush(); // ���ۿ� ��Ƶ� ���� �ѹ� ����ش�. ���⼭�� �Ƚᵵ ��¿��� ���� ����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {  // ���ʿ��� ����Ŭ�� ���� �ʰ� �����ش�.
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
