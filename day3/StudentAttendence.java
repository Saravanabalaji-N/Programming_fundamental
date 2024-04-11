package com.chainsys.day3;
import java.util.*;
public class StudentAttendence {

	public static void main(String[] args) {
//		
		double attended;
		double held;
		double attendence_percentage;
		char medical_issue='Y';
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of classes held :");
		 held = sc.nextDouble();
		 while(held<0)
		 {
			 System.out.println("enter the valid input");
			 System.out.println("Enter the number of classes held :");
			 held = sc.nextDouble();	 
		 }
		 
		System.out.println("Enter the number of classes attended :");
		 attended = sc.nextDouble();
		 while(attended<0)
		 {
			 System.out.println("enter the valid input");
			 System.out.println("Enter the number of classes attended :");
			 attended = sc.nextDouble();	 
		 }
		
		 attendence_percentage=(attended / held)*100 ;
		
		if(attendence_percentage > 75) {
		System.out.println("You are allowed to sit in exam");
	}
	
	else if(attendence_percentage < 75) {
		System.out.println("if mediacl_issue put 'Y' or put'N' ");
		medical_issue=sc.next().charAt(0);
		if(medical_issue=='Y') {
			System.out.println("You are allowed to sit in exam");
	}
	
		else {
			System.out.println("You are not allowed to sit in exam");
		}
	}
	}
}

