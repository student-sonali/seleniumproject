package multithreading;

public class SampleThread extends Thread
{
   public void run() 
   {
	   System.out.println("thread is under running....");
	   for(int i=0;i<=10;i++) 
	   {
		   System.out.println("i="+ i);
	   }
   }
	public static void main(String[] args) 
	{
		SampleThread t=new SampleThread();
		System.out.println("Thread about to start....");
		t.start();
		
	}

}
