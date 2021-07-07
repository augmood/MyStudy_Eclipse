package com.kh.listcollection;

public class IntList {
	
	private int [] arrs;
	private int current; //인덱스처리
	
	public IntList() {
		// 값을 넣어 줄 준비중
		arrs = new int[1000];
		current = 0;
	}
	
	public void add(int input) {
		//값을 입력하고 저장하기
		arrs[current] = input;
		current++;
	}

	public void clear() {
		// remove : 하나만 지우기 / clear : 다 지우기
		// 배열에 어떤 값이 있을때 모두 0으로 처리해준다
//		for(int i = 0; i<current; i++) {
//			arrs[i] = 0;
//		}
		arrs = new int[3]; 
		// 0값이 되기만 하면 되니까 이것만 써도 상관은 없다.
		current = 0;   
		
	}
	
	public int size() {
		return current;
	}
	
	public int get(int index) {
		if(current <= index) {
			throw new IndexOutOfBoundsException();
		}
		return arrs[index];
	}
	
	
}

