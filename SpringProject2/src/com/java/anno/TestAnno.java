package com.java.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
public class TestAnno {
	public static void main(String[] args) {
		
	
	System.out.println("loading the container...");
	
	ApplicationContext container = new ClassPathXmlApplicationContext("SpringConfigAnno.xml");

	System.out.println("--------------------------");
	System.out.println("container loaded...");
	
	
	Animal  animal= container.getBean("theAnimal",Animal.class);
	
	animal.run();
	System.out.println("--------------------------");	
}
}
