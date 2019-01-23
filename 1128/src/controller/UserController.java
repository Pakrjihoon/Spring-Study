package controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import service.UsersService;
import vo.User;

@Controller
public class UserController {
	
	private UsersService usersService; 
	
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	
	@RequestMapping(value="/session", method=RequestMethod.POST)
	public String login(User user, HttpSession session) {
		
		//System.out.println(user.getId());
		//System.out.println(user.getPassword());
		//System.out.println("POST /session");
		
		session.setAttribute("loginUser",usersService.login(user));
		
		return "redirect:/index";
	}
	@RequestMapping(value="/session", method=RequestMethod.DELETE)
	public String logout(HttpSession session) {
		System.out.println("DELETE / session");
		
		session.invalidate();
		
		return "redirect:/index";
	}
	
	@RequestMapping(value="/user/join", method=RequestMethod.GET)
	public String joinForm() {
		return "userForm";
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String join(User user, RedirectAttributes ra) {
		
		boolean result = usersService.join(user);
		
		/*
		 * 리다이렉트로 넘어갈때 딱 한번만
		 * 쓰는 attribute를 이용하면 편리합니다.
		 * 
		 */
		if(result) {
			ra.addFlashAttribute("msg",user.getNickname()+"님 회원가입이 완료되었습니다.");
		} //if end
		System.out.println("POST /user");
		return "redirect:/index";
	}
	
	//주소에서 변수 처리 {변수명}
	//인자를 int no만 기재할경우 파라미터가 넘어옴
	//그래서 @PathVariable를 사용합니다.
	@RequestMapping(value="/user/{no}/update", method=RequestMethod.GET)
	public String updateForm(Model model, @PathVariable int no) {
		
		model.addAttribute("user",usersService.getUser(no));
		
		return "userForm";
	} 
	
	@RequestMapping(value="/user" , method=RequestMethod.PUT)
	public String modify(User user, RedirectAttributes ra, HttpSession session) {
		
		int result = usersService.modify(user);
		
		if(result==1) {
			ra.addFlashAttribute("msg", user.getNickname()+"님 회원수정이 완료되었습니다");
		}
		session.setAttribute(User.LOGIN, usersService.getUser(user.getNo()));
		
		return "redirect:/index";
	}
	
}
