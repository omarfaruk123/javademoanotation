package com.anotation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anotation.demo.repository.MyRepository;

// import com.anotation.demo.controller.MyController;
// import com.anotation.demo.controller.UserController;
// import com.anotation.demo.service.MyService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
 		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		// UserController user =  context.getBean(UserController.class);
		// System.out.println(user.getUserName());

		// MyController mypost = context.getBean(MyController.class);
		// System.out.println(mypost.getPost());
		// MyService mservice = context.getBean(MyService.class);
		// System.out.println(mservice.getService());
		MyRepository myrepo = context.getBean(MyRepository.class);
		System.out.println(myrepo.getRepo());

	}

}
