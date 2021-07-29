package net.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.kh.member.model.vo.Member;

public class MemberDAO {
	
		private final String url = "jdbc:oracle:thin:@localhost:1521:XE"; // -> 작성 오타 주의
		private final String user = "STUDENT";
		private final String password = "STUDENT";

		
		// 1
		public ArrayList<Member> printAll() { // controller 에서 클릭하면 만들어짐
			Connection conn= null;
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
					Member member = new Member(); // 값을 하나하나 저장 (작은상자)
					member.setMemberId(rset.getString("MEMBER_ID"));
					member.setMemberPwd(rset.getString("MEMBER_PWD"));
					member.setMemberName(rset.getString("MEMBER_NAME"));
					member.setMemberAge(rset.getInt("MEMBER_AGE"));
					member.setMemberGender(rset.getString("MEMBER_GENDER"));
					member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
					member.setMemberPhone(rset.getString("MEMBER_PHONE"));
					member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
					member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
					member.setEnrollDate(rset.getDate("ENROLL_DATE"));
					mList.add(member); //저장한 값을 List에 담음 (큰 상자)
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
		// 2
		public Member printOneById(String memberId) {
			Connection conn= null;
			Statement stmt = null;
			ResultSet rset = null;
			Member member = null;
			String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt  = conn.createStatement();
				rset = stmt.executeQuery(sql);
				
				if(rset.next()) {
					member = new Member(); // 여기서 선언하면 없는 아이디를 검색할 경우 뒤의 내용이 실행되지 않음
					member.setMemberId(rset.getString("MEMBER_ID"));
					member.setMemberPwd(rset.getString("MEMBER_PWD"));
					member.setMemberName(rset.getString("MEMBER_NAME"));
					member.setMemberAge(rset.getInt("MEMBER_AGE"));
					member.setMemberGender(rset.getString("MEMBER_GENDER"));
					member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
					member.setMemberPhone(rset.getString("MEMBER_PHONE"));
					member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
					member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
					member.setEnrollDate(rset.getDate("ENROLL_DATE"));
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
					stmt.close();
					conn.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			return member;
		}
		
		//3 
		public List<Member> printOneByName(String memberName) {
			Connection conn= null;
			Statement stmt = null;
			ResultSet rset = null;
			ArrayList<Member> mList = null;
			String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE '%" + memberName + "%'";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt  = conn.createStatement();
				rset = stmt.executeQuery(sql);
				mList = new ArrayList<Member>();
				
				while(rset.next()) {
					Member mOne = new Member();
					mOne.setMemberId(rset.getString("MEMBER_ID"));
					mOne.setMemberPwd(rset.getString("MEMBER_PWD"));
					mOne.setMemberName(rset.getString("MEMBER_NAME"));
					mOne.setMemberAge(rset.getInt("MEMBER_AGE"));
					mOne.setMemberGender(rset.getString("MEMBER_GENDER"));
					mOne.setMemberEmail(rset.getString("MEMBER_EMAIL"));
					mOne.setMemberPhone(rset.getString("MEMBER_PHONE"));
					mOne.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
					mOne.setMemberHobby(rset.getString("MEMBER_HOBBY"));
					mOne.setEnrollDate(rset.getDate("ENROLL_DATE"));
					mList.add(mOne);
					} 
				}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				} finally {
					try {
						stmt.close();
						conn.close();
						rset.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
			return mList;
		}
		// Member를 사용하여 데이터를 가져옴
		// 4
		public int insertMember(Member member) { // view 에서 넘어옴 (return member)
			Connection conn = null;
			Statement stmt = null;
			int result = 0;

			String sql = "INSERT INTO MEMBER VALUES ( " // 컬럼 순서가 매우 중요함
					+"'"+member.getMemberId()+"',"
					+"'"+member.getMemberPwd()+"',"
					+"'"+member.getMemberName()+"',"
					+"'"+member.getMemberGender()+"',"
					+"'"+member.getMemberAge()+"',"
					+"'"+member.getMemberPhone()+"',"
					+"'"+member.getMemberEmail()+"',"
					+"'"+member.getMemberAddress()+"',"
					+"'"+member.getMemberHobby()+"',"
					+"DEFAULT)";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			return result;
		}
		
		//  5
		public Member getOneById(String memberId) {
			// TODO Auto-generated method stub
			return null;
		}
		public int updateMember(Member member) {
			Connection conn= null;
			Statement stmt = null;
			int result = 0;
			String sql = "UPDATE MEMBER SET MEMBER_PWD = '"+member.getMemberPwd()+"',"
					+ "MEMBER_EMAIL = '"+member.getMemberEmail()+"'," +
					 "MEMBER_PHONE = '"+member.getMemberPhone()+"'," +
					 "MEMBER_ADDRESS = '"+member.getMemberAddress()+"'," +
					 "MEMBER_HOBBY = '"+member.getMemberHobby()+"'"+
					 "WHERE MEMBER_ID = '"+member.getMemberId()+"'";
					
		    try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
					
			return result;
		}
		
		// 6
		public int deleteMember(String memberId) {
			Connection conn= null;
			Statement stmt = null;
			int result = 0;
			String sql = "DELETE FROM MEMBER WHERE MEMBER_ID ='"+memberId+"'";
		    try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, password);
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
					
			return result;
		}
		

}