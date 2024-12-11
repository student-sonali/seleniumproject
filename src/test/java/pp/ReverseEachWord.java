package pp;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String s="sonali mahesh";
	String[] word	=s.split(" ");
     String rev="";
     
     for(String w:word) 
     {
    	String reverse="";
    	 for(int i=w.length()-1;i>=0;i--) 
    	 {
    		reverse= reverse+w.charAt(i);
    	 }
    	 rev=rev+reverse+" ";
     }
     System.out.println(rev);

	}

}
