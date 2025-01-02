package com.springfile.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringintroApplication {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Philppe phil = (Philppe) context.getBean("ph1"); Bean Creation and destruction in the code
		context.registerShutdownHook();
		Inter inter = (Inter) context.getBean("inter");






	}

}