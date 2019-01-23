package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionUtils;

import vo.Book;

public class BooksDAOImpl implements BooksDAO{
	
	//DAO는 SqlSession에 의존성이 있기 때문에
	//멤버필드로 선언해줌
	private SqlSession session;
	
	//의존성 주입용
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public int insertBook(Book book) {
		return session.insert("books.insertBook",book);
	}

	@Override
	public List<Book> selectList() {
		return session.selectList("books.selectList");
	}

	@Override
	public int delete(int no) {
		return session.delete("books.delete",no);
	}

	@Override
	public int updateTitle(Book book) {
		return session.update("books.updateTitle",book);
	}
}
