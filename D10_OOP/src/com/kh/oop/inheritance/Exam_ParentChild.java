package com.kh.oop.inheritance;

public class Exam_ParentChild {
	
	public static void main(String [] args) {
		Child child =  new Child();
		Parent parent = new Parent();
//		parent.
//		System.out.println("�θ�� �� : "+child.getMoney());
//		child.
		child.printInfo();
		child.printMessage();
		child.pizzaRecipe(); // child ���� print �����Ǹ� �ٲ���� �ٲ۰� ��µ� ļļļ
		System.out.println(child.toString()); // -> toString ������ ���
		System.out.println(parent.toString());
	}

}
