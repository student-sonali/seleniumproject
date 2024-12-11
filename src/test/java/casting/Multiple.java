package casting;

interface I1
{
	int x=100;
	void m1(); //absract method
	}

interface I2
{
	int y=200;
	void m2();
	
	}

public class Multiple implements I1,I2
{
	 public void m1() 
	{ System.out.println(x);
		
	}
	 public void m2() 
	 {
		 System.out.println(y);
	 }

	public static void main(String[] args)
	{
		Multiple m=new Multiple();
		m.m1();
		m.m2();
		System.out.println(I1.x+I2.y);
		

	}

}
