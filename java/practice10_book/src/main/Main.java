package main;

import book.BookManager;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=== 도서관리 프로그램 ===");
		
		BookManager bookmanager = new BookManager();
		bookmanager.programStart();

	}

}
