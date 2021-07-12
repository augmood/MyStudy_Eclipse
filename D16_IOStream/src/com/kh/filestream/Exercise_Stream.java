package com.kh.filestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_Stream {
	
	public static void main(String [] args) throws Exception {
		
		/* 
		 * ������ ���� �� : text11. txt
		 * �����Է� : 
		 * ����� exit
		 * 1 :1111 
		 * 2 :2222
		 * 3 :3333
		 * 4 :4444
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� : ");
		String fileName = sc.next();
		sc.nextLine(); // ���� ����
		FileOutputStream fos = new FileOutputStream("C:\\temp\\"+fileName); // ������ ����� �ݴϴ�.
		System.out.println("'"+fileName+"' ���Ͽ� ����� ���� �Է� : ");
		System.out.println("����� exit");
		int lineNumber = 1;
		
		while(true) {
			System.out.print(lineNumber++ +" : "); // lineNumber++ 1: 2: �޴� ���� ���� �÷���
			String str = sc.nextLine() + "\n"; // ���⿡�� ������ ����� break�� �ɸ�
			byte [] buf = str.getBytes(); // �ٸ��� ���� ���� ��������
			if(str.equals("exit\n")) { // exit�� ������ ������
				break;
			}
			fos.write(buf); // ����� �����
		}
		fos.flush();
		fos.close();  // ������Ʈ+F5�� ������ �ϼ��� ������ ����
	}

}
