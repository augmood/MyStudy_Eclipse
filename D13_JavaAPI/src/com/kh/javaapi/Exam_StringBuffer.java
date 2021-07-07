
package com.kh.javaapi;

public class Exam_StringBuffer {
	public static void main(String [] ars) {
		/*
		 * StringBuffer 
		 * 문자열을 연결해주는 클래스
		 * 문자열의 연결? String -> concat 
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Java");
		
		System.out.println(sb.toString());
		
		StringBuffer stb = new StringBuffer()
				.append("KH ").append("Java Class").append(" Interesting");
		System.out.println(stb.toString());
		stb.delete(0, 3);
		System.out.println(stb.toString());
		
		String str = "Hello"+" "+"Java";
		System.out.println(str.toString());
	}

}
