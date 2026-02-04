package main;

import book.BookController;

public class Main {

	public static void main(String[] args) {
		System.out.println("도서관리");
		new BookController().process();
	}

}
