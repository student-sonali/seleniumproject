package javaCompany;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int a[]= {3,5,4,6,7,3,8,};
		int search=9;
		boolean flag=false;
		for(int i=0;i<a.length;i++) 
		{
			if(search==a[i]) 
			{
				System.out.println("found linearsearch:" + a[i]);
				flag=true;
			}
		}
		if(flag==false) 
		{
			System.out.println("not found");
		}

	}

}
