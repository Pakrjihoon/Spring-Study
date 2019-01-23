package app;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BooksService;


public class MyBatisEx3 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		BooksService service = (BooksService)context.getBean("booksService");
		
		int result = service.deleteBook(29);
		System.out.println(result);
	} //main() end

} //MyBatisEx1 end
