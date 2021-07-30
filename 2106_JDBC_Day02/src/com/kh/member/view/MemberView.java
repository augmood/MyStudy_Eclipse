package com.kh.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	
	public MemberView() {}
	
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 회원 정보 관리 프로그램 ========");
		System.out.println("1. 회원 정보 전체 조회");
		System.out.println("2. 회원 정보 아이디로 조회");
		System.out.println("3. 회원 정보 이름으로 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void showAllList(List<Member> mList) {
		System.out.println("======== 회원 정보 전체 조회 ========");
		for(Member mOne : mList) {
			System.out.println(mOne.toString());
		}
		
	}

	public void showOneById(Member memberOne) {
		System.out.println("======== 회원 아이디로 검색 결과 ========");
		System.out.println(memberOne.toString());
		
	}

	public void showMembersByName(List<Member> mList) {
		System.out.println("======== 회원 이름으로 검색 결과 ========");
		for(int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).toString());
		}
		
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소: ");
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member(memberId, memberPwd, memberName, 
								memberGender , memberAge, memberEmail, memberPhone,
								memberAddress, memberHobby, null);
		return member;
	}
	

	public void displayError(String message) {
		System.out.println("서비스 요청 처리 실패 : "+message);
		
	}

	public void displaySuccess(String message) {
		System.out.println("서비스 요청 처리 성공 : " +message);
		
	}

	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String inputId = sc.next();
		return inputId;
	}

	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String inputName = sc.next();
		return inputName;
	}

	
	public Member modifyMember(String searchId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======수정할 회원 정보를 입력하세요=======");
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소: ");
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member(memberPwd, memberEmail, memberPhone, memberAddress, memberHobby);
		member.setMemberId(searchId);
		return member;
	}




}
