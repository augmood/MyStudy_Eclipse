package com.kh.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDAO {
	public static void main(String [] args) {
		/*
		 * 1. 드라이버 등록
		 * 2. 드라이버 연결
		 * 3. Statement 객체 생성
		 * 4. SQL 전송 = 쿼리문 실행
		 * 5. 결과 받기
		 * 6. 닫기 (객체 반환)
		 */
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; //-> 작성 오타 주의
		String user = "STUDENT";
		String password = "STUDENT";
		String sql = "SELECT * FROM MEMBER";
		
		Connection conn = null;
		Statement stmt = null; // -> interface
		ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 등록
			conn = DriverManager.getConnection(url, user, password); // 연결
			stmt = conn.createStatement(); // 객체 생성
			rset = stmt.executeQuery(sql); // 쿼리문 전송
			while(rset.next()) { // 출력하기
				System.out.println("회원 아이디 : "+rset.getString("MEMBER_ID") 
						+ ", 회원 비밀번호 : "+rset.getString("MEMBER_PWD") 
						+ ", 회원 이름 : "+rset.getString("MEMBER_NAME")
						+ ", 회원 나이 : "+rset.getString("MEMBER_AGE"));//가져옵니다
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
	
	}
}


