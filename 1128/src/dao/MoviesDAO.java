package dao;

import java.util.List;
import java.util.Map;

import vo.Movie;

public interface MoviesDAO {
	public List<Movie> selectList(Map map);
	public int selectTotal();
}
