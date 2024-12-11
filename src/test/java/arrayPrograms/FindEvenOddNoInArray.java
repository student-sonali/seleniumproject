package arrayPrograms;

public class FindEvenOddNoInArray {

	public static void main(String[] args)
	{
		int a[]= {4,6,7,8,9,3,4};
		
		System.out.println("Even No:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		
		}
		System.out.println("Odd No:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
