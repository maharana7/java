package com.nit.books;

public class Books {

	String bookName;
	String author;
	int noOfPages;
	static float price = 500f;
	
	Books(String bookName, String author, int noOfPages){
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		System.out.println(bookDetails());
	}
	
	String bookDetails() {
		return "\nBook Name: " + bookName + "\nAuthor: " + author + "\nNo of Pages: " + noOfPages + "\nPrice: " + price + " Rs";
	}
	
}
