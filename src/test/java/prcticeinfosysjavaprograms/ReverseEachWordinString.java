package prcticeinfosysjavaprograms;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		String ss="welcome to java";
	  String [] words=ss.split(" ");
	    String rev="";
		for(int i=ss.length()-1;i>=0;i--) 
		{
		rev =rev+ss.charAt(i);
		}
		System.out.println(rev);
		
    /*  String[] words=ss.split(" ");
      String rev="";
      
      for(String w:words) 
      {
    	  String reverse="";
    	  
    	  for(int i=w.length()-1;i>=0;i--) 
    	  {
    		  reverse=reverse+w.charAt(i);
    	  }
    	  rev=rev+reverse+" ";
      }
      System.out.println(rev);*/

	}

}
