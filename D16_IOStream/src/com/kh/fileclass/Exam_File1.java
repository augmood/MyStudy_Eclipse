package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File1 {
	public static void main(String [] args) throws IOException {
	/*
	 * 1. �۾��ϴ� workspace�� ���� ����
	 * 2. �⺻ ����̺곪 ������ ���� �����ϱ�
	 * 3. ���� ����� ���� �����ϱ�
	 * 4. �������� ���� �����
	 * 5. ���� ���� Ȯ��
	 * 6. ���� ���� Ȯ��
	 */
	
	//fileOutputStream fos = new FileOutputStream("C:\\temp\\.test1.txt"); // �̰� ��ο� ����
	File file = new File("fileMake.txt"); // 1
	file.createNewFile();
	File file2 = new File("C:\\temp\\.test1.txt"); // 2
	file2.createNewFile();
	File file3 = new File("D:\\temp2");
	file3.mkdir();
	File file4 = new File("D:\\temp2\\temp22");
	file4.mkdirs();
	
	System.out.println("������ �����ϴ°�? : "+file.exists());
	System.out.println("fileMaker�� ������ �´°�? : "+file.isFile());
	System.out.println("temp2�� ������ �´°�? : "+file3.isFile());

	}
}
