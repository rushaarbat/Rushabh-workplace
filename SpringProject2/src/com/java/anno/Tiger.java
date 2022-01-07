package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tiger")
@Scope("prototype")
public class Tiger extends WildAnimal {
	
	public Tiger() {
		System.out.println("Tiger Class constructor loaded..");
	}

	public void fight() {
		System.out.println("Tiger are fighting...");
	}
}
