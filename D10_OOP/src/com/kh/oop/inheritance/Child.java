package com.kh.oop.inheritance;

public class Child extends Parent {
	// ㄴ 부모님 돈 상속 완료됨 
	
	int myMoney = 1000;
	int money = 1500;
	
	// 생략 가능함  (지가 알아서 호출함)
//	public Child () {
//		super();
//	}
	
	public void printInfo() {
		System.out.println("자식의 돈 : "+this.myMoney);
//		System.out.println("부모의 돈 : "+super.money); // private 선언 했을떄는 이렇게 못써 허락 안해줌
//		System.out.println("부모의 돈 : "+super.getMoney()); // private 선언하고 getter, setter 살리면 가능
		System.out.println("부모의 돈 1: "+this.money); // 이건 가져다 쓰는거 x 진짜 내꺼임 내가 가져온거 
		System.out.println("부모의 돈 2: "+super.money); // 슈퍼는 엄마꺼!! 디스는 내꺼!!
	}
	
	// 오버라이딩 했삼 (할거면 부모꺼랑 내용빼고는 다 똑같이 써야됨)
	@Override 
	public void pizzaRecipe() { // 엄마 레시피를 바꿀거야 내가 
		System.out.println("도우는 치즈크러스트, 고구마는 빼주시고 옥수수 마니");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "myMoney : " + this.myMoney + ", money : " +this.money;
		
	}
}
