package pp;

import java.util.Scanner;

public class PalimdromeString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
	String ss=	sc.next();
	String rev="";
	String org_str=ss;
	
	for(int i=ss.length()-1;i>=0;i--) 
	{
		rev=rev+ss.charAt(i);
	}
	if(rev.equals(org_str)) 
	{
		System.out.println("string is palindrome");
	}
	else 
	{
		System.out.println("String is not palindrome");
	}
	
		
		

	}

}
