package com.jamxin.process.user;

import java.util.List;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@Autowired
	public IdentityService identityService;
	
	@RequestMapping("user/list")
	@ResponseBody
	public List<User> list(){
		return  identityService.createUserQuery().list();
	}
	
}
