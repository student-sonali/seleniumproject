package prcticeinfosysjavaprograms;

public class PrimeNoOrNot {

	public static void main(String[] args)
	{
		//no>1
		//which has only 2 factors 1 and itself
		
		int num=6;
		int count=0;
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0) 
				count++;
			}
				if(count==2) 
				{
					System.out.println("no is prime");
				}
				else 
				{
					System.out.println("not prime");
				}
				
			}
		
		else 
		{
			System.out.println("Noy Prime no");
		}
		
		
	

	}

}
