package finalpractice;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args)
	{
		int a[]= {3,5,7,8,3,6,7,8};
		
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=i+1;j<=a.length-1;j++) 
			{
				if(a[i]>a[j]) 
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		

	}

}
