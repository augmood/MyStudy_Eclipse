package com.kh.javaapi;


public class Exam_String {
	public static void main(String [] ars) {
		String data1 = new String("  C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1+"의 길이는 "+data1.length());
		System.out.println(data1.contains("#"));
		
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : "+data1);
		
		data1 = data1.trim();
		System.out.println("공백 제거 확인 : "+data1);
		
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열교체 : "+data1);
		
		String [] strs = data1.split(",");
		for(int i = 0; i<strs.length; i++) {
			System.out.println("분리된 문자열"+i+" : "+strs[i]);
		}
		
		// 문자열 자르기
		data1 = data1.substring(5);
		System.out.println("문자열 자르기 : " +data1);
		
		char c = data1.charAt(2);
		System.out.println("문자 자르기 : "+c);
	}

}
