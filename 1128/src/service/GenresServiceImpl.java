package service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import dao.GenresDAO;
import util.PaginateUtil;
import vo.Genre;
import vo.PageVO;

public class GenresServiceImpl implements GenresService {
	
	private GenresDAO genresDAO;
	
	public void setGenresDAO(GenresDAO genresDAO) {
		this.genresDAO = genresDAO;
	}


	@Override
	public int remove(int no) {
		// TODO Auto-generated method stub
		return genresDAO.delete(no);
	}

	@Override
	public boolean insert(String genre) {
		// TODO Auto-generated method stub
		return genresDAO.insert(genre);
	}

	@Override
	public Genre getGenre(int no) {
		// TODO Auto-generated method stub
		return genresDAO.selectOne(no);
	}

	@Override
	public int update(Genre genre) {
		// TODO Auto-generated method stub
		return genresDAO.update(genre);
	}


	@Override
	public Map<String, Object> genreList(int pageNo) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new ConcurrentHashMap<>();
		
		int numPage = 5;
		int numBlock = 3;
		PageVO pageVO = new PageVO(pageNo, numPage);
		String url="/genre/page/";
		int total = genresDAO.selectTotal(); 
		map.put("genreList",genresDAO.selectList(pageVO));
		map.put("paginate", PaginateUtil.getPaginate(pageNo, total, numPage, numBlock, url));
		return map;
	}
	
}
