package com.kh.myexception;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exam_Exception1 {
	public static void main(String [] ars) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		try {
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			int result = num1 / num2;
			System.out.println(num1+"을"+num2+"로 나눈 몫은"+result+"입니다.");
			// exception도 상관 없는 이유가 ArithmeticException이 Exception 상속을 받았기 때문
			}catch(ArithmeticException ex) {  
			System.out.println("0으로 나눌 수 없습니다."+ex.getMessage());
			}catch(InputMismatchException e){
				System.out.println("문자열은 입력할 수 없습니다."+e.getMessage());
				sc.next(); // 입력한 문자열을 버려준다
				continue; // 다시 시작해준다
			} finally {
				System.out.println("이 블록은 무조건 실행됩니다.");
			}
		
		}
	}
}
