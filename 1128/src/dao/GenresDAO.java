package dao;

import java.util.List;

import vo.Genre;
import vo.PageVO;

public interface GenresDAO {
	public List<Genre> selectList(PageVO pageVO);
	public int delete(int no);
	public boolean insert(String genre);
	public Genre selectOne(int no);
	public int update(Genre genre);
	public int selectTotal();
}
