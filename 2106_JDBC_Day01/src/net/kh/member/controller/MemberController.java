package net.kh.member.controller;

import java.util.List;

import net.kh.member.model.dao.MemberDAO;
import net.kh.member.model.vo.Member;
import net.kh.member.view.MemberView;

public class MemberController {


	
	// 1
	public void printAll() {
		MemberDAO memberDao  = new MemberDAO();
		MemberView view = new MemberView();
		List<Member> memberList = memberDao.printAll(); // 전부 가져온다
		if(!memberList.isEmpty()) {
			view.showAll(memberList);
		} else { 
			view.displayError("회원 정보 조회 실패");
			
		}
		
	}
	// 2
	public void printOneById(String memberId) {
		MemberDAO memberDao  = new MemberDAO();
		MemberView view = new MemberView();
		Member memberOne = memberDao.printOneById(memberId);
		if(memberOne != null) {
			view.showOne(memberOne);
		} else {
			view.displayError("회원 정보 아이디로 조회 실패 ");
		}
	}
	


	// 3 
	public void printOneByName(String memberName) {
		MemberDAO memberDao  = new MemberDAO();
		MemberView view = new MemberView();
		
		// 동명이인이 생길수도 있음  
		//Member memberOne = memberDao.printOnebyName(memberName);
		// 동명이인 오류방지
		List<Member> memberList = memberDao.printOneByName(memberName);
		if(!memberList.isEmpty()) {
			view.printOneByName(memberList);
		}else {
			view.displayError("회원 정보 이름으로 조회 실패");
		}
	 }
	
	// 4
	public void registerMember(Member member) {
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		
		int result = memberDao.insertMember(member);
		if(result > 0) {
			/* 성공은 result가 0보다 클때
			 *  why? jdbc에서 사용하는 메소드의 리턴 값이
			 *  성공일 때 0보다 큰 값을 리턴하기 때문에
			 */
			view.displaySuccess("가입 성공");
		}else {
			// 실패는 result가 0또는 다른 값 일때.
			 view.displayError("가입 실패");
		}
		
	}
	
	// 5
	public Member getOneById(String memberId) { // -> 현재 있는 아이디인지 받아서 보는 것
		MemberDAO memberDao  = new MemberDAO();
		Member memberOne = memberDao.printOneById(memberId);
		return memberOne;
	}
	

	public void modifyMember(Member member, String memberId) { // 있는 아이디면 수정 후 성공 여부 출력
		MemberDAO memberDao  = new MemberDAO();
		MemberView view = new MemberView();
		member.setMemberId(memberId);
		
		int result = memberDao.updateMember(member);
		if(result > 0) {
			view.displaySuccess("회원 정보 수정 성공");
		}else {
			view.displayError("회원 정보 수정 실패");
		}
		
	}
	
	// 6
	public void removeMember(String memberId) {
		MemberDAO memberDao  = new MemberDAO();
		MemberView view = new MemberView();
		int result = memberDao.deleteMember(memberId);
		if(result > 0) {
			view.displaySuccess("회원 탈퇴 성공");
		}else {
			view.displayError("회원 탈퇴 실패");
		}
		
	}

}
