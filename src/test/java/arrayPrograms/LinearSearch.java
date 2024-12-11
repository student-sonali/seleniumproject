package arrayPrograms;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {3,5,6,89};
		int lenaer_num=7;
		boolean flag=false; 
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==lenaer_num) 
			{
				System.out.println("Found Lenear no:" + a[i]);
				flag=true;
			}
		}
		if(flag==false) 
		{
			System.out.println("Not Found lenear no");
		}

	}

}
