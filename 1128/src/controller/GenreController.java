package controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.GenresService;
import vo.Genre;

@Controller
public class GenreController {
	private GenresService genresService;
	
	public void setGenresService(GenresService genresService) {
		this.genresService = genresService;
	}
	
	@RequestMapping("/genre/page/{pageNo}")
	public String genreList(Model model, @PathVariable int pageNo) {
		System.out.println("GET /genre/page/"+pageNo);
		model.addAllAttributes(genresService.genreList(pageNo));
		return "genreList";
	}
	@RequestMapping(value="/genre", method=RequestMethod.GET)
	public String Connect() {
		System.out.println("GET /genre");
		return "redirect:/genre/page/1";
	}
	@RequestMapping(value="/genre/{no}", method=RequestMethod.DELETE)
	public String delete(@PathVariable int no) {
		genresService.remove(no);
		System.out.println("DELETE /genre/no");
		return "redirect:/genre";
	}
	
	@RequestMapping(value="/genre/register", method=RequestMethod.GET)
	public String genreInsertForm(Model model) {
		System.out.println("GET /genre/register");
		model.addAttribute("title","등록");
		return "genreForm";
	} //genreInsertForm() end 
	
	@RequestMapping(value="/genre", method=RequestMethod.POST)
	public String register(String name) {
		System.out.println("POST /genre");
		genresService.insert(name);
		return "redirect:/genre";
	}
	
	@RequestMapping(value="/genre/{no}/update", method=RequestMethod.GET)
	public String updateForm(Model model, @PathVariable int no) {
		System.out.println("GET /genre/"+no+"/update");
		model.addAttribute("genre", genresService.getGenre(no));
		model.addAttribute("title","수정");
		return "genreForm";
	}
	
	@RequestMapping(value="/genre", method=RequestMethod.PUT)
	public String update(Genre genre) {
		System.out.println("PUT /genre/");
		genresService.update(genre);
		return "redirect:/genre";
	}
	
	@RequestMapping(value= {"/genre/{no}"},method=RequestMethod.GET)
	public String detail(@PathVariable int no,Model model) {
		System.out.println("GET/ GENRE/NO");
		model.addAttribute("genre",genresService.getGenre(no));
		return "genreDetail";
	}
}
