package app;



import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.BooksService;
import vo.Book;


public class MyBatisEx4 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		BooksService service = (BooksService)context.getBean("booksService");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("수정할 책 번호 : ");
			String noStr = scan.next();
			int no = Integer.parseInt(noStr);
			System.out.println("수정할 책 이름 : ");
			String title = scan.next();
			
			Book book = new Book();
			
			book.setNo(no);
			book.setTitle(title);
			int result = service.changeTitle(book);
			
			if(result==0) {
				System.out.println("수정되지 않았습니다. 책 번호를 확인해주세요\n");
			} else {
				System.out.println("수정이 되었습니다.\n");
			}
		}
	} //main() end

} //MyBatisEx4 end
