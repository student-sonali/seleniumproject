package finalpractice;

public class MinandMaxNo {

	public static void main(String[] args) 
	{
		int a[] = {3,5,7,8,2};
		
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		int min=a[0];
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println(min);
	

	}

}
