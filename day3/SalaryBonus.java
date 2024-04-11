package com.chainsys.day3;
import java.util.*;
public class SalaryBonus {

	public static void main(String[] args) {
//		A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//		Ask user for their salary and year of service and print the net bonus amount
		
		double salary;
		int experience ;
		double bonus = 0;
		double total;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Salary :");
		salary=sc.nextInt();
		while(salary<0)
		{
			System.out.println("enter the valid input :");
			System.out.println("enter your Salary :");
			salary=sc.nextInt();
		}
		System.out.println("enter your Experience :");
		experience=sc.nextInt();
		while(experience<0)
		{
			System.out.println("enter the valid input :");
			System.out.println("enter your experience :");
			experience=sc.nextInt();
		}
		
		if(experience > 5) {
			bonus=salary/100*5;
			System.out.println("Your bonus is :"+bonus);
		}
		else {
			System.out.println("Not valid for bonus");
		}
		total=salary+bonus;
		System.out.println("your total salary is :"+total);
	}

}
