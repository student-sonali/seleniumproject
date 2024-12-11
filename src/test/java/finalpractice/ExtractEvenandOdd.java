package finalpractice;

public class ExtractEvenandOdd {

	public static void main(String[] args) 
	{
		int a[]= {5,7,8,9,2,4};
		System.out.println("even no");
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("odd no");
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
