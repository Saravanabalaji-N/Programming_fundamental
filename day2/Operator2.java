package com.chainsys.day2;
import java.util.*;
public class Operator2 {

	public static void main(String[] args) {
			int num ;
			int subject;
			int result=0;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number of subject");
			num=sc.nextInt();
			for(int i=0;i<num;i++) {
			 subject=sc.nextInt();
			 result=result+subject;
			}
			System.out.println(result);
			
			if(result>=400) {
				System.out.println("A grade");
			}
			if(result<300) {
				System.out.println("b grade");
			}
			if(result<=200) {
				System.out.println("c grade");
			}
			if(result<=100) {
				System.out.println("d grade");
			}
	}

}
