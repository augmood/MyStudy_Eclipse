package com.kh.oop.simpleinterface;

public class A {
	
//	B b;
//	C c;
//	
//	public A() {
//		b = new B();
//		c = new C();
	
	private X x; // ��ӹ��� ��ü���� �޾Ƽ� �����
	public void setX(X x) {
		this.x = x;
		
	}
	public void print() {
		// �հ� ���
		System.out.println(x.total());
//		System.out.println(b.total());
//		System.out.println(c.total());
	}

}
