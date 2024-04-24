package com.nit.constructorprograms;

public class Book {
	
	String name;
	String category;
	String author;
	int ISBN;
	
	Book(String name, String category, String author, int ISBN){
		this.name = name;
		this.category = category;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	String displayDetails() {
		return "Name:"+ name + ", Category:" + category + ", Author:" + author + ", ISBN:" + ISBN + "\n"; 
	}
	
	public static void main(String[] args) {
		Book firstBook = new Book("Rich Dad Poor Dad", "Finance", "Robert Kiwoski", 73992);
		Book secondBook = new Book("Wings of Fire", "Autobiography", "APJ Abdul Kalam", 3628);
		Book thirdBook = new Book("Lord of The Rings", "Mythical", "Tolekin", 8372);
		
		System.out.println(firstBook.displayDetails());
		System.out.println(secondBook.displayDetails());
		System.out.println(thirdBook.displayDetails());
	}

}
