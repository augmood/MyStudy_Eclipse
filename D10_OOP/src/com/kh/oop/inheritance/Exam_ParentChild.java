package com.kh.oop.inheritance;

public class Exam_ParentChild {
	
	public static void main(String [] args) {
		Child child =  new Child();
		Parent parent = new Parent();
//		parent.
//		System.out.println("ºÎ¸ğ´Ô µ· : "+child.getMoney());
//		child.
		child.printInfo();
		child.printMessage();
		child.pizzaRecipe(); // child ¿¡¼­ print ·¹½ÃÇÇ¸¦ ¹Ù²å´õ´Ï ¹Ù²Û°Ô Ãâ·ÂµÊ Ä¼Ä¼Ä¼
		System.out.println(child.toString()); // -> toString °íÀ¯°ª Ãâ·Â
		System.out.println(parent.toString());
	}

}
