package com.chainsys.day5;
import java.util.*;
public class CabFair2 {

	public static void main(String[] args) {
		String userName;
		int kilometer = 0;
		String type;
		int total;
		double discount;
		int billamount;
		Scanner sc=new Scanner(System.in);
		CabFair3 cf=new CabFair3();
		
		//UserName----
		System.out.println("enter the username :");
		userName=sc.next();
		String UsernamePattern = "^[A-za-z]+$";
		System.out.println(userName.matches(UsernamePattern));
		while(!(userName.matches(UsernamePattern))) {
			System.out.println("enter the username :");
			userName=sc.next();
		}
		
		//CabType----
		System.out.println("Available Cab\n"+"1.Local ( Rs.10 per km )\n"
		+"2.Prime ( Rs.15 per km )\n"
		+"3.Duplex ( Rs.20 per km )");
		System.out.println("\nEnter your CabType :");
		type=sc.next().toLowerCase();
		
	
		if(type.equals("local")) {
			System.out.println("Enter your KiloMeter :");
			kilometer=sc.nextInt();
			while(true) {
				if(kilometer>0) {
					System.out.println("Enter positive integer");
					System.out.println("Enter your KM");
					kilometer=sc.nextInt();

			}
			
		
		else if(type.equals("prime")) {
			System.out.println("Enter your KM");
			kilometer=sc.nextInt();
//			System.out.println(cf.prime(kilometer));
     		billamount=(cf.prime(kilometer));
			System.out.println("The final Amout is :"+cf.discount(billamount));
			break;
		    }
		else if(type.equals("duplex")) {
			System.out.println("Enter your KM");
			kilometer=sc.nextInt();
			System.out.println(cf.duplex(kilometer));
			billamount=(cf.duplex(kilometer));
			System.out.println("The final Amout is :"+cf.discount(billamount));
	 		break;
	     	}
		else
	 {
		while(true) {
			System.out.println("enter the valid input");
			System.out.println("enter your CabType :");
			type=sc.next().toLowerCase();
			break;
		    }
		}
		
	
		
		System.out.println(cf.local(kilometer));
		billamount=(cf.local(kilometer));
		System.out.println("The final Amout is :"+cf.discount(billamount));
		break;
	}
}
}
}

