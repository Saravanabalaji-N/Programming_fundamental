package com.chainsys.day5;

import java.util.Scanner;

public class CabFair3 {
	
	//Kilometer----
	public static int local(int num) {
		Scanner sc=new Scanner(System.in);
			num*=10;
			return num;
		}
	
	public static int prime(int num) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			if(num<0) {
				System.out.println("Enter positive integer");
				System.out.println("Enter your KM");
				num=sc.nextInt();
			 }
			num*=15;
			return num;
			}
		}
	
	public static int duplex(int num) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			if(num<0) {
				System.out.println("Enter positive integer");
				System.out.println("Enter your KM");
				num=sc.nextInt();
			}
			num*=20;
			return num;
		}
	}
	
	//Discount----
		public static double discount(int amount) {
			System.out.println("The total amount : " + amount);
			double discount =(amount*0.02);
			System.out.println("Discount amount :" + discount);
			double discountamount=amount-discount;
			return discountamount;
			}
	}	
