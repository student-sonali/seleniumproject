package javaCompany;

public class SumOfElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {2,4,3,2,1};
		int sum= 0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
        System.out.println(sum);
	}

}
