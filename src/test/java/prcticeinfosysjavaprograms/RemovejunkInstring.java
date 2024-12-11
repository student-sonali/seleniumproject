package prcticeinfosysjavaprograms;

public class RemovejunkInstring {

	public static void main(String[] args) {
		String s="@#$?*%^&(sonali06543467";
s=	s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
	}

}
