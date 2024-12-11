package pppppjava;

public class ReverseWords {

	public static void main(String[] args) 
	{
	   String s="sonali jadhav";
	   String ss[]= s.split(" ");
	   String rev="";
	   for(int i=ss.length-1;i>=0;i--) 
	   {
		   rev=rev+ss[i]+" ";
	   }
	   System.out.println(rev);

	}

}
