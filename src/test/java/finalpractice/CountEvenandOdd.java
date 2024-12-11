package finalpractice;

public class CountEvenandOdd {

	public static void main(String[] args) 
	{
		int a[]= {4,6,8,9,2,3,5};
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]%2==0) 
			{
				even_count++;
			}
			else 
			{
				odd_count++;
			}
		}
		System.out.println("even"+even_count);
		System.out.println("odd"+odd_count);
	

	}

}
