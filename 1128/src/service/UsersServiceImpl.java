package service;

import org.springframework.stereotype.Service;

import dao.UsersDAO;
import vo.User;

@Service
public class UsersServiceImpl implements UsersService{
	
	private UsersDAO usersDAO;
	
	public void setUserDAO(UsersDAO userDAO) {
		this.usersDAO = userDAO;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return usersDAO.selectLogin(user);
	}

	@Override
	public boolean join(User user) {
		// TODO Auto-generated method stub
		return 1==usersDAO.insert(user);
	}

	@Override
	public User getUser(int no) {
		// TODO Auto-generated method stub
		return usersDAO.selectOne(no);
	}

	@Override
	public int modify(User user) {
		// TODO Auto-generated method stub
		return usersDAO.update(user);
	}
}
