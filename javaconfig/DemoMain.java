package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu = context.getBean("getStudent", Student.class);
		System.out.println(stu);
		stu.study();

	}

}
