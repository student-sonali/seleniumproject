package infosyspractice;

public class duplicatecharinstring {

	public static void main(String[] args)
	{
		String s= "sdfghhuut ghfjfush";
		int count=0;
		
		char a[]=s.toCharArray();
		for(int i=0;i<=a.length-1;i++) 
		{
			for(int j=i+1;j<=a.length-1;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("duplicate charactor:"+ a[i]);
					count++;
				}
			}
		}
		System.out.println("count of duplicate char:" + count);
		

	}

}
