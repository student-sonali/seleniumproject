package arrayPrograms;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,7,9,1,0,-0};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
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
