package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs =new HashSet();
		hs.add(45);
		hs.add("vivan");
		hs.add('s');
		hs.add(null);
		hs.add(true);
		
		//print element
		System.out.println(hs);
		
		//remove element
		hs.remove(null);
		System.out.println("after removing:"+ hs);
		
		//check hashset is empty or not
		System.out.println(hs.isEmpty());
		
		//contains element is present or not
	System.out.println(	hs.contains(null));
	
	//reading elements from hashset
	//using enhanced loop
	/*for(Object x:hs) 
	{
		System.out.println(x);
	}*/
	
	//using iterater
	Iterator it= hs.iterator();
	while(it.hasNext()) 
	{
		System.out.println(it.next());
	}
	
	
	}

}
