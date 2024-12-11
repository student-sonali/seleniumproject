package pp;

public class CountwordinString {

	public static void main(String[] args) 
	{
		String s=" vivan mahesh sonali";
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
