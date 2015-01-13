package com.diors.moudle.controller.course;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diors.moudle.pojo.course.UserModel;
import com.diors.moudle.service.course.IUserService;

@Controller("userController")
@Scope("prototype")
@RequestMapping("/user")
public class UserController {

	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping("/addUserSuccess")
	public String addUserSuccess(UserModel userModel){
		userService.addUser(userModel);
		return "addUserSuccess";
	}

	@RequestMapping("/addUser")
	public String addUser(){
		return "video/videoPlayer";
	}
	
	@RequestMapping("/test")
	public String test(){
		return "test";
	}
	@RequestMapping("/videoPlayer")
	public String videoPlayer(){
		return "videoPlayer";
	}
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	
}
