package pppppjava;

public class Extractoddandeveninno {

	public static void main(String[] args) 
	{
		int num =34782936;
		
		while(num!=0) 
		{
			System.out.println("even no:");
			int rem=num%10;
			if(rem%2==0) 
			{
				System.out.println(rem);
			}
			num=num/10;
			
		}

	}

}
