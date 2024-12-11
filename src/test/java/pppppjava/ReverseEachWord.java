package pppppjava;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String s="sonali jadhav";
		String ss[]=s.split(" ");
		String rev="";
		for(String w:ss) 
		{
			String Reverse="";
			for(int i=w.length()-1;i>=0;i--) 
			{
				Reverse=Reverse+w.charAt(i);
			}
			rev=rev+Reverse+" ";
		}
        System.out.println(rev);
	}

}
