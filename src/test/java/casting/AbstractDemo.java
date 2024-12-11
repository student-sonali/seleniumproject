package casting;

abstract class Animal
{
	abstract void walk();
	public void eat() 
	{
		System.out.println("Animal eats");
	}
	}
public class AbstractDemo extends Animal
{
	public void walk() 
	{
		System.out.println("Animal can walk on 4 legs");
	}

	public static void main(String[] args)
	{
		AbstractDemo d=new AbstractDemo();
		d.walk();
		d.eat();
		

	}

}
