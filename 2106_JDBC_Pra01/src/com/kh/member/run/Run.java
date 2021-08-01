package com.kh.member.run;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView mView = new MemberView();
		MemberController mCtrl = new MemberController();
		
		EXIT :
		while (true) {
			int choice = mView.mainMenu(); // -> view
			switch(choice) {
			case 0  : // 종료
				break EXIT;
			case 1 : // 선수 전체 조회
				mCtrl.printAllmember(); // -> ctrl -> DAO -> view
				break;
			case 2 : // 선수 종목으로 조회
				String memberJm = mView.inputMemberJm(); // -> view
				mCtrl.printOneByJm(memberJm); // -> ctrl -> DAO 
				break;
			case 3 : // 선수 이름으로 조회
				String memberName = mView.inputMemberName();
				mCtrl.printOneByName(memberName);
				break;
			case 4 : // 선수 입력
				Member member = mView.inputMember();
				mCtrl.registerMember(member);
				break;
			case 5 : // 선수 정보 수정
				String searchJm = mView.inputMemberJm();
				mCtrl.modifyMember(searchJm);
				break;
			case 6 : // 정보 삭제
				String deleteJm = mView.inputMemberJm();
				mCtrl.removeMember(deleteJm);
				break;
			default :
				System.out.println("다시 입력하세요");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
