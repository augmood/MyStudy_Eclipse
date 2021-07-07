package com.kh.oop.simpleinterface;

public class Run {
	public static void main(String [] args) {
		A a = new A();
		a.setX(new B());
		a.print();
		a.setX(new C());
		a.print();
	}

}
