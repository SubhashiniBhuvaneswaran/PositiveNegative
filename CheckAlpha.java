package Logical;

import java.util.Scanner;

public class CheckAlpha {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char c=s.next().toUpperCase().charAt(0);
	int t=(int)c;
	if((t>=65)&&(t<=90)){
		System.out.println("Alphabet"+c);
	}
	else{
		System.out.println("Not Alphabet"+c);
	}
}
}
