package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("animal")
@Scope("prototype")
public class WildAnimal extends Animal {
	public WildAnimal() {
		System.out.println("WildAnimal Class constructor loaded..");
	}
	public void fight() {
		System.out.println("WildAnimals are fighting...");
	}

}
