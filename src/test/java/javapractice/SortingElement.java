package javapractice;

import java.util.Arrays;

public class SortingElement {

	public static void main(String[] args) 
	{
		int a[]= {4,6,4,8,0,};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length;j++) 
			{
				if(a[j]>a[j+1]) 
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array sorting"+ Arrays.toString(a));
		

	}

}
