package com.nit.books;

public class LibraryApp {
	
	public static void main(String[] args) {
		
		LibraryCatalog lcg = new LibraryCatalog(5);
		
		lcg.addBook(new Book("Rich Dad Poor Dad", "Robert Kiwoski", 2001));
		lcg.addBook(new Book("The Intelligent Investor", "Benjamin Graham", 1959));
		lcg.addBook(new Book("Lord of the Rings", "Tolekin", 1937));
		
		lcg.displayCatalog();
		
	}
	
}
