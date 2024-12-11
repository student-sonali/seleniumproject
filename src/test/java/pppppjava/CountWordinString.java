package pppppjava;

public class CountWordinString {

	public static void main(String[] args)
	{
		String s=" sonali mahesh jadhav";
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++) 
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') 
			{
				count++;
			}
		}
     System.out.println(count);
	}

}
