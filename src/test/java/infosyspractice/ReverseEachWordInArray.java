package infosyspractice;

public class ReverseEachWordInArray {

	public static void main(String[] args) 
	{
		String s="welcome to java";
		
	    String[] words= s.split(" ");
	    String rev="";
	    
	    for(String w:words) 
	    {
	    	String reverseword="";
	        for(int i=w.length()-1;i>=0;i--) 
	    {
	        	reverseword=reverseword+w.charAt(i);
	        	
	    }
	        rev=rev+reverseword+" ";
	    }
		System.out.println(rev);
	

	}

}
