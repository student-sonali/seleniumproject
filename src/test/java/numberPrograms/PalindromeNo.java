package numberPrograms;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PalindromeNo {

	public static void main(String[] args)
	{
		int num=121;
		int rev=0;
		int org_num=num;
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num) 
		{
			System.out.println("no is palindrome");
		}
		else 
		{
			System.out.println("no is not palindrome");
		}
		

	}

}
