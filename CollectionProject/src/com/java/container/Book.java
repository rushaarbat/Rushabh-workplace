package com.java.container;

import java.util.Objects;

//b1.equals(b2);

public class Book {
	
	private int number;
	private String title;
	private String author;
	private int numberOfPages;
	private double cost;
	private int edition;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(author, cost, edition, number, numberOfPages, title);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost) && edition == other.edition
				&& number == other.number && numberOfPages == other.numberOfPages && Objects.equals(title, other.title);
	}

	public Book() {
		
	}
	
	public Book(int number, String title, String author, int numberOfPages, double cost, int edition) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.cost = cost;
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages
				+ ", cost=" + cost + ", edition=" + edition + "]";
	}
	
	
	
}
