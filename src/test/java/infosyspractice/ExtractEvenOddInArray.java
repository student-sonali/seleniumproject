package infosyspractice;

public class ExtractEvenOddInArray {

	public static void main(String[] args) 
	{
		int a[]= {5,7,8,9,4,2};
		 
		System.out.println("Even no in array");
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
