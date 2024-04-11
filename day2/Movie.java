package com.chainsys.day2;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		String actor;
		String actress;
		String comedian;
		int theater;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the name of the actor :");
		actor = sc.next();
		System.out.println("actor name :"+ actor);
		System.out.print("enter the name of the actress :");
		actress = sc.next();
		System.out.println("actress name ="+ actress);
		System.out.print("enter the name of the comedian:");
		comedian = sc.next();
		System.out.println("comedian name"+ comedian);
		System.out.print("enter the no of theater:");
		theater = sc.nextInt();
		System.out.println("total theater "+theater);
		

	}

}
