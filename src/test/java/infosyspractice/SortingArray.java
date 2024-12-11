package infosyspractice;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args)
	{
		int a[]= {0,4,6,8,3,5};
		
		System.out.println("Before sorting Array"+ Arrays.toString(a));
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("After sorting Array"+ Arrays.toString(a));
		

	}

}
