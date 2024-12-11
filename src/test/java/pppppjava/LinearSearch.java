package pppppjava;

public class LinearSearch {

	public static void main(String[] args)
	{
		int a[]= {3,6,5,2,3,5};
		int linear_ser=2;
		boolean flag=false;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==linear_ser) 
			{
				System.out.println("found linear search:"+a[i]);
				flag=true;
			}
			
		}
		if(flag==false) 
		{
			System.out.println("not found");
		}

	}

}
