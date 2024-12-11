package pppppjava;

public class FindVowelsAndConstants {

	public static void main(String[] args)
	{
		String ss= "sonali jadhav";
	    char a[]=ss.toCharArray();
	    int vcount=0;
	    int ccount=0;
	    
	    for(int i=0;i<a.length-1;i++) 
	    {
	    	if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'||a[i]=='o'||a[i]=='u') 
	    	{
	    		System.out.println("Vowels:"+ a[i]);
	    		vcount++;
	    	}
	    	else 
	    	{
	    		System.out.println("constants:"+ a[i]);
	    		ccount++;
	    	}
	    }
	    System.out.println(vcount+" "+ccount);
	    

	}

}
