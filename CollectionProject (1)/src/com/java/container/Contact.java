package com.java.container;

public class Contact{
	private String name;
	private String contact_id;
	@Override
	public String toString() {
		return "Contact [name=" + name + ", contact_id=" + contact_id + "]";
	}
	public Contact(String name, String contact_id) {
		super();
		this.name = name;
		this.contact_id = contact_id;
	}
}
