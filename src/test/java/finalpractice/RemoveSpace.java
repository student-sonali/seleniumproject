package finalpractice;

public class RemoveSpace {

	public static void main(String[] args)
	{
		String s= "sonali    mahesh jadhav";
	s=	s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
