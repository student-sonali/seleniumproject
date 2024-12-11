package infosyspractice;

public class SearchElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {56,78,90,34,23};
		
		int serach= 90;
		boolean flag= false;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==serach) 
			{
				System.out.println("Element Found: " + i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}

	}

}
