package javapractice;

public class DuplicateElementInarray {

	public static void main(String[] args) 
	{
		int a[]= {2,3,5,7,7};
		boolean flag=true;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Found duplicate element:" + a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) 
		{
			System.out.println("not fount duplicate");
		}
	

	}

}
