package com.pattern;

import java.util.Scanner;

public class UserEnteredValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      System.out.println("Enter a value");
//      Scanner sc= new Scanner(System.in);
//    int value1=sc.nextInt();
//    int value2=sc.nextInt();
//    int sum =value1+value2;
//    System.out.println("User Entered  value1" +" "+ value1);
//    System.out.println("User Entered  value2" +" "+ value2);
//    System.out.println("addition of those value" +" "+ sum);
		
		
		//addition of two no
//		int first=10;
//		int second=20;
//		int sum=first+second;
//		System.out.println(first +"+"+ second +"="+ sum);
		
		
		//multiplication of two number
//		float first=10.2f;
//		float second =2.35f;
//		float product=first*second;
//		System.out.println(first + "*" + second +"=" + product);
//				
		//ascii value of char
//		char ch='a';
//		int ascii=ch;
//		System.out.println("the ascii value of " + ch + " is: " + ascii);
	
		
		//Compute Quotient and Remainder
//		int divident =25;
//		int diviser=4;
//		 int quotient=divident/diviser;
//		 int remainderr=divident%diviser;
//		 System.out.println("quotient= " + quotient);
//		 System.out.println("remainder= " + remainderr);
		 
		 //Swap two numbers using temporary variable
		
//		float x=10f, y=20.4f;
//		System.out.println("before swapping =" + x + " & " + y);
//		float z=x;
//		x=y;
//		y=z;
//		System.out.println("after swapping =" + x + " & " + y);
//		
//		
		
		// Check whether a number is even or odd using if...else statement
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter a number");
//		int num=sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("num is even " + num);
//		}else {
//			System.out.println("num is odd " + num);
//		}
		
		
		// Check whether an alphabet is vowel or consonant using if..else statement
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  char");
		String ch=sc.next();
		switch(ch){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(ch + " is vowel");
				break;
				default:
				System.out.println(ch + " is consonant");
				
		}
    
      
	}

}
