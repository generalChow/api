package cn.newgxu.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.newgxu.service.UserService;

@Controller
public class TestController {

	@Inject
	private UserService userService;
	



	@RequestMapping("/api/test")
	@ResponseBody
	public ModelAndView test(ModelAndView model){
		model.addObject("test", "attributeValue");
		model.addObject("user", userService.getUserByUN("121212"));
		return model;
	}
}
