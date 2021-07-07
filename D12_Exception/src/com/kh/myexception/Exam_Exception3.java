package com.kh.myexception;

import java.io.FileReader;
import java.io.Reader;

public class Exam_Exception3 {
	public static void main(String [] args) {
		//NumberFormatException, 형변환 (문자->숫자)
		//wrapper 클래스
		//나중에 돌아와서 작성
		String [] strNumber = {"23", "12","3.14","98"};
		int i = 0;
		 try {
			 for (i = 0; i < strNumber.length; i++) {
				 int parseNum = Integer.parseInt(strNumber[i]);
				 System.out.println("숫자로 변환된 값은 : "+parseNum);
			 }
		 }catch(NumberFormatException ex) {
			 System.out.println(strNumber[i]+ "는 정수로 변환할 수 없습니다");
		 }
		
		}
	}

