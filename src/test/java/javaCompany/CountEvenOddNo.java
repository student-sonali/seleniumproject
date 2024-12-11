package javaCompany;

public class CountEvenOddNo {

	public static void main(String[] args) 
	{
		
		int a[]= {3,5,4,2,7,8,9,5};
		int odd_count=0;
		int even_count=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				even_count++;
			}
			else 
			{
				odd_count++;
				
			}
		}
		System.out.println(odd_count);
		System.out.println(even_count);

	}

}
