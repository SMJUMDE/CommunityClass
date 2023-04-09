package com.Collection;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Java");
		ll.add(30);
		ll.add(null);
		ll.add("java");
		ll.set(0, "core");
		System.out.println(ll);
		ll.add(0, "spring");
		ll.removeLast();
		ll.addFirst("ccc");
		System.out.println(ll);
		
		

	}

}
