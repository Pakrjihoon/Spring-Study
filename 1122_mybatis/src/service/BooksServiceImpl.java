package service;

import java.util.List;

import dao.BooksDAO;
import vo.Book;

public class BooksServiceImpl implements BooksService{
	
	//서비스는 DAO에 의존적 ->멤버필드를 가지고 있어야함
	private BooksDAO booksDAO;
	
	//주입은 생성자와 setter 주입이 있지만 이 구문은
	// setter 주입을 하는 구문이다. 
	public void setBooksDAO(BooksDAO booksDAO) {
		this.booksDAO = booksDAO;
	}

	@Override
	public int registerBook(Book book) {
		return booksDAO.insertBook(book);
	}

	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		return booksDAO.selectList();
	}
	public int deleteBook(int no) {
		return booksDAO.delete(no);
	}

	@Override
	public int changeTitle(Book book) {
		return booksDAO.updateTitle(book);
	}

}
