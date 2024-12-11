package javaCompany;

public class FindMaxAndMinNo {

	public static void main(String[] args)
	{
		int a[]= {4,6,89,56,2,0};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		

	}

}
