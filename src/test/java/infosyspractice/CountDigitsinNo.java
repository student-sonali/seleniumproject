package infosyspractice;

public class CountDigitsinNo {

	public static void main(String[] args) 
	{
		int num=2134;
		int count=0;
		
		while(num!=0) 
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		

	}

}
