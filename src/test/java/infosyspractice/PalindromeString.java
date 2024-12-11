package infosyspractice;

public class PalindromeString {

	public static void main(String[] args) 
	{
		String ss="vivan";
		String rev="";
		String org_str=ss;
		for(int i=ss.length()-1;i>=0;i--) 
		{
		    rev=rev+ss.charAt(i);
		}
		if(org_str.equals(rev)) 
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	

	}

}
