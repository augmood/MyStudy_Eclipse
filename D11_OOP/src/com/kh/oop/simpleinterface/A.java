package com.kh.oop.simpleinterface;

public class A {
	
//	B b;
//	C c;
//	
//	public A() {
//		b = new B();
//		c = new C();
	
	private X x; // 상속받은 객체들을 받아서 출력함
	public void setX(X x) {
		this.x = x;
		
	}
	public void print() {
		// 합계 출력
		System.out.println(x.total());
//		System.out.println(b.total());
//		System.out.println(c.total());
	}

}
