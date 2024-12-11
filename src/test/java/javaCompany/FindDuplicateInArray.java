package javaCompany;

public class FindDuplicateInArray {

	public static void main(String[] args) 
	{
		String s[]= {"sonali","vivan","myra","mahesh","sonali"};
		boolean flag= false;
		for(int i=0;i<s.length;i++) 
		{
			for(int j=i+1;i<s.length;i++) 
			{
				if(s[i]==s[j]) 
				{
					System.out.println("Duplicate found:"+ s[i]);
					flag= true;
				}
			}
		}
	    if(flag==false) 
	    {
					
	    	System.out.println("Duplicate not found");
				
	    }
			
		

	}

}
