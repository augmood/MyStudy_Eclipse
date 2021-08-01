package com.kh.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	
	public MemberView() {}

	// 메뉴 고르기 화면 출력 후 받은 숫자를 run의 choice 넣어주고 while문 돌려서 맞는 ctrl문 찾아가기 
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 주장 선수 관리 프로그램 ========");
		System.out.println("1. 선수 정보 전체 조회");
		System.out.println("2. 선수 정보 종목으로 조회");
		System.out.println("3. 선수 정보 이름으로 조회");
		System.out.println("4. 선수 추가");
		System.out.println("5. 선수 정보 수정");
		System.out.println("6. 정보 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void showAllList(List<Member> mList) {
		System.out.println("======== 주장 선수 전체 조회 ========");
		for (Member mOne : mList) {
			System.out.println(mOne.toString());
		}
		
	}

	public void displayError(String message) {
		System.out.println("서비스 요청 처리 실패 : "+message);
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 처리 성공 : "+message);
		
	}
	
	// 2
	public String inputMemberJm() {
		Scanner sc = new Scanner(System.in);
		System.out.print("종목을 입력하세요 : ");
		String inputJm = sc.next();
		return inputJm;
	}

	public void showOneByJm(Member memberOne) {
		System.out.println("======== 종목으로 조회 결과 ========");
		System.out.println(memberOne.toString());
		}

	// 3
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String inputName = sc.next();
		return inputName;
	}

	public void showMembersByName(List<Member> mList) {
		System.out.println("======== 이름으로 조회 결과 ========");
		for(Member mOne : mList){
			System.out.println(mOne.toString());
		}
	}

	// 4
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("종목을 입력하세요 : ");
		String memberJm = sc.next();
		System.out.print("선수 코드를 입력하세요 : ");
		int memberCode = sc.nextInt();
		System.out.print("이름을 입력하세요 : ");
		String memberName = sc.next();
		System.out.print("성별을 입력하세요 : ");
		String memberGender = sc.next();
		System.out.print("나이를 입력하세요 : ");
		int memberAge = sc.nextInt();
		Member member = new Member(memberJm, memberCode, memberName, memberGender, memberAge, null );
		return member;
	}

	// 5
	public Member modifyMember(String searchJm) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println("======== 수정 할 내용을 입력하세요 ========");
		System.out.print("선수 이름을 입력하세요 : ");
		String memberName = sc.next();
		member.setMemberName(memberName);
		member.setMemberJm(searchJm);
		return member;

	}

		
	}
