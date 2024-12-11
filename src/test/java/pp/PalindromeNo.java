package pp;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
	    int num=sc.nextInt();
	    int org_no=num;
	   int rev=0;
	    
	    while(num!=0) 
	    {
	    	rev=rev*10+num%10;
	    	num=num/10;
	    }
	    if(rev==org_no) 
	    {
	    	System.out.println("no is palimdrome");
	    }
	    else 
	    {
	    	System.out.println("no is not palindrome");
	    }

	}

}
