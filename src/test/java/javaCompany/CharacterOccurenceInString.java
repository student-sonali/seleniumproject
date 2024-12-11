package javaCompany;

public class CharacterOccurenceInString {

	public static void main(String[] args) 
	{
		String s="sonaliii";
		int Afterremove=s.replaceAll("i", "").length();
		int Beforeremove=s.length();
		int total=Beforeremove-Afterremove;
		System.out.println(total);

	}

}
