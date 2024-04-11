package com.chainsys.day2;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		String book_name;
		String book_author;
		int book_code ;
		int book_price;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Book_name :");
		book_name = sc.next();
		System.out.println("Book_name :"+ book_name);
		
		System.out.print("enter the book_author :");
		book_author = sc.next();
		System.out.println("book_author :"+ book_author);
		
		System.out.print("enter the book_code :");
		book_code = sc.nextInt();
		System.out.println("book_code :"+ book_code);
		
		System.out.print("enter the book_price:");
		book_price = sc.nextInt();
		System.out.println("book_price :"+ book_price);
	}

}
