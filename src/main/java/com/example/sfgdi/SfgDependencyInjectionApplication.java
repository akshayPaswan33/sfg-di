package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import com.example.sfgdi.examplebeans.FakeDataSource;
import com.example.sfgdi.examplebeans.FakeJmsSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDependencyInjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController"); //generally classname with first letter small

		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		FakeJmsSource fakeJmsSource = (FakeJmsSource) ctx.getBean(FakeJmsSource.class);

		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeJmsSource.getUser());
	}

}
