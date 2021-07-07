package com.kh.array;

public class Exam_Array {
	public static void main(String [] args) {
		// 배열 첫번째 사용법 
		int [] arrs = new int[5]; // arrs : [ㅁㅁㅁㅁㅁ]
		arrs[0] = 1; // 0부터 시작하세용 기본은 무조건 0임
		arrs[1] = 2;
		arrs[2] = 3;
		arrs[3] = 4;
		arrs[4] = 5;
		System.out.printf("%d %d %d %d %d \n", arrs[0], arrs[1], arrs[2], arrs[3],arrs[4]);
		System.out.printf("배열의 크기 : %d", arrs.length);
		System.out.println();
		
		//배열 두번째 사용방법 -> 선언과 동시에 초기화
		int [] nums = {1,2,3,4,5};
		System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
		
		//배열 세번째 사용방법 ---> 은근 헷갈린다 for문을 잘 파악하지 못했기 때문인듯 
		//순차적인 접근?, 0 -> 1 -> 2 -> 3 -> 4 
		int [] inputs = new int[5];
		for (int i = 0; i < 5; i++) {
			//배열선언은 밖에서 해주세요, 여기에 만들면 새롭게 매번 생성됨
			inputs[i] = i+3; 
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(inputs[i] + " ");
		}
		System.out.println();
	}
}
