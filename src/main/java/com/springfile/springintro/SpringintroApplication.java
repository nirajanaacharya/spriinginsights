package com.springfile.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringintroApplication {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Awiring awr =(Awiring) context.getBean("awe");
		awr.getAwiring();






	}

}