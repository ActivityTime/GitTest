package top.actim.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.actim.pojo.User;
import top.actim.service.UsersService;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;

	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", usersServiceImpl.show());
		return "index.jsp";
	}

	@RequestMapping("show-source")
	@ResponseBody
	public List<User> defaultWay() {
		Logger.getLogger(this.getClass()).info("ResponseBody-Oxy");
		return usersServiceImpl.show();
	}
}
