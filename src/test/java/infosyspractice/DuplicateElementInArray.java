package infosyspractice;

import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args)
	{
		String s[]= {"mahesh","sonali","myra","vivan","mahesh"};
	/*	boolean flag=false;
		for(int i=0;i<s.length;i++) 
		{
			for(int j=i+1;j<s.length;j++) 
			{
				if(s[i]==s[j]) 
				{
					System.out.println("dublicate found"+s[i]);
					flag=true;
				}
			}
			if(flag==false) 
			{
				System.out.println("duplicate not found");
			}
		}*/
		
		HashSet set= new HashSet();
		
		for(String value:s) 
		{
			if(set.add(value)==false) 
			{
				System.out.println("duplicate value:"+ value);
			}
		}
		
		

	}

}
