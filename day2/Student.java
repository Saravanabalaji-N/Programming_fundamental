package com.chainsys.day2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int id;
		String name;
		String location;
		int dob;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Id :");
		id = sc.nextInt();
		System.out.println("studentID :"+ id);
		
		System.out.print("enter the name of the student :");
		name = sc.next();
		System.out.println("Student name :"+ name);
		
		System.out.print("enter the location:");
		location = sc.next();
		System.out.println("location"+ location);
		
		System.out.print("enter the dob:");
		dob = sc.nextInt();
		System.out.println("dob "+dob);
	}

}
