package pppppjava;

public class ReverseNo {

	public static void main(String[] args) 
	{
		int num=345567;
		int rev=0;
		
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

	}

}
