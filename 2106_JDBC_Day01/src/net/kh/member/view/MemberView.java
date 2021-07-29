package net.kh.member.view;

import java.util.List;
import java.util.Scanner;

import net.kh.member.model.vo.Member;

public class MemberView {
		
		public int mainMenu() {
			Scanner sc = new Scanner(System.in);
			System.out.println("=======회원 관리 프로그램=======");
			System.out.println("1. 회원정보 전체조회");
			System.out.println("2. 회원 아이디로 조회");
			System.out.println("3. 회원 이름으로 조회");
			System.out.println("4. 회원가입");
			System.out.println("5. 회원 정보 변경");
			System.out.println("6. 회원 탈퇴");
			System.out.println("0. 프로그램 종료");
			System.out.print("번호 선택 : ");
			int input = sc.nextInt();
			return input;
			
			/*
			 * ===== 회원관리 프로그램 =====
			 * 1. 회원정보 전체조회
			 * 2. 회원 아이디로 조회
			 * 3. 회원 이름으로 조회
			 * 4. 회원가입
			 * 5. 회원 정보 변경
			 * 6. 회원 탈퇴
			 * 0. 프로그램 종료
			 * 번호선택 : 
			 * 
			 */
			
		}

		
		// 프로그램 실행 성공 여부 출력  
		public void displaySuccess(String message) {
			System.out.println("서비스 요청 결과 : "+ message);
		}
		
		public void displayError(String message) {
			System.out.println("서비스 요청 처리 실패 : "+ message);
		}
		
		// 1
		public void showAll(List<Member> memberList) { // 여러 멤버가 들어있기 때문에 List 사용
			System.out.println("=======전체 회원 정보 조회=======");
			
			for (int i = 0; i <memberList.size(); i++) { 
//				System.out.println(memberList.get(i).toString());
				System.out.println("회원 아이디 : "+ memberList.get(i).getMemberId());
				System.out.println("회원 비밀번호 : "+ memberList.get(i).getMemberPwd());
				System.out.println("회원 이름 : "+ memberList.get(i).getMemberName());
				System.out.println("회원 성별 : "+ memberList.get(i).getMemberGender());
				System.out.println("회원 나이 : "+ memberList.get(i).getMemberAge());
				System.out.println("회원 이메일 : "+ memberList.get(i).getMemberEmail());
				System.out.println("회원 주소 : "+ memberList.get(i).getMemberAddress());
				System.out.println("회원 취미 : "+ memberList.get(i).getMemberHobby());
				System.out.println("회원  가입날짜 : "+ memberList.get(i).getEnrollDate());
			}
			
		}
		// 2
		public String inputMemberId() {
			Scanner sc = new Scanner(System.in);
			System.out.print("조회 할 회원의 아이디 입력");
			String inputId = sc.next();
			return inputId;
		}
	
		
		public void showOne(Member memberOne) {
			System.out.println("=======전체 회원 정보 조회=======");
//			System.out.println(memberOne.toString());
			System.out.println("회원 아이디 : "+ memberOne.getMemberId());
			System.out.println("회원 비밀번호 : "+ memberOne.getMemberPwd());
			System.out.println("회원 이름 : "+ memberOne.getMemberName());
			System.out.println("회원 성별 : "+ memberOne.getMemberGender());
			System.out.println("회원 나이 : "+ memberOne.getMemberAge());
			System.out.println("회원 이메일 : "+ memberOne.getMemberEmail());
			System.out.println("회원 주소 : "+ memberOne.getMemberAddress());
			System.out.println("회원 취미 : "+ memberOne.getMemberHobby());
			System.out.println("회원  가입날짜 : "+ memberOne.getEnrollDate());
		}
		
		// 3
		public String inputMemberName() {
			Scanner sc = new Scanner(System.in);
			System.out.print("조회 할 회원의 이름 입력 : ");
			String inputName = sc.next();
			return inputName;
		}
		
		
		public void printOneByName(List<Member> memberList) {
			System.out.println("=======전체 회원 정보 조회=======");
			for(Member member : memberList) { // forEach, index 신경 안쓰고 list값 for문으로 돌림
				System.out.println(memberList.toString());
				System.out.println("회원 아이디 : "+ member.getMemberId());
				System.out.println("회원 비밀번호 : "+ member.getMemberPwd());
				System.out.println("회원 이름 : "+ member.getMemberName());
				System.out.println("회원 성별 : "+ member.getMemberGender());
				System.out.println("회원 나이 : "+ member.getMemberAge());
				System.out.println("회원 이메일 : "+ member.getMemberEmail());
				System.out.println("회원 주소 : "+ member.getMemberAddress());
				System.out.println("회원 취미 : "+ member.getMemberHobby());
				System.out.println("회원  가입날짜 : "+ member.getEnrollDate());
			}
		}
		
		// 4
		public Member inputMember() {
			Scanner sc = new Scanner(System.in);
			Member member = new Member();
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
			
			member.setMemberId(memberId);
			member.setMemberPwd(memberPwd);
			member.setMemberName(memberName);
			member.setMemberAge(memberAge);
			member.setMemberGender(memberGender);
			member.setMemberEmail(memberEmail);
			member.setMemberPhone(memberPhone);
			member.setMemberAddress(memberAddress);
			member.setMemberHobby(memberHobby);
			return member;
			
			/*
			 * 아이디
			 * 비밀번호
			 * 이름
			 * 나이
			 * 성별
			 * 이메일
			 * 전화번호
			 * 주소
			 * 취미
			 */
			
		}
		
		// 5
		public Member modifyMember() {
			Scanner sc = new Scanner(System.in);
			Member member = new Member();
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
			
			member.setMemberPwd(memberPwd);
			member.setMemberEmail(memberEmail);
			member.setMemberPhone(memberPhone);
			member.setMemberAddress(memberAddress);
			member.setMemberHobby(memberHobby);
			return member;
		}

		
	
}
