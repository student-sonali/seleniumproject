package prcticeinfosysjavaprograms;

public class ReverseString {

	public static void main(String[] args)
	{
		String s= "sonali";
		String rev= " ";
		
	/*	for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);*/
		//using char array
		/*char a[]=s.toCharArray();
	int len=	s.length();
	for(int i=len-1;i>=0;i--) 
	{
		rev=rev+a[i];
	}
		System.out.println(rev);*/
		
		//using string buffer class
		StringBuffer sb= new StringBuffer(s);
	System.out.println(sb.reverse());	
		

	}

}
