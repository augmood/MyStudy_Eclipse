package com.kh.member.controller;

import java.util.List;

import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;
import comkh.member.model.service.MemberService;

public class MemberController {
	
	public MemberController() {}

	// 1
	public void printAllMember() {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		List<Member> mList = mService.printAll();
		
		if(!mList.isEmpty()) {
			mView.showAllList(mList);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
	}
	
	// 2
	public void printOneById(String memberId) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		Member memberOne = mService.printOneById(memberId);
		if(memberOne != null) {
			mView.showOneById(memberOne);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		
	}

	// 3
	public void printMembersByName(String memberName) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		List<Member> members = mService.printMembersByName(memberName);
		if(!members.isEmpty()) {
			mView.showMembersByName(members);
		}else {
			mView.displayError("회원 이름으로 조회 실패");
		}
	}
	
	// 4
	public void registerMember(Member member) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = mService.registerMember(member);
		if(result > 0) {
			mView.displaySuccess("회원 가입 성공");
		}else {
			mView.displayError("회원 가입 실패");
		}
	}


	// 5
	public void modifyMember(String searchId) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = 0;
		Member searchOne = mService.printOneById(searchId);
		if(searchOne != null) {
			result = mService.modifyMember(mView.modifyMember(searchId));
			if(result > 0) {
				mView.displaySuccess("회원정보 수정 성공");
			} else {
				mView.displayError("회원정보 수정 실패");
			}
		}else {
			mView.displayError("회원정보 조회 실패");
		}
		
	}

	// 6
	public void removeMember(String deleteId) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = 0;
		result = mService.removeMember(deleteId);
		if(result > 0) { 
			mView.displaySuccess("회원 탈퇴 성공");
		} else {
			mView.displayError("회원 탈퇴 실패");
		}
		

		
	}

}
