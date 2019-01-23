package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Book;

public class SpringEx1 {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		Book book1 = (Book)factory.getBean("book1");
		System.out.println(book1.getTitle());
	} //main() end
} //SpringEx1 end
