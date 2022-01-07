package com.java.container;

public class TestProActive {
	public static void main(String[] args) {

		Student stu = new Student();
		Executive exe = new Executive();
		Developer develper = new Developer();
		
		Neova neova = new Neova();
		neova.workForProjects(develper);
	}
}
