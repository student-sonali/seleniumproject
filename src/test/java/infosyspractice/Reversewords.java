package infosyspractice;

public class Reversewords {

	public static void main(String[] args) 
	{
		String s="welcome to java";
	     int count=1;
	     
	     for(int i=0;i<s.length()-1;i++)
	     {
	    	 if(s.charAt(i)==' '&& s.charAt(i+1)!=' ') 
	    	 {
	    		 count++;
	    	 }
	     }
	     System.out.println(count);
		
	}

}
