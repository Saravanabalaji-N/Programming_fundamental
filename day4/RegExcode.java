package com.chainsys.day4;
import java.util.*;
import java.util.regex.*;  
public class RegExcode{

	public static void main(String[] args) {
    
        Scanner RegularExpression = new Scanner(System.in);
        System.out.println("Enter Your Mail Address : ");
        String userName = RegularExpression.next();
        System.out.println("Enter PassWord : ");
        String password = RegularExpression.next();

        String emailPattern = "^[a-z0-9]+@[A-Za-z]+\\.[a-z]+{5,}$";
        String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()])(?=.*\\d).{7,}$";
        
        while (!(userName.matches(emailPattern))) 
        {
            System.out.println("Enter The Mail Address Again : ");
            userName = RegularExpression.next();
        }

        while (!(password.matches(passwordPattern))) 
        {
            System.out.println("Enter The Password Again : ");
            password = RegularExpression.next();
        }

        if (userName.matches(emailPattern) && password.matches(passwordPattern)) 
        {
            System.out.println("LoggedIn Successfully!!!");
        } 
        else 
        {
            System.out.println("Need A Strong Username and Password");
          }
}
}

