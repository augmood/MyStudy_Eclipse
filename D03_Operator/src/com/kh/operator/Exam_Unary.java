package com.kh.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		
		//1번 문제
		System.out.println("1번 문제");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		
		int a = 10;
	    int b = 20;
	    int c = 30;
	    
	    a++;
	    b = (--a) + b;
	    c = (a++) + (--b);
	    
	    System.out.println("a값 : "+a);
	    System.out.println("b값 : "+b);
	    System.out.println("c값 : "+c);
	    System.out.println();
	    
		//2번문제
		System.out.println("2번 문제 ");
		boolean flag = true;
		System.out.println("결과 값 : " + !!!!flag);
		System.out.println("2번 문제 끝 ");
		System.out.println(); // 개행
		
		//3번문제
		System.out.println("3번 문제");
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99+ x++ +x;
		y = y-- + y + ++y;
		
		System.out.println("x값 : "+x);
		System.out.println("y값 : "+y);
		System.out.println("z값 : "+z);
		System.out.println();
		
	}

}
