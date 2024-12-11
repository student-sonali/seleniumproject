package pppppjava;

public class FindEvenOddNoInArray {

	public static void main(String[] args) 
	{
		int a[]= {3,5,6,7,4,3,1};
		
		System.out.println("Even No");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("odd no");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}

	}

}
