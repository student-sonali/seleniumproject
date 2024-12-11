package javapractice;

public class FindLargestNo {

	public static void main(String[] args) {
		int a=2344;
		int b=3353;
		int c=7986;
		
		if(a>b&&a>c) 
		{
			System.out.println(a + " is largest no" );
		}
		else if(b>a&&b>c) 
		{
			System.out.println(b + " is largest no");
		}
		else 
		{
			System.out.println(c + " is largest no");
		}

	}

}
