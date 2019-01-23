package dao;

import vo.User;

public interface UsersDAO {
	
	public User selectLogin(User user);
	public int insert(User user);
	public User selectOne(int no);
	public int update(User user);
}
