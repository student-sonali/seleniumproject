package javaCompany;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args)
	{
		int a[]= {4,6,8,2,4,6,9,1};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]>a[j]) 
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
        System.out.println(Arrays.toString(a));
	}

}
