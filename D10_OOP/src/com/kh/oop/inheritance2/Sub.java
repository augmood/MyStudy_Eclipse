package com.kh.oop.inheritance2;

public class Sub extends Super {

	int money = 1500;
	
	public void printInformation() {
		System.out.println("money의 값 : "+this.money);
		System.out.println("money의 값 : "+super.money);
	}
	
	@Override
	public void print() {
		System.out.println("나는 자식의 print()");
	}
}
