package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.fasterxml.jackson.databind.ObjectMapper;

import vo.User;

@Controller
public class ExController {

	// @RequestMapping(value="/ex1.bjd", method=RequestMethod.GET)
	// 축약해서
	@RequestMapping("/ex1.bjd")
	public void ex1() {
		System.out.println("ex1.bjd 연결완료");

		// 컨트롤러안의 메서드의 리턴자료형은
		// 바로 뷰(클라이언트 응답)에 관련된 것입니다.
		// 1) HTML로 응답(JSP뷰 : InternalResourceView) (void)
		// 2) 리다이렉트로 응답(RedirectView)
		// 3) json으로 응답(JacksonJsonView)
		// - @ResponseBody 활용
		
		// 리턴값이 없으면 1)번
		//return new InternalResourceView("/WEB-INF/view/");
		
		// String으로 리턴해도 1)번 or 2)번
		//- 리다이렉트시 "redirect:"을 써주면 됩니다.
		// return "redirect:/index.bjd"; 
		// FM대로 하면 
		// return new RedirectView("/index.bjd");
		
	} //ex1() end
	
	@RequestMapping("/ex2.bjd")
	@ResponseBody
	public List<User> ex2() {
		
		List<User> list = new ArrayList<>();
		list.add(new User("test","1111","테스터"));
		list.add(new User("test1","1111","테스터1"));
		list.add(new User("test2","1111","테스터2"));
		list.add(new User("test3","1111","테스터3"));
		list.add(new User("test4","1111","테스터4"));
		
//		User user = new User();
//		user.setId("test");
//		user.setPassword("1234");
//		user.setNickname("테스터");
//		user.setBirthDate(Date.valueOf("1999-12-12"));
		
		return list;		
	}
	
	@RequestMapping("/index.bjd")
	public void index() {
		
	}
	@RequestMapping(value="/join.bjd", method=RequestMethod.POST)
	public String join(User user
			/*HttpServletRequest request*/) {
		
		/*
		 *  Model1 방식 		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		String birthDateStr = request.getParameter("birthDate");
		
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		user.setNickname(nickname);
		user.setBirthDate(birthDate);
		*/
		
		// 파라미터가 50개 넘어오면
		// Model1에서는 적어도 101줄이 필요합니다.
		// getParameter()와 객체생성과 setter호출
		
		//그러나 spring은 전부 다 알아서 해줍니다.
		//(단, 파라미터와 멤버필드명이 같을 때)
		System.out.println(user.getId());
		System.out.println(user.getPassword());
		System.out.println(user.getNickname());
		System.out.println(user.getBirthDate());
		
		/*
		 * 파라미터
		 * 세션
		 * 리퀘스트 헤더
		 */

		System.out.println("회원가입 페이지 호출");
		
		return "redirect:/index.bjd";
	}
	
}
