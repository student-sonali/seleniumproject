package finalpractice;

public class CountOccurance {

	public static void main(String[] args) 
	{
		String s="dhfigajshshs";
	int total=	s.length();
    int afterremove=s.replaceAll("s", "").length();
   int count= total-afterremove;
   System.out.println(count);


	}

}
