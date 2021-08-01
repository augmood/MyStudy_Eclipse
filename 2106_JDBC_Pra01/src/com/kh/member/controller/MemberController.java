package com.kh.member.controller;

import java.util.List;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class MemberController {

	// 1번 주장 선수 전체 조회
	public void printAllmember() {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		List<Member> mList = mDao.printMemberList(); // -> DAO
		if(!mList.isEmpty()) {
			mView.showAllList(mList);
		}else {
			mView.displayError("주장 선수 조회 실패");
		}
		
	}
	
	// 2번 종목으로 조회
	public void printOneByJm(String memberJm) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		Member memberOne = mDao.printOneByJm(memberJm);
		if(memberOne != null) {
			mView.showOneByJm(memberOne);
		}else {
			mView.displayError("종목으로 조회 실패");
		}
		
	}

	// 3번 이름으로 조회
	public void printOneByName(String memberName) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		List<Member> mList = mDao.printMembersByName(memberName);
		if(!mList.isEmpty()) {
			mView.showMembersByName(mList);
		} else {
			mView.displayError("이름으로 조회 실패");
		}
		
	}

	// 4번 선수 입력
	public void registerMember(Member member) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = mDao.insertMember(member);
		if(result > 0) {
			mView.displaySuccess("선수 정보가 등록 되었습니다.");
		} else {
			mView.displayError("선수 정보 등록 실패 했습니다");
		}
		
	}



	// 5번 정보 수정
	public void modifyMember(String searchJm) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = 0;
		Member searchOne = mDao.printOneByJm(searchJm);
		
		if(searchOne != null) { // 있나 없나 조회
			Member member = mView.modifyMember(searchJm);
			result = mDao.updateMember(member);
			if(result > 0) { // 수정이 됐나 안됐나 조회
				mView.displaySuccess("선수 정보 수정 성공");
			}else {
				mView.displayError("선수 정보 수정 실패");
			}
		}else {
			mView.displayError("선수 정보 조회 실패");
		}
		
	}
	
	//6 삭제
	public void removeMember(String deleteJm) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = mDao.deleteMember(deleteJm);
		if(result > 0) {
			mView.displaySuccess("선수 정보 삭제 성공");
		}else {
			mView.displayError("선수 정보 삭제 실패");
		}
		
	}

}
