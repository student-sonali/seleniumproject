package javapractice;

public class ReverseNo {

	public static void main(String[] args) 
	{
		int a= 2345;
		
		int rev=0;
		while(a!=0) 
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		
		System.out.println("Reverse no:" + rev);
		

	}

}
