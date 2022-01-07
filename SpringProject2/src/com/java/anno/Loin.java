package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("loin")
@Scope("prototype")
public class Loin extends WildAnimal {
	
	public Loin() {
		System.out.println("Loin Class constructor loaded..");
		
	}
	public void fight() {
		System.out.println("Loin are fighting...");
	}
}
