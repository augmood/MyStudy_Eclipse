package com.kh.oop.inheritance;

public class Parent {
	
	protected int money = 2000; //protected ��ӹ��� Ŭ������ ���� ���� �ϴ� ��� ok
	
	// �θ� Ŭ���� ������ -> ���� ����
//	public Parent() {}
	
//	public int getMoney() {
//		return money;
//	}
//	
//	public void setMoney(int money) {
//		this.money = money;
//	}
	
	public void printMessage() {
		System.out.println("�츣����");
	}
	
	public void pizzaRecipe() {
		System.out.println("����� ��� ġ��� ����");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "money : " + this.money;
	}
	

}
