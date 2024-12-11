package multithreading;

public class TestMultithreading implements Runnable
{
	public void run() {
		System. out.println("Content in the run method");
		}

		public static void main(String [] args) {
			TestMultithreading d = new TestMultithreading();
		Thread t = new Thread(d);
		t.start();
		System. out.println("Thread has started now");
		}

}
