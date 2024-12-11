package exception;

import java.util.Scanner;

public class UnCheckedException {

	public static void main(String[] args) 
	{
		
		System.out.println("Program is started");
		
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter the number ");
		int num=sc.nextInt();
		
		System.out.println(100/num);//Arithmatic Exception
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");*/
		
		//Example2
		
		/*int a[] =new int[5];
		System.out.println("enter the position of (0-4):");
		int pos= sc.nextInt();
		System.out.println("Enter the value");
		int value= sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);*/
		
		//example3
		String s="112345";
	int num=	Integer.parseInt(s);
	System.out.println(num);
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
