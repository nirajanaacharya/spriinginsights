package com.springfile.springintro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringintroApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Student student1 = (Student)context.getBean("student");
		System.out.println(student1);
		Student student2 = (Student)context.getBean("student");
		System.out.println(student2);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}