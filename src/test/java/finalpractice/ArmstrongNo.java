package finalpractice;

public class ArmstrongNo {

	public static void main(String[] args)
	{
		int num=371;
		int sum=0;
		int org_num=num;
		
		while(num!=0) 
		{
			sum=sum+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(org_num==sum) 
		{
			System.out.println("no is armstrong");
		}
		else 
		{
			System.out.println("no is not armstrong");
		}
		

	}

}
