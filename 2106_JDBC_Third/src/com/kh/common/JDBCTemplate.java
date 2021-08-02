package com.kh.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	// DAO에서 드라이버랑 연결하던 부분을 따로 분리시킴
	
	private static JDBCTemplate instance; 
	// 자기자신을 참조변수로 만든다. 한번만 쓰면 따로 new 해줄 필요 없이 쓸 수 있음 (static 때문에)

	public JDBCTemplate() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 자기 자신을 리턴하는 메소드, 객체가 한번만 만들어짐 
	public static JDBCTemplate getConnection() {
		
		if(instance == null) {
			instance = new JDBCTemplate();
		}
		return instance;
	}
	
	public Connection createConnection() throws SQLException {
		// DB와의 연결을 위한 DB Server에 관한 정보(Property)를 설정한다
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "STUDENT";
		String password = "STUDENT";
		Connection connection = DriverManager.getConnection(url, user, password);
		connection.setAutoCommit(false); // -> ctrl+space throws SQLException 선택
		// 자동커밋방지, 로직을 수행하기 전에 트랜잭션 시작
		return connection;
	}
	
	
	// 일괄적으로 닫아주는 기능 (MemberDAO에 따로 close안해도 됨)
	// preparedstatement는 stmt로도 닫기 대체 가능 -> 다형성
	// why? stmt를 상속 받은 클래스기때문에 
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		

