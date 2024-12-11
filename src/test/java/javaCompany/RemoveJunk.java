package javaCompany;

public class RemoveJunk {

	public static void main(String[] args)
	{
		String s="Sona$%&*()(^#@!$^&*mahesh";
	    s=s.replaceAll("[^A-Za-z0-9]", "");
	    System.out.println(s);

	}

}
