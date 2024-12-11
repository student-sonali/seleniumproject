package prcticeinfosysjavaprograms;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int a=234456;
		int sum=0;
		
		while(a!=0) 
		{
			sum=sum+a%10;
			a=a/10;
		}
		
		System.out.println(sum);
	

	}

}
