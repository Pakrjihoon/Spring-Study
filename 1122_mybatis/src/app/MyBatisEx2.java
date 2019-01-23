package app;

import java.sql.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BooksService;
import vo.Book;

public class MyBatisEx2 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		BooksService service = (BooksService)context.getBean("booksService");
		
		List<Book> list = service.getBookList();
		
		for(Book book: list) {
			System.out.println(book.getTitle());
		}
	} //main() end

}
