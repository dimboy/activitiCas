package com.jamxin.process.id.group;

import org.activiti.engine.IdentityService;
import org.activiti.engine.identity.Group;
import org.springframework.beans.factory.annotation.Autowired;

public class GroupController {
	@Autowired
	public IdentityService identityService;
	
	public void saveGroup(Group group){
		identityService.saveGroup(group);
	}
	
}
