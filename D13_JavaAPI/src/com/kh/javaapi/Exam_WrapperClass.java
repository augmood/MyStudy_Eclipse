package com.kh.javaapi;

public class Exam_WrapperClass {
	public static void main(String [] ars) {
		/*
		 * Wrapperclass �⺻�ڷ����� ��üȭ ���ִ� Ŭ����
		 * int, byte, short, double -> ��ü �ƴ�
		 * 
		 */
		
		int num = 3;
		Integer num3 = new Integer(3);
		Integer value = Integer.valueOf(3);
		
		Long lNum = new Long(21);
		Long lnum2 = Long.valueOf(21);
		
// 		�����ڽ�
//		Integer iNum = new Integer(22);
		Integer iNum = 22;
//		int valueNum = iNum.intValue();
		int valueNum = iNum;
		
		String strNum  = "210618";
		int parseNum = Integer.parseInt(strNum);
		System.out.println("������ parsing : "+parseNum);
		
		String strNum2  = "3.14";
		double parseNum2 = Double.parseDouble(strNum2);
		System.out.println("�Ǽ��� parsing : "+parseNum2);
		
	}
}
