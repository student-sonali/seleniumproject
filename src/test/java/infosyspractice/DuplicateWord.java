package infosyspractice;

public class DuplicateWord {

	public static void main(String[] args) 
	{
		String s= "sonali vivan welcome sonali vivan ";
		
		
		String word[]= s.split(" ");
		String dup="";
		 int count=0;
		 for(int i=0;i<=word.length-1;i++) 
		 {
			 for(int j=i+1;j<=word.length-1;j++) 
			 {
				 if(word[i].equals(word[j]))
				 {
					// System.out.println("duplicate found:"+word[i]);
					dup+= word[i]+" ";
					 count++;
				 }
			 }
		 }
		 System.out.println(count);
	System.out.println(dup);
	}

}
