package com.shristi.objbasics;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Awesome", "Chetan", 1000, "thriller");
		System.out.println("Details of Book 1:");
		book.getBookDetails();
		String result = book.checkBookType();
		System.out.println(result);

		System.out.println("--------------------------------");

		Book book1 = new Book("OneIndianGirl", "Chetan", 200, "Comedy");
		System.out.println("Details of Book 2:");
		book1.getBookDetails();
		System.out.println(book1.checkBookType());

	}

}
