package com.corejava;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp, num;
		boolean isprime=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no");
		num=sc.nextInt();
		for(int i=2;i<num/2;i++) {
			temp=num%2;
			if(temp==0) {
				isprime=false;
				break;
				
			}
			
		}
		if(isprime)
			System.out.println(num + " no is prime");
		else
			System.out.println(num + " no is not prime");

		
	}

}
