package com.kh.oop.inheritance2;

public class Sub extends Super {

	int money = 1500;
	
	public void printInformation() {
		System.out.println("money�� �� : "+this.money);
		System.out.println("money�� �� : "+super.money);
	}
	
	@Override
	public void print() {
		System.out.println("���� �ڽ��� print()");
	}
}
