package exception;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args)
	{
System.out.println("Program is started");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		try {
		System.out.println(100/num);//Arithmatic Exception
		}
		catch(ArithmeticException e) 
		{
			System.out.println("Invalid data");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
	

	}

}
