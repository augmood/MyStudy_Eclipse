package com.kh.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {

	// 1
	public int mainMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("★======== 회원 정보 관리 프로그램 ========★ ");
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
		System.out.println(" ★======== 회원 정보 조회 결과 ========★ ");
		for(Member memberOne : mList) {
			System.out.println("회원 아이디 : " + memberOne.getMemberId());
			System.out.println("회원 비밀번호 : " + memberOne.getMemberPwd());
			System.out.println("회원 이름: " + memberOne.getMemberName());
			System.out.println("회원 성별 : " + memberOne.getMemberGender());
			System.out.println("회원 나이  : " + memberOne.getMemberAge());
			System.out.println("회원 이메일 : " + memberOne.getMemberEmail());
			System.out.println("회원 주소 : " + memberOne.getMemberAddress());
			System.out.println("회원 취미 : " + memberOne.getMemberHobby());
			System.out.println("등록 날짜 : " + memberOne.getEnrollDate());
			System.out.println(" ★===============================★ ");
		}
		
	}
	
	// 2
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요 : ");
		return sc.next();
	}
	
	public void showOneById(Member memberOne) {
		System.out.println(" ★======== 회원 정보 조회 결과 ========★ ");
		System.out.println("회원 아이디 : " + memberOne.getMemberId());
		System.out.println("회원 비밀번호 : " + memberOne.getMemberPwd());
		System.out.println("회원 이름: " + memberOne.getMemberName());
		System.out.println("회원 성별 : " + memberOne.getMemberGender());
		System.out.println("회원 나이  : " + memberOne.getMemberAge());
		System.out.println("회원 이메일 : " + memberOne.getMemberEmail());
		System.out.println("회원 주소 : " + memberOne.getMemberAddress());
		System.out.println("회원 취미 : " + memberOne.getMemberHobby());
		System.out.println("등록 날짜 : " + memberOne.getEnrollDate());
		System.out.println(" ★===============================★ ");
	}

	// 3
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		return sc.next();
	}
	
	public void showMembersByName(List<Member> members) {
		System.out.println(" ★======== 회원 정보 조회 결과 ========★ ");
		for(int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).toString());
		}
	}

	// 4
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ★======== 회원 가입 정보 입력 ========★ ");
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
				memberAddress, memberHobby); // 생성자 한번에 쓰기 
		return member;
	}
	
	// 5
	public Member modifyMember(String searchId) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ★======== 변경 할 정보 입력 ========★  ");
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

	// 처리 결과 
	public void displayError(String message) {
		System.out.println("서비스 요청 처리 결과 : "+message);
		
	}

	public void displaySuccess(String message) {
		System.out.println("서비스 요청 처리 성공 : "+message);
		
	}


	


}
