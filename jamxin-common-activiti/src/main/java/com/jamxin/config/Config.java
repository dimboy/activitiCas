package com.jamxin.config;

import javax.sql.DataSource;

import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {
	
	@Bean
	public DataSource database() {
	    return DataSourceBuilder.create()
	        .url("jdbc:mysql://127.0.0.1:3306/activiti?characterEncoding=UTF-8")
	        .username("root")
	        .password("123456")
	        .driverClassName("com.mysql.jdbc.Driver")
	        .build();
	}
	
//  activity beans

}
