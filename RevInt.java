package com.wipro.player;

public class RevInt {
public static void main(String[] args) {
	int a=2345;
	int sum=0;
	int r = 0;
	while (a>0)
	{
	    r=a%10;
		a=a/10;
		System.out.print(r);
		
	}
}
}
