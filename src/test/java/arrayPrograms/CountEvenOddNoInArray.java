package arrayPrograms;

public class CountEvenOddNoInArray {

	public static void main(String[] args)
	{
		int a[]= {2,4,5,6,7,8,3};
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
		System.out.println("Even no:" +even_count);
		System.out.println("Odd no " +odd_count);

	}

}
