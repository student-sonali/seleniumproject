package pppppjava;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String");
		String ss=sc.next();
		String rev="";
		String org_str=ss;
		
		for(int i=ss.length()-1;i>=0;i--) 
		{
			rev=rev+ss.charAt(i);
		}
		//System.out.println(rev);
		if(rev.equals(org_str)) 
		{
			System.out.println("Given str is palindrome");
		}
		else 
		{
			System.out.println("Given str is not palindrome");
		}

	}

}
