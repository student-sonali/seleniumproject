package pppppjava;

public class FindDuplicate {

	public static void main(String[] args)
	{
		String a[]= {"vivan","sonali","mahesh","vivan"};
		boolean flag=false;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Find duplicate:"+ a[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false) 
		{
			System.out.println("not found");
		}
		

	}

}
