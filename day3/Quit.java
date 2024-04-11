package com.chainsys.day3;
import java.util.*;
public class Quit {

	public static void main(String[] args) {
		int integer;
		 int sum = 0;
		 int quit = 0 ;
	
		Scanner sc =new Scanner(System.in) ;
		
		for(int i=0;i<5;i++) {
        	System.out.println("enter the number:");
        	quit=sc.nextInt();
            sum +=quit ;
            
		}
	
	  System.out.println("sum-> " + sum);
	}	     
	}
	

