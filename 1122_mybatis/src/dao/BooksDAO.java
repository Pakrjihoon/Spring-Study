package dao;

import java.util.List;

import vo.Book;

public interface BooksDAO {
	
	// DB와 연동하기 때문에 메서드 이름은
	// select~,insert~,update~,delete~ 이런식으로
	public int insertBook(Book book);
	public List<Book> selectList();
	public int delete(int no);
	public int updateTitle(Book book);
}
