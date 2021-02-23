package org.abhinash.javabrains;

import org.abhinash.javabrains.Service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = (ShapeService) ctx.getBean("shapes");
		System.out.println(shapeService.getCircle().getName());
	}
}