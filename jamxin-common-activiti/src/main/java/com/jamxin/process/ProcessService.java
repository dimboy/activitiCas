package com.jamxin.process;

import javax.annotation.PostConstruct;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

//import com.jamxin.framework.context.SpringContextUtil;

//@Service
public class ProcessService {

	@PostConstruct
	public void onStartUp(){
		
	}
	
	/**
	 * start the decorateProject process , when applyment is created 
	 * 
	 */
	public void onApplingStartBusiness(Long projectId){
	
		if(projectId == null){
			return;
		}
		
		//ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
		
		//RepositoryService reponsitoryService = (RepositoryService) applicationContext.getBean("reponsitoryService");
		// RuntimeService runtimeService = (RuntimeService) applicationContext.getBean("runtimeService");
		
		// runtimeService.startProcessInstanceById("decorateProject", Long.toString(projectId),null);
	}
}
