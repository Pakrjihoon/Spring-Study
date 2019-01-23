package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.BookPrinter;


public class SpringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book book = new Book();
//		book.setNo(1);
//		book.setTitle("죽고싶지만 떡볶이는 먹고 싶어");
//		book.setAuthor("백세희");
//		
//		BookPrinterKOR printer = new BookPrinterKOR();
		
//		// 의존성 주입
//		// 기재하지 않을시 book 이라는 객체는 null이라 주입하지 않으면
//		// NullPointerException
//		printer.setBook(book);
		
//		printer.pirntBook();
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		BookPrinter printer = (BookPrinter)factory.getBean("printer");
		printer.pirntBook();
	} // main() end 

} // SpringEx2 end
