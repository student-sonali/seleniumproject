package prcticeinfosysjavaprograms;

public class SearchElementinArray_LinearSearch {

	public static void main(String[] args) {
	int a[]= {2,3,4,5,6};
	int search= 5;
	boolean flag=false;
	for(int i=0;i<a.length;i++) 
	{
		if(a[i]==search) 
		{
			System.out.println("Element Found at" + i);
			flag=true;
			break;
		}
	}
	if(flag=false) {
	
	System.out.println("Element not found");
	}
	}

}
