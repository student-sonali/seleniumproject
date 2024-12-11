package infosyspractice;

public class MaxandMinNo {

	public static void main(String[] args) {
		int a[]= {34,56,78,34,79};
		int max=a[0];
		
		for(int i=1; i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("max no is"+ max);
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
				
			}
		}
		System.out.println("min no is"+min);

	}

}
