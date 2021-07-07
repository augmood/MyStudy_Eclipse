package com.kh.listcollection;

public class Run {
	public static void main(String [] args) {

//		IntList list = new IntList();
//		list.add(6);
//		list.add(18);
//		int size = list.size();
//		System.out.printf("size : %d \n" ,size);
//		list.clear();
//		
//		size = list.size();
//		System.out.printf("size : %d \n" ,size);
//		
//		list.add(21);
//		int num = list.get(0);
//		System.out.printf("num : %d" ,num);
//		ListController listController = new ListController();
//		listController.listExercise1();
				
		
//		ObjectList objList = new ObjectList();
//		objList.add(6);
//		objList.add(new Student());
//		objList.add("collection");
//		
//		int num = (Integer)objList.get(0);
//		System.out.printf("num : %d \n", num);
//		Student student = (Student)objList.get(1);
//		System.out.println("Student : "+ student);
//		String str = (String)objList.get(2);
//		System.out.println("Str : "+ str);
//		System.out.println();
//		
//		int size = objList.size();
//		System.out.printf("size : %d \n", size);
//		
//		objList.clear();
//		size = objList.size();
//		System.out.printf("size : %d \n", size);
//		
//		objList.add(21);
//		num = (Integer)objList.get(0);
//		System.out.printf("num : %d \n", num);
		
		
		RList<Integer> objList = new RList<Integer>();
		objList.add(6);
		objList.add(18);
		
		int num = objList.get(0);
		System.out.printf("num : %d \n", num);
		
		int size = objList.size();
		System.out.printf("size : %d \n", size);
		
		objList.clear();
		size = objList.size();
		System.out.printf("size : %d \n", size);
		
		objList.add(21);
		num = objList.get(0);
		System.out.printf("num : %d \n", num);
		
		
	}

}
