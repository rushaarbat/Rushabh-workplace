package com.java.container;

public class Book1 {
	private int number;
	private String title;
	private String author;
	private int numberOfPages;
	private double cost;
	private int edition;

	@Override
	public String toString() {
		return "Book1 [number=" + number + ", title=" + title + ", author=" + author + ", numberOfPages="
				+ numberOfPages + ", cost=" + cost + ", edition=" + edition + "]";
	}
	public Book1(int number, String title, String author, int numberOfPages, double cost, int edition) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.cost = cost;
		this.edition = edition;
	}
	
}
