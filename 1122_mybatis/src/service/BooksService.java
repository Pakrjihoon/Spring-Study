package service;

import java.util.List;

import vo.Book;

public interface BooksService {

	// 서비스에서 메서드 명을 정할때는
	// 일반상식적인 수준에서 만들어도 된다.
	// 예) 회원가입 -> join, 글쓰기 -> writeArticle
	public int registerBook(Book book);
	public List<Book> getBookList();
	public int deleteBook(int no);
	public int changeTitle(Book book);
}
