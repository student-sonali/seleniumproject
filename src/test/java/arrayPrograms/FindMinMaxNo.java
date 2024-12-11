package arrayPrograms;

public class FindMinMaxNo {

	public static void main(String[] args) 
	{
		int a[]= {4,6,89,5,6,34,56};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
	
		}
		System.out.println("Maximum No:" +max);

		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println("Minimum No:" +min);
	}

}
