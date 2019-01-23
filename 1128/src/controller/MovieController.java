package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MoviesService;

@Controller
public class MovieController {
	private MoviesService moviesService;
	
	public void setMoviesService(MoviesService moviesService) {
		this.moviesService = moviesService;
	}
	
	@RequestMapping("/movie/page/{pageNo}")
	public String movieList(@PathVariable int pageNo, Model model) {
		System.out.println("GET /movie/page/"+pageNo);
		model.addAllAttributes(moviesService.movies(pageNo));
		return "movieList";
	}
	@RequestMapping(value = "/movie", method=RequestMethod.GET)
	public String Connect() {
		System.out.println("GET /movie");
		return "redirect:/movie/page/1";
	}
}
