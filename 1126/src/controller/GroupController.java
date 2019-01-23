package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.GroupsService;

@Controller
public class GroupController {
	private GroupsService groupsService;
	
	//서비스에 의존적이므로 멤버필드로 가지고 있어야함.
	public void setGroupsService(GroupsService groupsService) {
		this.groupsService = groupsService;
	}
	@RequestMapping("/groupList.bjd")
	public void groupList(Model model) {
		model.addAttribute("groups", groupsService.groupList());
	}
	@RequestMapping("/groupDetail.bjd")
	public void groupDetail(Model model, int no) {
		model.addAttribute("group", groupsService.groupDetail(no));
	}
}
