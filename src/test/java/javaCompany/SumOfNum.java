package javaCompany;

public class SumOfNum {

	public static void main(String[] args) 
	{
		int num=23456;
		int sum=0;
		
		while(num!=0) 
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
