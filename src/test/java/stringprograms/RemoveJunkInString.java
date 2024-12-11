package stringprograms;

public class RemoveJunkInString {

	public static void main(String[] args)
	{
		String s="1343@#$%^&*()_|\\/><!~sonaliASDF";
	    s=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);

	}

}
