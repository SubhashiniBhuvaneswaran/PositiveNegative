package com.wipro.logic;

public class leapYr {
public static void main(String[] args) {
	double year=1997;
	String a;
	a=(year%4==0)?"leap":"not leap";
	System.out.println(a);
}
}
