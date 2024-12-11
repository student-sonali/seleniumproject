package prcticeinfosysjavaprograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args)
	{
		int a[]= {3,4,6,7,8,0};
		System.out.println("array before sorting:"+ Arrays.toString(a));
		
		int n=a.length;
		int temp=0;
		for(int i=0;i<n-1;i++) 
		{
			
			for(int j=0; j<n-1;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					temp= a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting Array"+ Arrays.toString(a));
		

	}

}
