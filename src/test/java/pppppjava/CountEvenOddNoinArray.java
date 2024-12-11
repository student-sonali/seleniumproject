package pppppjava;

public class CountEvenOddNoinArray {

	public static void main(String[] args) 
	{
		int a[]= {3,4,5,2,7,8};
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<a.length;i++) 
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
		System.out.println(even_count+" "+odd_count);

	}

}
