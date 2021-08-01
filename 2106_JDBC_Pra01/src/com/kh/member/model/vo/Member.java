package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	
	private String memberJm;
	private int memberCode;
	private String memberName;
	private String memberGender;
	private int memberAge;
	private Date enrollDate;
	
	public Member() {}

	public Member(String memberJm, int memberCode, String memberName, String memberGender, int memberAge,
			Date enrollDate) {
		super();
		this.memberJm = memberJm;
		this.memberCode = memberCode;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAge = memberAge;
		this.enrollDate = enrollDate;
	}

	public String getMemberJm() {
		return memberJm;
	}

	public void setMemberJm(String memberJm) {
		this.memberJm = memberJm;
	}

	public int getMemberCode() {
		return memberCode;
	}

	public void setMemberCode(int memberCode) {
		this.memberCode = memberCode;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "주장 선수 [선수 종목  = " + memberJm + 
				", 선수 코드 = " + memberCode + 
				", 선수 이름 = " + memberName
				+ ", 선수 성별 = " + memberGender + 
				", 선수 나이 = " + memberAge + 
				", 입력 날짜 = " + enrollDate + "]";
	}
	
	

	
	
	


}
