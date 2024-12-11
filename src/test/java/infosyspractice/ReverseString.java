package infosyspractice;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s= "vivan";
		String rev="";
		
		/*for(int i=s.length()-1;i>=0;i--) 
		{
		      rev=rev+s.charAt(i);
		}*/
		
	/*	char a[] = s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		System.out.println(rev);*/
		
		StringBuffer ab= new StringBuffer(s);
	System.out.println(ab.reverse());
	

	}

}
