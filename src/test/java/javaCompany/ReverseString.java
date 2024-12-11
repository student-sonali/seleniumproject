package javaCompany;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args)
	{
		String s="mahesh";
		String rev="";
	    char a[]=s.toCharArray();
	    
	    
	    for(int i=a.length-1;i>=0;i--) 
	    {
	    	rev=rev+a[i];
	    }
	        System.out.println(rev);
	    
	

	}

}
