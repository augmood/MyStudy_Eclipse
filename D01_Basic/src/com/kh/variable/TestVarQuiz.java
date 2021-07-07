package com.kh.variable;

public class TestVarQuiz {
	public static void main(String [] args) {
		System.out.println("Hello"+'q'); //helloq
		System.out.println("Hello"+3.14); //hello3.14
		System.out.println(10+20+"Hello"); //30hello
		System.out.println(10+"Hello"+20); //10hello20
		System.out.println("Hello"+10); //hello10
		System.out.println(10+"Hello"); //10hello
		System.out.println(10+(20+"Hello")); //1020hello
	}

}
