package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.member.model.vo.Member;

public class MemberDAO {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:XE"; // -> 작성 오타 주의
	private final String user = "PLAYER";
	private final String password = "PLAYER";
	
	// 1 전체 조회
	public List<Member> printMemberList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> mList = null;
		
		String sql = "SELECT * FROM MEMBER";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>();
			
			while(rset.next()) {
				Member member = new Member();
				member.setMemberJm(rset.getString("MEMBER_JM"));
				member.setMemberCode(rset.getInt("MEMBER_CODE"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setEnrollDate(rset.getDate("Enroll_DATE"));
				mList.add(member);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mList;
	}

	// 2 종목으로 조회
	public Member printOneByJm(String memberJm) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_JM = ?" ; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberJm); // 이 문장을 빠트리면 조회가 안됨 
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				member = new Member();
				member.setMemberJm(rset.getString("MEMBER_JM"));
				member.setMemberCode(rset.getInt("MEMBER_CODE"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setEnrollDate(rset.getDate("Enroll_DATE"));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return member;
	}
	
	// 3 이름으로 조회
	public List<Member> printMembersByName(String memberName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> mList = null;
		
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE ? ";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+memberName+"%");
			rset = pstmt.executeQuery();
			mList = new ArrayList<Member>();
			
			while(rset.next()) {
				Member mOne = new Member();
				mOne.setMemberJm(rset.getString("MEMBER_JM"));
				mOne.setMemberCode(rset.getInt("MEMBER_CODE"));
				mOne.setMemberName(rset.getString("MEMBER_NAME"));
				mOne.setMemberGender(rset.getString("MEMBER_GENDER"));
				mOne.setMemberAge(rset.getInt("MEMBER_AGE"));
				mOne.setEnrollDate(rset.getDate("Enroll_DATE"));
				mList.add(mOne);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mList;
	}

	// 4 선수 정보 등록
	public int insertMember(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, DEFAULT)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberJm());
			pstmt.setInt(2, member.getMemberCode());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberGender());
			pstmt.setInt(5, member.getMemberAge());
			result = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	// 5 선수 정보 수정
	public int updateMember(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "UPDATE MEMBER SET MEMBER_NAME = ? WHERE MEMBER_JM = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt= conn.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberName());
			pstmt.setString(2, member.getMemberJm());
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	// 6
	public int deleteMember(String deleteJm) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		String sql = "DELETE FROM MEMBER WHERE MEMBER_JM = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteJm);
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}
