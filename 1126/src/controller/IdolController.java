package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.IdolsService;

@Controller
public class IdolController {
	private IdolsService idolsService;
	
	public void setIdolsService(IdolsService idolsService) {
		this.idolsService = idolsService;
	}
	
	@RequestMapping("/idolList.bjd")
	public void IdolList(Model model) {
		model.addAttribute("idols", idolsService.IdolList());
	}
	
	@RequestMapping("/idolDetail.bjd")
	public void idolDetail(Model model, int no) {
		model.addAttribute("idol", idolsService.IdolDetail(no));
	}
}
