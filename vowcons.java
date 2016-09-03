package Logical;

import java.util.Scanner;

public class vowcons {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 char c=s.next().charAt(0);
	 String s1;
	 s1=(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')? "vowels":"consonents";
	 System.out.println(s1);
}
}
