package stringprograms;

public class ReverseWord {

	public static void main(String[] args)
	{
		String s= "sonali jadahv";
	    String w[]=s.split(" ");
	    String rev="";
	    
	    for(int i=w.length-1;i>=0;i--) 
	    {
	    	rev=rev+w[i]+" ";
	    }
		System.out.println(rev);

	}

}
