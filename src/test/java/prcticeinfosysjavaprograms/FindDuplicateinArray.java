package prcticeinfosysjavaprograms;

import java.util.HashSet;

public class FindDuplicateinArray {

	public static void main(String[] args) 
	{
		String a[]= {"sonali","myra","vivan","mahesh","myra"};
		/*boolean flag=false;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Element found:" + a[i]);
					flag=true;
				}
			}
			}
		if(flag==false) 
		{
			System.out.println("Element not found");
		}*/
		
		//using HashSet
		HashSet<String> set= new HashSet();
		/*System.out.println(set.add("sonali"));
		System.out.println(set.add("myra"));
		System.out.println(set.add("vivan"));
	    System.out.println(set.add("sonali"));	*/
	    
	    for(String value:a) 
	    {
	    	if(set.add(value)==false) 
	    	{
	    		System.out.println("found duplicate:"+ value);
	    	}
	    }
		}
	}


