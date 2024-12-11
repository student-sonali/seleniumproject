package finalpractice;

public class ReverseOnlyWords {

	public static void main(String[] args) 
	{
		String s="sonali mahesh";
	String[] word=s.split(" ");
		String rev=" ";
		
		for(int i=word.length-1;i>=0;i--) 
		{
			rev+=word[i]+" ";
		}
		System.out.println(rev);

	}

}
