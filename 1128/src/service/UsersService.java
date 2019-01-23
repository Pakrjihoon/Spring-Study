package service;

import vo.User;

public interface UsersService {
	
	public User login(User user);
	public boolean join(User user);
	public User getUser(int no);
	public int modify(User user);
}
