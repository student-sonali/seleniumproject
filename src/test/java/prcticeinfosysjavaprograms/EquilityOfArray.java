 package prcticeinfosysjavaprograms;

import java.util.Arrays;

public class EquilityOfArray {

	public static void main(String[] args)
	{
		int a[]= {2,5,7,9,6};
		int b[]= {2,5,7,9,6};
		
	/*boolean status=	Arrays.equals(a, b);
	
	if(status==true) 
	{
		System.out.println("arrays are  equls");
	}
	else 
	{
		System.out.println("arrays are not equls");
	}*/
		boolean status=true;
		if(a.length==b.length) 
		{
			for(int i=0;i<a.length;i++) 
			{
				if(a[i]!=b[i]) 
				{
					status=false;
				}
			}
			
		}
		else 
		{
			status=false;
		}
		if(status==true) 
		{
			System.out.println("Array are equals");
		}else 
		{
			System.out.println("Arrays are not equals");
		}

	}

}
