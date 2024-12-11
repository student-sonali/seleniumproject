package javaCompany;

public class FindEvenAndOddNo {

	public static void main(String[] args) 
	{
		int a[]= {2,4,5,7,9,8,1};
		
		System.out.println("Even Numbers:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("odd numbers:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}

	}

}
