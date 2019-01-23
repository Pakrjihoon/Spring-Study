package app;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BooksService;
import vo.Book;

public class MyBatisEx1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		BooksService service = (BooksService)context.getBean("booksService");
		
		Book book = new Book();
		book.setTitle("새는 페루에 가서 죽다");
		book.setAuthor("로맹 가리");
		book.setImage("defaultimg.png");
		book.setPublicationDate(Date.valueOf("2013-04-29"));
		int result = service.registerBook(book);
		System.out.println("결과 : "+result);
	} //main() end

} //MyBatisEx1 end
