package com.kh.myexception;

import java.io.FileReader;
import java.io.Reader;

public class Exam_Exception3 {
	public static void main(String [] args) {
		//NumberFormatException, ����ȯ (����->����)
		//wrapper Ŭ����
		//���߿� ���ƿͼ� �ۼ�
		String [] strNumber = {"23", "12","3.14","98"};
		int i = 0;
		 try {
			 for (i = 0; i < strNumber.length; i++) {
				 int parseNum = Integer.parseInt(strNumber[i]);
				 System.out.println("���ڷ� ��ȯ�� ���� : "+parseNum);
			 }
		 }catch(NumberFormatException ex) {
			 System.out.println(strNumber[i]+ "�� ������ ��ȯ�� �� �����ϴ�");
		 }
		
		}
	}

