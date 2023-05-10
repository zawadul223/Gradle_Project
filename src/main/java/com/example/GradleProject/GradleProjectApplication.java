package com.example.GradleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GradleProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(GradleProjectApplication.class);
		MyService myService = context.getBean(MyService.class);
		myService.doSomething();
		//SpringApplication.run(GradleProjectApplication.class, args);
	}

}
