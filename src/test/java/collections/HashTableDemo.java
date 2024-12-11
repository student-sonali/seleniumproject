package collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
	Hashtable t= new Hashtable();
	t.put(101, "sonali");
	t.put(102, "vivan");
	t.put(103, "mahesh");
	t.put(104, "myra");
	t.put(105, "sonali");
	
	System.out.println(t);
	
	//return value based on key
	System.out.println(t.get(104));
	
	//remove pair of hashtable
	t.remove(105);
	System.out.println(t);
	
	System.out.println(t.containsKey(103));//key is present on hashtable or not
	
	System.out.println(t.containsValue("mahesh"));//value is present or not
	
	System.out.println(t.isEmpty()); //check hashtable empty or not
	
	System.out.println(t.size());//check size
	
	System.out.println(t.entrySet());//returns all the pair of hashtable
	
	System.out.println(t.keySet());//returns all the keys from hashtable
	
	System.out.println(t.values()); //returns values from hashtable
	
	
	//reading key 
	for(Object v: t.keySet()) 
	{
		System.out.println(v);
	}
	
	//reading values
	for(Object x:t.values()) 
	{
		System.out.println(x);
	}
	
	//reading entryset
	for(Object b: t.entrySet()) 
	{
		System.out.println(b);
	}

	}

}
