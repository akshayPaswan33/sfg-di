package com.example.sfgdi;

import com.example.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); //generally classname with first letter small

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
