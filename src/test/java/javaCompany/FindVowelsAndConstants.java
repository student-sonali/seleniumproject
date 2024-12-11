package javaCompany;

public class FindVowelsAndConstants {

	public static void main(String[] args) 
	{
		String s= "sonali jadhav";
	    char a[]=s.toCharArray();
	    
	    for(int i=0;i<s.length();i++) 
	    {
	    	if(a[i]=='a'|| a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') 
	    	{
	    		System.out.println("Vowels are:"+ a[i]);
	    	}
	    	else 
	    	{
	    		System.out.println("Constants are:"+ a[i]);
	    	}
	    }
	    
		

	}

}
