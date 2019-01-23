package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import vo.Book;

@Controller
public class HelloController {

	@RequestMapping("/hello.bjd")
	public void 한글도돼() {
		/*
		 * View의 대표적인 종류
		 * 1) jsp 뷰 : InternalResourceView
		 * 2) json 뷰 : JacksonJsonView
		 * 3) 리다이렉트뷰 : RedirectView
		 */
		
		// FM 방식
		//View view = new InternalResourceView("/WEB-INF/view/hello.jsp");
		//ModelAndView mv = new ModelAndView("/WEB-INF/view/hello.jsp");
		//return mv;
		
		// 리턴 자료형이 String일 경우에
		//return "hello";
	}
	
	@RequestMapping("/test.bjd")
	public void 테스트() {
		
	}
	@RequestMapping("/bookList.bjd")
	public String 책들(Model model) {
		model.addAttribute("msg","이것은 스프링");
		List<Book> list = new ArrayList();
		list.add(new Book(1,"테스트북","기에나",Date.valueOf("2013-01-27")));
		list.add(new Book(2,"거북","이그하람",Date.valueOf("2012-11-12")));
		list.add(new Book(3,"This","plus",Date.valueOf("2015-05-23")));
		list.add(new Book(4,"하이브리드","에렁",Date.valueOf("2018-04-06")));
		
		model.addAttribute("books",list);
		//String으로 리턴하면 InternalResourceView(jsp 뷰)
		return "books";
	}
}
