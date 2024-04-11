package com.chainsys.day3;
import java.util.*;
public class ShopDiscount {

	public static void main(String[] args) {
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user
		
		int product=100;
		int quantity;
		int cost;
		double discount;
		double total_cost;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the quantity :");
		quantity=sc.nextInt();
		while(quantity<0) {
			System.out.println("invalid input");
			System.out.println("enter the number of the quantity :");
			quantity=sc.nextInt();
		}
		cost=product*quantity;
		discount=cost/100*10;
		System.out.println(cost +"-"+discount+ " "+"Discount (10%)");
		total_cost=cost-discount;
		System.out.print("the total Cost is :"+total_cost);
	}

}
