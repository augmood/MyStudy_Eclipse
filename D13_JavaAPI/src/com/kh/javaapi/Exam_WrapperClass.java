package com.kh.javaapi;

public class Exam_WrapperClass {
	public static void main(String [] ars) {
		/*
		 * Wrapperclass 기본자료형을 객체화 해주는 클래스
		 * int, byte, short, double -> 객체 아님
		 * 
		 */
		
		int num = 3;
		Integer num3 = new Integer(3);
		Integer value = Integer.valueOf(3);
		
		Long lNum = new Long(21);
		Long lnum2 = Long.valueOf(21);
		
// 		오토언박싱
//		Integer iNum = new Integer(22);
		Integer iNum = 22;
//		int valueNum = iNum.intValue();
		int valueNum = iNum;
		
		String strNum  = "210618";
		int parseNum = Integer.parseInt(strNum);
		System.out.println("정수로 parsing : "+parseNum);
		
		String strNum2  = "3.14";
		double parseNum2 = Double.parseDouble(strNum2);
		System.out.println("실수로 parsing : "+parseNum2);
		
	}
}
