package com.jamxin.app;

import java.util.List;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.ProcessDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com")
@EnableAutoConfiguration(exclude = {
		org.activiti.spring.boot.RestApiAutoConfiguration.class,
		org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class,
		org.activiti.spring.boot.SecurityAutoConfiguration.class,
		//org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration.class
		})
@SpringBootApplication
@ComponentScan(basePackages="com")
public class MyApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(final RepositoryService repositoryService, final RuntimeService runtimeService,
			final TaskService taskService) {

		return new CommandLineRunner() {
			public void run(String... strings) throws Exception {
				System.out.println(
						"Number of process definitions : " + repositoryService.createProcessDefinitionQuery().count());
				List<ProcessDefinition> processDefinisions = repositoryService.createProcessDefinitionQuery().list();

				for (ProcessDefinition processDefinition : processDefinisions) {
					System.out.println(processDefinition.getDescription() + processDefinition.getId());
				}

				System.out.println("Number of tasks : " + taskService.createTaskQuery().count());
				// runtimeService.startProcessInstanceByKey("oneTaskProcess");

				System.out.println("Number of tasks after process start: " + taskService.createTaskQuery().count());
			}
		};

	}
	

}