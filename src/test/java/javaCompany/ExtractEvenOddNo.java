package javaCompany;

public class ExtractEvenOddNo {

	public static void main(String[] args) 
	{
		int num= 233456678;
		int rem=0;
		
		while(num!=0) 
		{
			System.out.println("Even No:");
			rem= num%10;
			if(rem%2==0) 
			{
				System.out.println(rem);
			}
			num=num/10;
			
			System.out.println("odd no:");
			rem=num%10;
			if(rem%2!=0) 
			{
				System.out.println(rem);
			}
			num=num/10;
		}
		

	}

}
