package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		//이제 입력을 받아 프로그램 작성 (import)
		Scanner sc = new Scanner(System.in); //스캐너는 이렇게 써야한다.
		
		System.out.println("int 값을 입력해주세요.");
		int input1 = sc.nextInt(); //정수 입력값 받기 -> 값을 받으면 이제 그게 되는것
		System.out.println("입력한 값은 : "+input1);
		
		System.out.println("두번째 int 값을 입력해주세요.");
		int input2 = sc.nextInt();
		System.out.println("입력한 값은 : "+input2);
		
		int result = input1 + input2;
		System.out.println("두 값의 합은 : "+result);
		// sc.close(); <- 8번째 줄의 sc가 잘 닫히지 않았다는 경고가 뜰때 닫아주는 용도, 근데 안써도 됨
			
	}

}
