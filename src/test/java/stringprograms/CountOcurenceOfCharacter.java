package stringprograms;

public class CountOcurenceOfCharacter {

	public static void main(String[] args)
	{
		String s="ssonalis";
		//int count =0;
		
	int afterremove=s.replaceAll("s", "").length();
		int beforeremove= s.length();
		
		int total=beforeremove-afterremove;
		
		System.out.println(total);

	}

}
