package com.Collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList ();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		
		//System.out.println(al);
		System.out.println(al.remove(2));
		al.add(2,"M");
		al.add("N");
		System.out.println(al);

	}

}
