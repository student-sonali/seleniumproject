package prcticeinfosysjavaprograms;

public class ExtractEvenOddNOArray {

	public static void main(String[] args)
	{
		int a[]= {4,6,7,8,9,6,5};
		
		
		//extracting even no
		System.out.println("Even No in Array");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
				System.out.println(a[i]);
		}
		System.out.println("Odd no in array");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
				System.out.println(a[i]);
		}
		

	}

}
