package main;

import book.BookManager;

public class Main {

	public static void main(String[] args) throws Exception  {
		System.out.println("====도서관리프로그램====");
		new BookManager().process();

	}

}
