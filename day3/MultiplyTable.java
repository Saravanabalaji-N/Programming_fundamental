package com.chainsys.day3;
import java.util.*;
public class MultiplyTable {

	public static void main(String[] args) {
		int number;
		int multiplyer;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		number=sc.nextInt();
		System.out.println("Enter the multiplyer :");
		multiplyer=sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			System.out.println(i+" * "+multiplyer+" = "+ i*multiplyer);
		}
	}

}
