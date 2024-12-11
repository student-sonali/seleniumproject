package prcticeinfosysjavaprograms;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
	    int num=sc.nextInt();
	    
	 //  int rev=0;
	    
	  /*  while(num!=0) 
	    {
	    	rev= rev*10+num%10;   //0*10+1234%10= 4
	    	num=num/10;
	    }*/
	    
	    StringBuffer sb= new StringBuffer(String.valueOf(num));
	    StringBuffer rev   = sb.reverse();
	    
	    System.out.println(rev);

	}

}
