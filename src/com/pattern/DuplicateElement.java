package com.pattern;

public class DuplicateElement {
	public static void main(String[] args) {
		
//		int []arr= {1,2,3,4,2,7,8,8,3};
//		System.out.println("Duplicate element in array list");
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j])
//					System.out.println(arr[j]);
//			}
//		}
		
		boolean flag=false;
		String arr[]= {"java","c","c++","python","Java"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("found duplicate element" + arr[i]);
				flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("Duplicate value not found");
		}
		
	}

}
