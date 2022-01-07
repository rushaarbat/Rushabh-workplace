package com.java.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theAnimal")
@Scope("prototype")
public class Animal {
	
@Autowired
@Qualifier("animal")
Animal animal1;
	
@Autowired
@Qualifier("tiger")
Animal animal2;
	
	
@Autowired
@Qualifier("loin")
Animal animal3;
		
	
	public Animal() {
		System.out.println("Animal Class constructor loaded..");
	}

	public void run() {
		System.out.println("Animals are Running...");
		
		animal1.fight();
		animal2.fight();
		animal3.fight();

	}

	
	
	
	
	
	
}
