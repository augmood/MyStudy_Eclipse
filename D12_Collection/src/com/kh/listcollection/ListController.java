package com.kh.listcollection;

import java.util.ArrayList;
import java.util.List;

public class ListController {
	
	public void listExercise1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(18);
		int size = list.size();
		System.out.printf("size : %d \n", size);
		
//		list.clear();
//		size = list.size();
//		System.out.printf("size : %d \n", size);
		
		list.add(21);
		for (int i = 0; i < list.size(); i++) {
		int num = list.get(i);
		System.out.printf("num : %d \n", num);
		}
		
		System.out.println("================");
		
		list.remove(0); // 재일 첫번쨰 값이 사라짐
		for (int i = 0; i < list.size(); i++) {
		int num = list.get(i);
		System.out.printf("num : %d \n", num);
		}
		
		System.out.println("================");
		
		list.add(0, 7); // 첫번째 자리에 6을 추가한다.
		for (int i = 0; i < list.size(); i++) {
		int num = list.get(i);
		System.out.printf("num : %d \n", num);
		}
		
		System.out.println("list에 데이터가 있습니까? 없으면 T / 있으면 F : "+list.isEmpty());
		list.clear();
		System.out.println("list에 데이터가 있습니까? 없으면 T / 있으면 F : "+list.isEmpty());
	}

}
