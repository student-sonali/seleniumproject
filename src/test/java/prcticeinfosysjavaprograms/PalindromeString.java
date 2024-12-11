package prcticeinfosysjavaprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.next();
		
		String org_str=str;
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) 
		{
			rev=rev+str.charAt(i);
		}
	  //System.out.println(rev);
		if(org_str.equals(rev)) 
		{
			System.out.println(org_str+ "palindrome");
		}
		else 
		{
			System.out.println(org_str+ "not palindrome");
		}

	}

}
