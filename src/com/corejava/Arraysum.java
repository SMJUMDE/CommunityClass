package com.corejava;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int []a = {0,1,2};
	    int []b= {2,3,4};
	    int []c= new int[a.length];
	    for(int i=0;i<a.length;i++) {
	    	c[i]=a[i]+b[i];
	    	System.out.println(c[i]);
	     
		}
		

	}

}
