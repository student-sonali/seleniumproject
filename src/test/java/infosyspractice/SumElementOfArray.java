package infosyspractice;

public class SumElementOfArray {

	public static void main(String[] args) 
	{
		int a[]= {2,5,7,8,5};
		int sum=0;
		
		
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		

	}

}
