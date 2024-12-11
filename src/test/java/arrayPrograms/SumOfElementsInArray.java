package arrayPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) 
	{
		int a[]= {5,6,7,3,2,4};
		int sum=0;
		
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		

	}

}
