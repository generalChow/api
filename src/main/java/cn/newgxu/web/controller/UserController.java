package cn.newgxu.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.newgxu.service.UserService;

/**
 * @author generalChow
 * @email 463734522@qq.com
 * 2013年9月17日
 *
 */
@Controller
public class UserController {
	

	@Inject
	private UserService userService;
	



	@RequestMapping("/api/user/{userName}")
	@ResponseBody
	public ModelAndView test(ModelAndView model,@PathVariable String userName){
		model.addObject("user", userService.getUserByUN(userName));
		return model;
	}
}
