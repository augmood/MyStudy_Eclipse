package com.kh.member.run;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView view = new MemberView();
		MemberController memCtrl = new MemberController();
		
		EXIT:
		while(true) { 
			int choice = view.mainMenu(); 
			switch(choice) {
			case 0 : // 프로그램 종료
				break EXIT;
			case 1 : // 회원 정보 전체 조회
				memCtrl.printAllMember(); 
				break;
			case 2 : // 회원 정보 아이디로 조회
				String memberId = view.inputMemberId(); 
				memCtrl.printOneById(memberId);
				break;
			case 3 : // 회원 정보 이름으로 조회
				String memberName = view.inputMemberName();
				memCtrl.printMembersByName(memberName);
				break;
			case 4 : // 회원 가입
				Member member = view.inputMember(); 
				memCtrl.registerMember(member); 
				break;
			case 5 : // 회원 정보 수정
				String searchId = view.inputMemberId();
				memCtrl.modifyMember(searchId);
				break;
			case 6 : // 회원 탈퇴
				String deleteId = view.inputMemberId();
				memCtrl.removeMember(deleteId);
				break;
			default :
				System.out.println("다시 입력하세요");
				
			}
		}
		System.out.println("프로그램이 좋료 되었습니다.");
	}

}
