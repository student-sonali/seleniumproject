package infosyspractice;

public class RemoveJunk {

	public static void main(String[] args) {
     String s="@#$%&*(vivan//.,@#$%^";
   s=  s.replaceAll("[^a-zA-Z0-9]", "");
     System.out.println(s);


	}

}
