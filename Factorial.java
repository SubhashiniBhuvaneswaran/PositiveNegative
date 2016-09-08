package com.wipro.player;

public class Factorial {
	public static void main(String[] args) {
		int a=5;
		int fact=1;
		if(a>=0){
		 for ( int i = 1 ; i <= a ; i++ ){
	             fact = fact*i;
		 }
		  System.out.println("Factorial of "+a+" is = "+fact);
		}
}
}
