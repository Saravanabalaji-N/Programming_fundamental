package com.chainsys.day2;

import java.util.*;

public class Operator {

	public static void main(String[] args) {
		
       int num1;
       int num2;
       int value;
      
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       num1=sc.nextInt();
       System.out.println("enter the number");
       num2=sc.nextInt();
      
       System.out.println("enter 1 for add / 2 for sub / 3 for div / 4 for mul");
       value=sc.nextInt();
      
	if( value==1) {
    	  System.out.println(num1 + num2);
       }
	if( value==2) {
  	  System.out.println(num1-num2);
     }
	if( value==3) {
  	  System.out.println(num1*num2);
     }
	if( value==4) {
  	  System.out.println(num1/num2);
     }
	else {
		System.out.println("Invaild");
	}
	}
	}
	
	
	
	
	

