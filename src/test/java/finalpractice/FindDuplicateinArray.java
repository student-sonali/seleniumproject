package finalpractice;

import java.util.HashSet;

public class FindDuplicateinArray {

	public static void main(String[] args)
	{
		String s[]= {"sonali","myra","vivan","sonali"};
		/*boolean flag=false;
		for(int i=0; i<=s.length-1;i++) 
		{
			for(int j=i+1;j<=s.length-1;j++) 
			{
				if(s[i]==s[j]) 
				{
					System.out.println("duplicate found"+ s[i]);
					flag=true;
				}
			}
		}
		if(flag==false) 
		{
			System.out.println("duplicate not found");
		}*/
		
   HashSet<String> hs= new HashSet<String>();
   for(String w:s) 
   {
	   if(hs.add(w)==false) 
	   {
		   System.out.println("duplicate fount"+ w);
	   }
   }
	}

}
