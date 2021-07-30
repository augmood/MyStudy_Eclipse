package com.kh.member.controller;

import java.util.List;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class MemberController {
	
	public void printAllMember() {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		List<Member> mList = mDao.printMemberList(); 
		if(!mList.isEmpty()) {
			mView.showAllList(mList);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
	}

	public void printOneById(String memberId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		Member memberOne = mDao.printOneById(memberId);
		if(memberOne != null) {
			mView.showOneById(memberOne);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		
	}

	public void printOneByName(String memberName) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		List<Member> mList = mDao.printMembersByName(memberName);
		if(!mList.isEmpty()) {
			mView.showMembersByName(mList);
		}else {
			mView.displayError("회원 이름으로 조회 실패");
		}
		
	}

	public void registerMember(Member member) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = mDao.insertMember(member);
		if(result > 0) {
			mView.displaySuccess("회원 등록 성공");
		} else {
			mView.displayError("회원 등록 실패");
		}
	}


	public void removeMember(String deleteId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = mDao.deleteMember(deleteId);
		if(result > 0) {
			mView.displaySuccess("회원 탈퇴 성공");
		} else {
			mView.displayError("회원 탈퇴 실패");
		}
		
	}
	

	public void modifyMember(String searchId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		int result = 0;
		// 1. 아이디 존재 여부 확인
		// - 아이디가 있으면 입력을 받고
		// - 아이디가 없으면 조회 실패 메시지 출력
		Member searchOne = mDao.printOneById(searchId);
		// 기존 getOneById를 만들어 주던 것과 다름
		if(searchOne != null) {
			Member member = mView.modifyMember(searchId);
			result = mDao.updateMember(member);
			if(result > 0) {
				mView.displaySuccess("회원정보 수정 성공");
		}else {
			mView.displayError("회원 수정 실패");
		}
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		

	}

}
