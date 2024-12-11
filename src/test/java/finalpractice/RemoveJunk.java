package finalpractice;

public class RemoveJunk {

	public static void main(String[] args)
	{
		String s="#$%^^&&&*sonali98765#$%^&";
	s=	s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);

	}

}
