package controller;

import java.util.Scanner;

public class IPv4 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter tha Adders:");
String str=sc.next();
String s1[]=str.split("\\."); //:

	if (s1.length!=4) { //=8
		for(String s:s1) {
			if(s.length()>3) { //>4
				
			}
			int no=Integer.parseInt(str);
			if (no<0||no>255||s.charAt(0)=='0') { //!(>'a' <'f'||>'a'<='f')
//				return "invalid ipv4";
				System.out.println("invalid ");
			}
		}
	
		}
	else {
		System.out.println("valid ip adders");
	}
	
}
}
