package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import vo.User;

@Repository
public class UsersDAOImpl implements UsersDAO {

	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	@Override
	public User selectLogin(User user) {
		return session.selectOne("users.selectLogin",user);
	}
	
}




