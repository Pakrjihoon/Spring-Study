package controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.UsersService;
import vo.User;

@Controller
public class UserController {
	
	private UsersService usersService;
	
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	
	@RequestMapping("/logout.html")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/index.html";
	}
	
	
	@RequestMapping(value="/login.html",
			method=RequestMethod.POST)
	public String login(User user, HttpSession session) {
		
		session.setAttribute(User.LOGIN, usersService.login(user));
		
		return "redirect:/index.html";
	}//login() end

}




