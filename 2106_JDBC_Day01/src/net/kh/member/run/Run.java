package net.kh.member.run;

import net.kh.member.controller.MemberController;
import net.kh.member.model.vo.Member;
import net.kh.member.view.MemberView;

public class Run {
	public static void main(String [] args) {
		MemberView view = new MemberView();
		MemberController mCtrl = new MemberController(); 
		done : 
		while(true) {
			int choice = view.mainMenu();
			String memberId = ""; // 계속 반복 사용하기 때문에 위에 선언 해줌
			Member member = null; // 계속 반복 사용하기 때문에 위에 선언 해줌
			switch(choice) {
			case 0 : // 프로그램 종료
				break done;
			case 1 : // 전체조회
				mCtrl.printAll();
				break;
			case 2 : // 회원 아이디로 조회
				memberId = view.inputMemberId();
				mCtrl.printOneById(memberId);
				break;
			case 3 : // 회원 이름으로 조회
				String memberName = view.inputMemberName();
				mCtrl.printOneByName(memberName);
				break;
			case 4 : // 회원 가입
				member = view.inputMember(); // 입력 받은 값을
				mCtrl.registerMember(member); // ctrl로 넘겨줌
				break;
			case 5 : // 회원 정보 변경
				//1. 회원 아이디 존재 확인
				memberId = view.inputMemberId();
				member = mCtrl.getOneById(memberId);
				if(member != null) {
					//2. 있다면 정보입력
					member = view.modifyMember();
					mCtrl.modifyMember(member, memberId);
				}else {
					view.displayError("회원 정보 수정 실패");
				}
				break;
			case 6 : // 회원 탈퇴
				memberId = view.inputMemberId();
				mCtrl.removeMember(memberId);
				break;
			default : System.out.println("번호를 잘못 선택하셨습니다.");
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
