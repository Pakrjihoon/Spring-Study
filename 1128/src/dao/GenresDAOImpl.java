package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.Genre;
import vo.PageVO;

public class GenresDAOImpl implements GenresDAO{
	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<Genre> selectList(PageVO pageVO) {
		// TODO Auto-generated method stub
		return session.selectList("genres.selectList", pageVO);
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return session.delete("genres.delete",no);
	}

	@Override
	public boolean insert(String genre) {
		// TODO Auto-generated method stub
		return 1==session.insert("genres.insert",genre);
	}

	@Override
	public Genre selectOne(int no) {
		// TODO Auto-generated method stub
		return session.selectOne("genres.selectOne", no);
	}

	@Override
	public int update(Genre genre) {
		// TODO Auto-generated method stub
		return session.update("genres.update",genre);
	}

	@Override
	public int selectTotal() {
		// TODO Auto-generated method stub
		return session.selectOne("genres.selectTotal");
	}

}
