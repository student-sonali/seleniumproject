package infosyspractice;

public class ArmstrongNo {

	public static void main(String[] args)
	{
		int num=371;
	    int org_no=num;
		int sum=0;
		
		while(num!=0) 
		{
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(sum==org_no) 
		{
			System.out.println("no is armstrong");
		}
		else 
		{
			System.out.println("no is not palindrome");
		}



	}

}
