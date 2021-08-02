package comkh.member.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	
	private JDBCTemplate prepareConnection;
	
	
	public MemberService() {
		prepareConnection = JDBCTemplate.getConnection();
	}

	// 1
	public List<Member> printAll() {
		MemberDAO mDao = new MemberDAO();
		List<Member> mList = null;
		Connection conn = null;

		try {
			// conn = new JDBCTemplate().createConnection();  
			conn = prepareConnection.createConnection(); // 17번째 줄 참고
			mList = mDao.selectAllList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}

		return mList;
	}
	
	// 2
	public Member printOneById(String memberId) {
		MemberDAO mDao = new MemberDAO();
		Member mOne = null;
		Connection conn = null;
		try {
			conn = new JDBCTemplate().createConnection();
			mOne = mDao.selectOneById(memberId, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return mOne;
	}

	// 3
	public List<Member> printMembersByName(String memberName) {
		MemberDAO mDao = new MemberDAO();
		List<Member> mList = null;
		Connection conn = null;
		
		try {
			conn =  new JDBCTemplate().createConnection();
			mList = mDao.selectListByName(memberName, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return mList;
	}

	// 4
	public int registerMember(Member member) {
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;

		int result = 0; // 입력된 행의 갯수로 데이터가 새로 들어왔는지를 판단함
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.insertMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

	// 5
	public int modifyMember(Member member) {
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.updateMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			} else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	// 6
	public int removeMember(String deleteId) {
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0; 
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.deleteMember(deleteId, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}




}
