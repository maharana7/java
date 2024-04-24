package com.nit.books;

public class LibraryCatalog {

	Book[] books;
	int catalogSize;
	
	LibraryCatalog(int maxSize){
		books = new Book[maxSize];
	}
	
	public void addBook(Book book) {
		if(catalogSize < books.length) {
			books[catalogSize] = book;
			catalogSize++;
		}			
		else System.out
		
		
		.println("No more books can be added.");
	}
	
	public void displayCatalog(){
		for(int i = 0; i < catalogSize; i++) {
			System.out.println(books[i]);
		}
	}
	
	
	
}
