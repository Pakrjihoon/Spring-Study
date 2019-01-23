package service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


import dao.MoviesDAO;
import util.PaginateUtil;


public class MoviesServiceImpl implements MoviesService {
	
	private MoviesDAO moviesDAO;
	
	public void setMoviesDAO(MoviesDAO moviesDAO) {
		this.moviesDAO = moviesDAO;
	}

	@Override
	public Map<String, Object> movies(int pageNo) {
		//모델에 넘어갈 데이터
		Map<String, Object> map = new ConcurrentHashMap<>();
		int numPage = 5;
		int numBlock = 3;
		//PageVo를 대신 처리하는 맵
		Map<String, Integer> pageMap = new ConcurrentHashMap<>();
		int end = numPage*pageNo;
		int start = end-(numPage-1);
		pageMap.put("start", start);
		pageMap.put("end", end);
		
		int total = moviesDAO.selectTotal();
		String url="/movie/page/";
		
		map.put("movies", moviesDAO.selectList(pageMap));
		map.put("paginate", PaginateUtil.getPaginate(pageNo, total, numPage, numBlock, url));
		return map;
	}
	
}
