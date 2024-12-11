package exception;

public class CheckedExcep {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Program Started.....");
		System.out.println("Progarm in Progress....");
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e) 
		{
			
		}
		System.out.println("Program Fnished.....");
		System.out.println("Program exited.....");

	}

}
