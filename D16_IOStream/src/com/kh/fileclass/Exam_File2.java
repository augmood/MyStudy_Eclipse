package com.kh.fileclass;

import java.io.File;
import java.io.IOException;

public class Exam_File2 {
	public static void main(String [] args) throws IOException {
		
		File files = new File("parent");
		files.mkdir();
		
		File makeFile = new File("parent\\child.txt");
		makeFile.createNewFile();
		
		//���ϸ�, ���, ���Ͽ뷮, �������� �̸�
		System.out.println("���ϸ� : "+makeFile.getName());
		System.out.println("��� : "+makeFile.length());
		System.out.println("���Ͽ뷮 : "+makeFile.getPath());
		System.out.println("���������̸� : "+makeFile.getParent());
	}

}
