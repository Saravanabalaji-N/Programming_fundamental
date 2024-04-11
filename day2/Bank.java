package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int bank_id;
		int Account_no;
		String Username;
		int dob;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the bank_Id :");
		bank_id = sc.nextInt();
		System.out.println("Bank_id :"+ bank_id);
		
		System.out.print("enter the Account_no :");
		Account_no = sc.nextInt();
		System.out.println("Account_no :"+ Account_no);
		
		System.out.print("enter the Username :");
		Username = sc.next();
		System.out.println("USername :"+ Username);
		
		System.out.print("enter the dob:");
		dob = sc.nextInt();
		System.out.println("dob :"+ dob);
	}

}
