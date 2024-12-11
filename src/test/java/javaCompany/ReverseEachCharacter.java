package javaCompany;

public class ReverseEachCharacter {

	public static void main(String[] args) 
	{
		String s="sonali mahesh";
		String w[]=s.split(" ");
		String rev="";
		
		for(String word:w) 
		{
			String reverse=" ";
			for(int i=word.length()-1;i>=0;i--) 
			{
				reverse=reverse+word.charAt(i);
			}
			rev=rev+reverse+" ";
		}
		System.out.println(rev);

	}

}
