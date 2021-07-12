package com.kh.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null; // �߻�Ŭ������ new InputStream �Ұ���
		// Checked Exception �̶�� �� (���� ó�� ����)
		try {
			is = new FileInputStream("C:\\temp\\text1.txt"); // abcde�� �Է��� txt���� 
			int readByte; // catch�� �߰��ؼ� ����ó���� ���ش�
			while(true) {
				readByte = is.read(); // test.1�� ��� �о���δ�.
				if(readByte == -1) break; // -1�� �Ǹ� �׸� �д´�.
				System.out.println(readByte);
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
