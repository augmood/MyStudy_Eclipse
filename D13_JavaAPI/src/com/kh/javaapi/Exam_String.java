package com.kh.javaapi;


public class Exam_String {
	public static void main(String [] ars) {
		String data1 = new String("  C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1+"�� ���̴� "+data1.length());
		System.out.println(data1.contains("#"));
		
		data1 = data1.concat(data2);
		System.out.println("����� ���ڿ� : "+data1);
		
		data1 = data1.trim();
		System.out.println("���� ���� Ȯ�� : "+data1);
		
		data1 = data1.replace("C#", "JAVA");
		System.out.println("���ڿ���ü : "+data1);
		
		String [] strs = data1.split(",");
		for(int i = 0; i<strs.length; i++) {
			System.out.println("�и��� ���ڿ�"+i+" : "+strs[i]);
		}
		
		// ���ڿ� �ڸ���
		data1 = data1.substring(5);
		System.out.println("���ڿ� �ڸ��� : " +data1);
		
		char c = data1.charAt(2);
		System.out.println("���� �ڸ��� : "+c);
	}

}
