package javapractice;

public class countOddEvenNo {

	public static void main(String[] args) 
	{
		int num= 57957950;
		int oddcount=0;
		int evencount=0;
		while(num!=0) 
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			}else
			
				oddcount++;
				
			
			
		}
		num=num/10;
		
		System.out.println("no of even no:" + evencount);
		System.out.println("no of odd no:" + oddcount);
		
	}

}
 