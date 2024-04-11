package com.chainsys.day3;
import java.util.*;
public class EmployeeDetails {

	public static void main(String[] args) {
		int age;
		char sex;
		char marital_status;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the age :");
		age=sc.nextInt();
		while(age<20 || age>60) {
			System.out.println("invalid input");
			System.out.println("enter the age :");
			age=sc.nextInt();
		}
		
		System.out.println("enter the sex 'm' or 'f' :");
		sex=sc.next().charAt(0);
		
			if(sex !='m' && sex !='f') {
				while(sex !='m' && sex !='f') {
				System.out.println("enter the valid input");
				System.out.println("enter the sex 'm' or 'f' :");
				sex=sc.next().charAt(0);}
			
			}
				
			while(true) {
					if(sex=='m' && age>20 && age<40) {
						System.out.println("you may work in anywhere");
						break;
					}
					else if(sex=='f') {
						System.out.println("you will work only in urban areas");
						break;
					}
					else if(sex=='m' && age>40 && age<60) {
						System.out.println("you will work only in urban areas");
						break;
					}
			}
		}
	}


