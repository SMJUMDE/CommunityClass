package com.corejava;

import java.util.Scanner;

public class Palimdrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//121
        String original, reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Input");
        original = sc.nextLine();
        for(int i=original.length()-1;i>=0;i--) {
        	reverse= reverse+original.charAt(i);

        }
        
        if(original.equalsIgnoreCase(reverse))
        	System.out.println(original + "   is palindrome");
        else
        	System.out.println(original + "   is not palindrome");
		
		

	}

}
