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
		// TODO Auto-generated method stub
		return session.selectOne("users.selectLogin", user);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return session.insert("users.insert",user);
	}

	@Override
	public User selectOne(int no) {
		// TODO Auto-generated method stub
		return session.selectOne("users.selectOne", no);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return session.update("users.update",user);
	}
	
}

