package javapractice;

public class MissingNoArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,4,5,6};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in array:" + sum1);
		
		for(int i=1; i<=5;i++) 
		{
			sum2=sum2+i;
		}
		System.out.println("sum of element in array:" + sum2);
		
		System.out.println("missing of array" + (sum2-sum1));
	

	}

}
