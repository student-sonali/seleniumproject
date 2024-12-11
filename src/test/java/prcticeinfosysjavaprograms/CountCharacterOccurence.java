package prcticeinfosysjavaprograms;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String s= "java programing";
		
	int totalcount=	s.length();
	int totalcount_after=	s.replaceAll("a", "").length();
		
	int	count = totalcount-totalcount_after;
	System.out.println("no of occurences:"+count );

	}

}
