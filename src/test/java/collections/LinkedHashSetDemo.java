package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet lh= new LinkedHashSet();
		lh.add("sonali");
		lh.add(100);
		lh.add(null);
		lh.add(false);
		lh.add('d');
		lh.add("vivan");
		
		
		System.out.println(lh);
		
		//remove element
		lh.remove("sonali");
		System.out.println("after removing element:"+ lh);
		
		
		//check LinkedHashset is empty or not
		System.out.println(lh.isEmpty());
		
		//containts element is present or not
		System.out.println(lh.contains('d'));
		
		Iterator it= lh.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		
		
		
	
		
		

	}

}
