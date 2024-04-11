package com.chainsys.day3;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int num1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to add");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			num1=sc.nextInt();
					}
	
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum of the number is :"+sum);
	}

}
