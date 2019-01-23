package service;

import java.util.List;
import java.util.Map;

import vo.Genre;
import vo.PageVO;

public interface GenresService {
	public Map<String, Object> genreList(int pageNo); 
	public int remove(int no);
	public boolean insert(String genre);
	public Genre getGenre(int no);
	public int update(Genre genre);
}
