package service;

import org.springframework.stereotype.Service;

import dao.UsersDAO;
import vo.User;

@Service
public class UsersServiceImpl implements UsersService {

	private UsersDAO usersDAO;
	
	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	@Override
	public User login(User user) {
		return usersDAO.selectLogin(user);
	}
	
}




