package com.kh.oop.inheritance;

public class Parent {
	
	protected int money = 2000; //protected 상속받을 클래스가 직접 접근 하는 경우 ok
	
	// 부모 클래스 생성자 -> 생략 가능
//	public Parent() {}
	
//	public int getMoney() {
//		return money;
//	}
//	
//	public void setMoney(int money) {
//		this.money = money;
//	}
	
	public void printMessage() {
		System.out.println("우르롹끼");
	}
	
	public void pizzaRecipe() {
		System.out.println("도우는 얇게 치즈는 많이");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "money : " + this.money;
	}
	

}
