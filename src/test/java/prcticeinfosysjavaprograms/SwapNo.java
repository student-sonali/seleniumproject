package prcticeinfosysjavaprograms;

public class SwapNo {

	public static void main(String[] args)
	 {
		int a=20;
		int b=40;
		int c;
	    
		//logic1
		/*System.out.println(a+ "" +b);
		c=a;
		a=b;
		b=c;*/
	
		
		//logic 2 without 3rd variable
		a=a+b;//60
		b=a-b;//20
		a=a-b;//40
		
		System.out.println(a+ "" +b);
		

	}

}
