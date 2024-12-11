package javapractice;

public class NoprimeorNot {

	public static void main(String[] args)
	{
		int num=2;
		int count=0;
		if(num>1) 
		{
			for(int i=1;i<=3;i++) 
			{
				if(num%i==0);
				count++;
			}
			if(count==2) 
			{
				System.out.println("no is prime");
			}
			else 
			{
				System.out.println("no is not prime");
			}
		}
	

	}

}
