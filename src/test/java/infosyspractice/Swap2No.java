package infosyspractice;

public class Swap2No {

	public static void main(String[] args) 
	{
		int a=20; int b=30;
		//int temp;
		
	/*	temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);	
		

	}

}
