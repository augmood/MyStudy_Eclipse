package com.kh.edu;

import java.util.Date; //ctrl+space에서 불러냄

public class TestJavaApi {
	public static void main(String [] args) {
		// Date 클래스 사용
		Date date = new Date(); //불러내기와 비슷 (날짜정보를 가지고 있음)
		System.out.println(date);
		//Date date = new Date();없이
		//System.out.println(new Date());만 써도 가능
	}
}
