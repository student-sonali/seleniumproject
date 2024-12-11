package numberPrograms;

public class CountNo {

	public static void main(String[] args) 
	{
		int num=34213;
		int count=0;
		
		while(num!=0) 
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
	}

}
