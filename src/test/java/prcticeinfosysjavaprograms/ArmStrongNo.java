package prcticeinfosysjavaprograms;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
	//armstrong is a no that is equal to the sum of cube of its digits
		//371= 2=3*3*3=27
		       //7=7*7*7=343
		//1*1*1=1   //8+343+1
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no");
	int num=	sc.nextInt();
	int org_num=num;
	int sum=0;
	
	while(num!=0) 
	{
		sum=sum+(num%10)*(num%10)*(num%10);
		num=num/10;
	}
	
	if(sum==org_num) 
	{
		System.out.println("No is armstrong");
	}
	else 
	{
		System.out.println("No is not ArmStrong");
	}
		

	}

}
