package prcticeinfosysjavaprograms;

public class PalindromeNo {

	public static void main(String[] args) 
	{
		int a=12145;
		int org_num=a;
		int rev=0;
		
		while(a!=0) 
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		if(org_num==rev) 
		{
			System.out.println(a+"palimdrome");
		}else 
		{
			System.out.println(a+"not palimdrome");
		}
		System.out.println(rev);
		

	}

}
