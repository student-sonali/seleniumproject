package numberPrograms;

public class ExtractEvenOdd {

	public static void main(String[] args) 
	{
		int num=2345786;
		int rem=0;
		System.out.println("Even no");
		while(num!=0) 
		{
			rem=num%10;
			if(rem%2==0) 
			{
				System.out.println(rem);
			}
		    num=num/10;
		}
	
		System.out.println("Odd no");
        while(num!=0) 
        {
        	rem=num%10;
        	if(rem%2!=0) 
        	{
        		System.out.println(rem);
        	}
        	num=num/10;
        }
	}

}
