package com.kh.oop.inheritance;

public class Child extends Parent {
	// �� �θ�� �� ��� �Ϸ�� 
	
	int myMoney = 1000;
	int money = 1500;
	
	// ���� ������  (���� �˾Ƽ� ȣ����)
//	public Child () {
//		super();
//	}
	
	public void printInfo() {
		System.out.println("�ڽ��� �� : "+this.myMoney);
//		System.out.println("�θ��� �� : "+super.money); // private ���� �������� �̷��� ���� ��� ������
//		System.out.println("�θ��� �� : "+super.getMoney()); // private �����ϰ� getter, setter �츮�� ����
		System.out.println("�θ��� �� 1: "+this.money); // �̰� ������ ���°� x ��¥ ������ ���� �����°� 
		System.out.println("�θ��� �� 2: "+super.money); // ���۴� ������!! �𽺴� ����!!
	}
	
	// �������̵� �߻� (�ҰŸ� �θ𲨶� ���뻩��� �� �Ȱ��� ��ߵ�)
	@Override 
	public void pizzaRecipe() { // ���� �����Ǹ� �ٲܰž� ���� 
		System.out.println("����� ġ��ũ����Ʈ, ������ ���ֽð� ������ ����");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "myMoney : " + this.myMoney + ", money : " +this.money;
		
	}
}
