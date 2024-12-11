package pp;

public class ArmStrong {

	public static void main(String[] args) 
	{
		int num=372;
		int org_num=num;
		int sum=0;
		
		while(num!=0) 
		{
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(sum==org_num) 
		{
			System.out.println("no is armstrong");
		}
		else 
		{
			System.out.println("no is not armstrong");
		}
	

	}

}
