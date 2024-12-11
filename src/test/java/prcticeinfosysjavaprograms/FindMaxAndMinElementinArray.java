package prcticeinfosysjavaprograms;

public class FindMaxAndMinElementinArray {

	public static void main(String[] args) 
	{
		int a[]= {4,5,7,8,6};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("Maximum no is"+ max);
		
          int min=a[0];
          
          for(int i=1;i<a.length;i++) 
          {
        	  if(a[i]<min) 
        	  {
        		  min=a[i];
        		  
        	  }
        	 
          }
          System.out.println("Minimum no is"+ min);
	}

}
