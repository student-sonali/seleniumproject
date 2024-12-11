package stringprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
		String s= "sonali  mahesh   vivan";
	    s=s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
