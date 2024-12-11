package pppppjava;

public class CountOccurenceInString {

	public static void main(String[] args) 
	{
		String s="sonaliiii";
		
	 int Beforeremove=s.length();
	 int afterRemove=s.replaceAll("i", "").length();
	 
	int  Total=Beforeremove-afterRemove;
	System.out.println(Total);
	 

	}

}
