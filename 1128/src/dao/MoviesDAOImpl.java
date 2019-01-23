package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import vo.Movie;

public class MoviesDAOImpl implements MoviesDAO{
	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<Movie> selectList(Map map) {
		// TODO Auto-generated method stub
		return session.selectList("movies.selectList", map);
	}

	@Override
	public int selectTotal() {
		return session.selectOne("movies.selectTotal");
	}
}
