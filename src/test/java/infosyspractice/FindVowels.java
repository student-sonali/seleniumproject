package infosyspractice;

public class FindVowels {

	public static void main(String[] args)
	{
		String s="sonalipawarvivan dfioudfg";
		char a[]=s.toCharArray();
		int con_count=0;
		int vow_count=0;
		for(int i=0;i<=a.length-1;i++) 
		{
			if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') 
			{
				System.out.println("Vowels:"+a[i]);
				vow_count++;
			}else 
			{
				System.out.println("constants:"+ a[i]);
				con_count++;
			}
			
		}
		System.out.println("consatnt_ount:"+con_count);
		System.out.println("vowels_count:"+vow_count);

	}

}
