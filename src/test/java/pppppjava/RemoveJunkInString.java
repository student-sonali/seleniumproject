package pppppjava;

public class RemoveJunkInString {

	public static void main(String[] args)
	{
		String s="#$^&*((|{JGsonali~~#^&**234";
		String ss=s.replaceAll("[^A-Z0-9a-z]", "");
        System.out.println(ss);
	}

}
