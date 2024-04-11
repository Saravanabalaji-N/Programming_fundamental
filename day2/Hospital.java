package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {

	public static void main(String[] args) {
		int doctors;
		int nurse;
		boolean medicine =true;
		String hospitalname;
		int Hospital;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of Doctors :");
		doctors = sc.nextInt();
		System.out.print("total doctors ="+ doctors +"\n");
		System.out.print("enter the no of nurse :");
		nurse = sc.nextInt();
		System.out.println("total nurse ="+ nurse);
		System.out.print("is medicine available :");
		System.out.println(medicine+"available");
		System.out.print("enter the hospital name :");
		hospitalname = sc.next();
		System.out.println("Hopital name is "+ hospitalname);
	}

}
