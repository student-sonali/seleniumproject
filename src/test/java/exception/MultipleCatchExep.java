package exception;

public class MultipleCatchExep {

	public static void main(String[] args)
	{
		System.out.println("Program started....");
		String s= null;
		
		try {
		System.out.println(s.length());
		}
		/*catch(ArithmeticException e) 
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) 
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e) 
		{
			System.out.println("Handled exception");
			System.out.println(e.getMessage());
		}*/
		catch(Exception e) 
		{
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program finished......");
		

	}

}
