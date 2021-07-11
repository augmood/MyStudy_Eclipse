package com.je.operatorpractice;

import java.util.Scanner;

public class Operator_Practice {
	
	public void practice1() {
		/*
		 * 키보드로 입력받은 하나의 정수가 양수이면
		 * 양수가 아니면 양수가 아니다를 출력하세요.
		 * 실습 문제 1-2, 합쳐서 해결
		 */
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		} else if(num == 0 ) {
			System.out.println("0이다.");
		} else {
			System.out.println("양수가 아니다.");
		}
		
	}
	
	public void practice2() {
		/*
		 * 키보드로 입력받은 하나의 정수가 짝수이면 짝수다
		 * 아니면 홀수다를 입력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		int num2;
		
		System.out.print("정수  : ");
		num2 = sc.nextInt();
		
		if (num2 % 2 == 0 ) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
	
	public void practice3() {
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		 * 인원수와 사탕개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕개수와
		 * 나눠주고 남은 사탕의 개수를 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int candy;
		int people;
		int num3;
		int num4;
		
		System.out.print("인원 수 : ");
		people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		candy = sc.nextInt(); 
		
		num3 = candy / people;
		num4 = candy - (num3*people);
		
		System.out.print("1인당 사탕 개수: "+num3 +"\t");
		System.out.print("남는 사탕 개수 : "+num4);
		
	}
	
	public void practice4() {
		/*
		 * 키보드로 입력받은 값들을 변수에 기록하고
		 * 저장된 변수 값을 화면에 출력하여 확인하세요
		 * 이때 성별이 M이면 남학생, M이 아니면 여학생으로 출력 처리하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		int grade;
		int ban;
		int schoolNumber;
		char gender;
		double point;
		
		System.out.print("이름 : ");
		name = sc.next();
		sc.nextLine();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("반 : ");
		ban = sc.nextInt();
		System.out.print("번호 : ");
		schoolNumber = sc.nextInt();
		System.out.print("성별 (M/F): ");
		gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		point = sc.nextDouble();
		
		if (gender == 'M') {
			System.out.printf("%d학년  %d반 %d번  %s 남학생의 성적은 %.2f 입니다 \n"
					, grade, ban, schoolNumber, name, point);
		} else if (gender == 'F') {
			System.out.printf("%d학년  %d반 %d번  %s 여학생의 성적은 %.2f 입니다 \n"
					, grade, ban, schoolNumber, name, point);

		}
			
	}
	
	public void practice5() {
		/*
		 * 국어, 영어, 수학에 대한 점수를 입력받고
		 * 세 과목에 대한 합계와 평균을 구하세요.
		 * 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		 * 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때
		 * 합격, 아니라면 불합격을 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum / 3;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);


		
		if ((kor >= 40) && (eng >= 40) && (math >= 40) && sum >=60 ) {
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}
		
	}
	
	public void practice6 () {
		/*
		 * 주민번호를 이용하여 
		 * 남자인지 여자인지 구분하여 출력하세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		// 이 부분이 헷갈렸음 문자랑 숫자가 같이 있으니까 어떻게 받아서 검토해야하는지
		// 일단 문자열로 주민번호를 받아주고
		String reNum = sc.nextLine();
	
		// 문자로 8번째 문자인 성별 파트를 출력시켜준다. (7 = 0부터 시작하니까)
		char gen = reNum.charAt(7);
		
		// 식은 다 맞았었는데 '1' 로 썼어야함 내가 출력하는건 문자니까 근데 계속 그냥 1을 출력하려고 했음.
		if (gen == '1' || gen == '3') {
			System.out.println("남자");
		} else if (gen == '2' || gen == '4') {
			System.out.println("여자");
		}
	}
	
	public void practice7() {
		/* 
		 * 키보드로 정수 두개를 입력받아 각각 변수에 저장하세요
		 * 그리고 또 다른 정수를 입력받아 그 수가 첫번째 수 이하거나 두번째 수 초과면 T
		 * 아니면 f를 출력하세요 단 1 < 2
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int num5 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num6 = sc.nextInt();
		System.out.print("입력 3 : ");
		int num7 = sc.nextInt();
		
		boolean isTrue = (num5 < num6 ) && (num7 > num6) || (num7 < num5);
		System.out.print(isTrue);
	}
	
	public void practice8() {
		/* 
		 * 세개의 수를 입력받아 수가 모두 같으면 T, 아니면 F
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 1 : ");
		int num8 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num9 = sc.nextInt();
		System.out.print("입력 3 : ");
		int num10 = sc.nextInt();
		
		boolean isTrue2 = (num8 == num9) && (num8 == num10) && (num9 == num10);
		System.out.print(isTrue2);
	}
	
	public void practice9() {
		/*
		 * 세 사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고
		 * 인센티브 포함 급여가 3000만원 이상이면 3000 이상 아니면 3000 미만을 출력하세요
		 * A = 0.4 / B = 없음 / C = 0.15
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		
		double AAi = A+(A*0.4);
		double BAi = B+(B*0.0);
		double CAi = C+(C*0.15);
		
		System.out.println("A사원의 연봉  / 연봉+a : "+A+"/"+AAi);
		if (AAi > 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("A사원의 연봉  / 연봉+a : "+B+"/"+BAi);
		if (B > 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원의 연봉  / 연봉+a :  "+C+"/"+CAi);
		if (CAi > 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
	}


}
