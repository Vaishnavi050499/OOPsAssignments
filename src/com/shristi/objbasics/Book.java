package com.shristi.objbasics;

public class Book {

	
	
	String booktitle;
	String author;
	int price;
	String category;
	
	Book(String booktitle,String author,int price,String category){

		
		this.booktitle=booktitle;
		this.author=author;
		this.price=price;
		this.category=category;
}
	public void getBookDetails()
	{
		System.out.println("BookTile"+ "-->"+booktitle);
		System.out.println("BookAuthor"+"-->"+author);
		System.out.println("Price "+"-->"+price);
		System.out.println("Category"+"-->"+category);
	
	}
	
	public String checkBookType()
	{
		if(price>500) {
			return booktitle+" "+"is a premium book";
			
			}
			else {
				return booktitle+" "+"is a standard book";
			}
		}
	}


