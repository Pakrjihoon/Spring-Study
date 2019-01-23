package service;

import java.util.List;
import java.util.Map;

import vo.Movie;

public interface MoviesService {
	public Map<String, Object> movies(int pageNo);
}
