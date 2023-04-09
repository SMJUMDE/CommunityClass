package com.pattern;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("================================");
		
		//reverse StarTriangle
		int x,y,z;
		for(x=5;x>=1;x--) {
			for(y=5;y>x;y--) {
				System.out.print(" ");
			}
			for(z=1;z<(x*2);z++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
		System.out.println("================================");
		
		//

	}

}
