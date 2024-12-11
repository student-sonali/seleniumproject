package javapractice;

public class EquilityoArray {

	public static void main(String[] args)
	{
		int a1[]= {1,5,7,9,4};
		int a2[]= {1,5,7,9,4};
		boolean status=true;
		
		if(a1.length==a2.length) 
		{
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=a2[i]) {
					status=false;
				}
			}
		}
		else 
		{
			status=false;
		}
		if (status==true) 
		{
			System.out.println("arrays are equal");
		}
		else 
		{
			System.out.println("Arrays are not equal");
		}

	}

}
