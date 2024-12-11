package javapractice;

public class MaxMinNoArray {

	public static void main(String[] args) 
	{
		int a[]= {5,7,8,54,43,33};
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
	System.out.println("max no of array" + max);
	
	for(int i=0;i<a.length;i++) 
	{
		if(a[i]<min) 
		{
			min=a[i];
		}
	}
	System.out.println("min no of array" + min);
	

	}

}
