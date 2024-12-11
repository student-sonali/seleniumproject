package stringprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
	    String s=sc.next();
	    String rev="";
	    String org_str=s;
	    for(int i=s.length()-1;i>=0;i--) 
	    {
	    	rev=rev+s.charAt(i);
	    }
	    if(org_str.equals(rev)) 
	    {
	    	System.out.println("String id palindrome");
	    	
	    }
	    else 
	    {
	    	System.out.println("String is not palindrome");
	    }
		

	}

}
