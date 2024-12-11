package infosyspractice;

import java.util.Arrays;

public class RR {

	public static void main(String[] args)
	{
		String s="sonali and sagar";
		String rev="";
		String [] w= s.split(" ");
		
		
		for(int i=w.length-1;i>=0;i--) 
		{
			rev+=w[i]+" ";
		}
		System.out.println(rev);
		
		
		

	}

}
