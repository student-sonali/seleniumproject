package prcticeinfosysjavaprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s= "java  programing    automation";
	s=	s.replaceAll("\\s", "");
System.out.println(s);
	}

}
