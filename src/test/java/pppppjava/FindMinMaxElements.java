package pppppjava;

public class FindMinMaxElements {

	public static void main(String[] args)
	{
		int a[]= {45,43,67,89,0};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
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
