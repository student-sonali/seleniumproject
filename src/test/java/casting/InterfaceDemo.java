package casting;

interface Shape
{
	int length = 10;//by default this variables are static and final
	int width=20;
	
   public void squre();
   
   
	}


public class InterfaceDemo implements Shape
{
	 public void squre() 
	{
		System.out.println("This is abstarct method");
	}
	
	public static void main(String[] args)
	{ 
		InterfaceDemo a= new InterfaceDemo();
		a.squre();
	System.out.println((Shape.width*Shape.length));		

	}

}
