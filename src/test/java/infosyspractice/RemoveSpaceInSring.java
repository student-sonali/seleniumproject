package infosyspractice;

public class RemoveSpaceInSring {

	public static void main(String[] args)
	{
		String s= "sonali   vivan  mahesh";
	s=	s.replaceAll("\\s", "");
	System.out.println(s);

	}

}
