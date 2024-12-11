package stringprograms;

public class Vowels {

	public static void main(String[] args) 
	{
		String s="sonali";
	    char a[]=s.toCharArray();
		int vowels_count=0;
		int constants_count=0;
		for(int i=0;i<s.length();i++) 
		{
			if(a[i]=='a'|| a[i]=='e'|| a[i]=='i'|| a[i]=='o'||a[i]=='u') 
			{
				System.out.println("vowels are:" +a[i]);
				vowels_count++;
			}
			else 
			{
				System.out.println("constants are:" +a[i]);
				constants_count++;
			}
		}
		System.out.println(vowels_count);
		System.out.println(constants_count);
		

	}

}
