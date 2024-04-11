package com.chainsys.day4;
import java.util.*;
public class StringMethods {

	public static void main(String[] args) {
		

		String str1 = "ABCD";
		String str2 = "abcd";
		String str3;
		String str4;
		String str5 = "Saravana";
		String str6 = "Balaji";
		String str7= "aaBB";
		String str8="AbCd";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("toLowerCase :"+str1.toLowerCase());
		System.out.println("concat :"+str1.concat("EFGH"));
		System.out.println("toUpperCase :"+str1.toUpperCase());
		System.out.println("length :"+str1.length());
		System.out.println(str7.toLowerCase());
		System.out.println(str8.toUpperCase());
		System.out.println(str5+str6);
		System.out.println(str1.hashCode())	;
		System.out.println("is empty :"+str1.isEmpty())	;
		System.out.println("is blank :"+str1.isBlank())	;
		
			System.out.println("enter your first name");
			str3=sc.next();
			System.out.println("enter your last name");
			str4=sc.next();

			System.out.println("your name is :"+str3.toUpperCase()+" "+str4);

	}



}
