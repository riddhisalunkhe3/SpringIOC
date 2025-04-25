package com.springIOC.bookDetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookId;
	private String bookName;
	private int bookPrice;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, int bookPrice) {
		super();
		System.out.println("Constructor-based injection");
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		System.out.println("Setter Injection");
		this.bookId = bookId;
	}

	public String getbookName() {
		return bookName;
	}

	public void setbookName(String bookName) {
		System.out.println("Setter Injection");
		this.bookName = bookName;
	}

	public int getbookPrice() {
		return bookPrice;
	}

	public void setbookPrice(int bookPrice) {
		System.out.println("Setter Injection");
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
}
