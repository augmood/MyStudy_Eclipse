package com.kh.array.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		/*
		 * 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		 * 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		 */
		
		int [] arr1 = new int[100]; // 길이가 100인 배열을 선언
		for (int i = 0; i < 100; i++) { 
			arr1[i] = i+1; // 값을 넣었음
			System.out.print(arr1[i]+ " "); // 출력했음
		}
	}
	public void exercise2() { // 글자를 출력하려면 숫자로 받아야 하는데 어케하지
		/*
		 * 길이가 5인 String 배열을 선언하고 "딸기", "복숭아", "키위", "사과", "바나나"로
		 * 초기화 한 후, for문을 활용해서 바나나를 출력해보세요! 
		 */
		
		String [] arr2 = {"딸기", "복숭아", "키위", "사과", "바나나"}; // 배열 받음
		for(int j = 0; j < 5; j++) {
			if (arr2[j].equals ("딸기")) { 
				// 숫자 = 글자 -> 입력값 출력 / 문자열 == 로 쓰지 말것
				// String 에서 == 은 주소 값 비교, equals는 value를 비교 (안전)
				System.out.print(arr2[j]);			            
			}
			String kiwi = "키위";
			String badkiwi = new String("키위");
			System.out.println("badkiwi : " + badkiwi); // 키위 나옴
			System.out.println("주소값 비교 : " + (kiwi == badkiwi));
			System.out.println("문자열 비교 : " + kiwi.equals(badkiwi));
		}
	}
	
	public void exercise3() { // 입력 받은 것을 저장하기....
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 제일 큰 수를 출력하는 프로그램을 작성하시오
		 */
		Scanner sc = new Scanner(System.in);
		int [] arr3 = new int[5]; 
		int max = 0;
		System.out.print("양의 정수 5개를 입력하세요 : ");

		for(int k = 0; k < 5; k++) {
			arr3[k] = sc.nextInt();
			//가장 큰 수 판별
			if (arr3[k] > max) { //이 부분에서 헤맸다네
				max= arr3[k];
				}
			}
		//가장 큰 수 출력
		System.out.println("가장 큰 수는"+max+"입니다");
	}
	
	
	public void exercise4() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		int [] arr4 = new int[5];
		int sum = 0;
		System.out.print("양수 5개를 입력하세요: ");
		
		for(int l = 0; l <arr4.length; l++) {
			arr4[l] = sc.nextInt();
			// 수들의 평균을 구하기
			sum += arr4[l];
		}
		System.out.print("평균 : "+(double)sum/5);

	}
	
	public void exercise5() {
		/* 
		 * 사용자에게 주민번호를 입력 받은 수
		 * 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 * 210618-1124600 -> 210618-1******
		 * 890831-2123456 -> 890831-2******
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 : ");
		String str = sc.next();
		// 문자 배열에 저장, 저장할 때 문자열을 잘라서 문자로 저장
		str.charAt(0);
		// 입력 받은 문자열의 길이만큼 문자배열을 저장.
		char [] origin = new char[str.length()];
		for (int m = 0; m < origin.length; m++) {
			// m이 0부터 13까지 문자열을 하나씩 떼고 문자 배열에 저장
			origin[m] = str.charAt(m); 
		}
		//똑같은 크기의 공간을 만들어주고 for문으로 복사를 한다.
		char [] copy = new char[str.length()];
		for(int m = 0; m < copy.length; m++) {
			if ( m <= 7 ) { // 890831-2 까지만 기존 숫자로 뽑겠다.
				copy[m] = origin[m]; 
			}else {
				copy[m] = '*'; 
			}
			System.out.print(copy[m]);
		}
		// 주민등록번호가 저장된 문자열을 복사하되
		// 성별 자리 이후부터는 *로 처리하여 저장

		
	}
	
	public void exercise6() {
		/*
		 * 다섯개의 수를 입력 받은 후에
		 * 삽입정렬을 이용하여 오름차순으로 정렬한 후 출력하시오
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하세요 : "); 
		int [] arr5 = new int[5];
		
		// 입력받은 값을 배열에 저장 -> 이 부분 구현을 맨날 못함
		for (int n = 0; n < arr5.length; n++) { 
			arr5[n] = sc.nextInt();
		}
		// 오름차순 삽입 정렬하는 중
		for (int n = 1; n < arr5.length; n++) { 
			for(int o = n; o > 0; o--) {
				if(arr5[o-1] > arr5[o]) {
				int temp = arr5[o-1];
				arr5[o-1] = arr5[o];
				arr5[o] = temp;
				}
			}
		
	}
		// 출력
		for (int n = 0; n < arr5.length; n++) {
			System.out.print(arr5[n]+" ");
		}
	}
}
