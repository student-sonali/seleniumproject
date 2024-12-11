package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm =new HashMap();
		hm.put(101,"John" );
		hm.put(102,"David" );
		hm.put(103,"smith" );
		hm.put(104,"Mary" );
		hm.put(105,"scott" );
		hm.put(106,"John" );
		
		System.out.println(hm);
		
		//retrive value of key then used get()
		System.out.println(hm.get(102));
		
		//remove pair/entryset from hashmap
		hm.remove(106);
		System.out.println(hm);
		
		System.out.println(hm.containsKey(105));// check key is present or not
		
		System.out.println(hm.containsValue("scott"));//check value is present or not
		
		System.out.println(hm.isEmpty());//check hashmap is empty or not
		
	System.out.println(hm.keySet());	//returns all the keys as set
	
	System.out.println(hm.values());//returns all the values as collection
	
	System.out.println(hm.entrySet());//returns all the entries as set[101=John, 102=David, 103=smith, 104=Mary, 105=scott]

	//read all the key set
	for(Object i:hm.entrySet()) 
	{
		System.out.println(i);
	}
	
	//read all the key only
	for (Object x:hm.keySet()) 
	{
		System.out.println(x);
	}
	
	// read all the values only
	for(Object d:hm.values()) 
	{
		System.out.println(d);
		
	}

	}

}
