package javapractice;

public class ExtractevenOddnoarray {

	public static void main(String[] args)
	{
		int a[]= {3,6,8,5,4,9};
		System.out.println("even no of array");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("odd no of array");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}

	}

}
