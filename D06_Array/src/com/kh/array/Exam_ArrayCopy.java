package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String [] args) {
		// 배열을 복사해봐요
		// 두개의 변수가 하나의 배열을 가리키고 있음
		
		int [] arr1 = new int[4];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i+1;
		}
		int [] arr2 = arr1;
		arr2[0] = 5; 
		// arr2에 복사가 되었기 때문에 arr2를 수정하면 arr1은 수정되지 않는다고 생각함.
		// but 얕은 복사라서 그런거 없음 그냥 바뀜 
		System.out.println("변해도 되는 : "+arr2[0]+" 변하면 안되는 : "+arr1[0]);	
		
		// 깊은 복사를 해보겠어용
		int [] arr3 = {1,2,3,4};
		int [] arr4 = new int[4]; // 공간 자체를 다르게 할당
		for (int j = 0; j < arr3.length; j++) {
			arr4[j] = arr3[j]; // 값을 그대로 복사
		}
		arr3[0] = 5; 
		// 3의 값은 안바뀜 그러나 4의 값은 주소를 복사한게 아니라 공간을 따로 만든것 그래서 바뀜
		System.out.println("변해도 되는 : "+arr4[0]+" 변하면 안되는 : "+arr3[0]);	
		
	}
}
