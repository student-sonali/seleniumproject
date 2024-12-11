package prcticeinfosysjavaprograms;

public class CountWordsInString {

	public static void main(String[] args) {
		String ss= "welcome to java";
		int count=1;
		
		for(int i=0;i<ss.length()-1;i++) 
		{
			if(ss.charAt(i)==' '&& ss.charAt(i+1)!=' ') 
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
