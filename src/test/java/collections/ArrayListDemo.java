package collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList list =new ArrayList();
		list.add(23);
		list.add("sonali");
		list.add(10.0);
		list.add('b');
		list.add(true);
		list.add(23);
		list.add(null);
		
		// size of arraylist
	System.out.println("size of arraylist:"+list.size());
	
	//printing arraylist
	System.out.println(list);
	
	//remove object
	list.remove(0);
	System.out.println("After removing arrayist:"+list);
	
	//insert element in between arraylist
	list.add(0, 45);
	System.out.println("After Adding arrayist:"+list);
	
	//change/modify/replace element in arraylist
	list.set(0, "vivan");
	System.out.println("After replacing arrayist:"+list);
	
	// access spcific element from arraylist
	System.out.println(list.get(4));
	
	//Reading all the element from the ArrayList
	//1st approach using normal for loop
	/*for(int i=0; i<list.size();i++) 
	{
		System.out.println(list.get(i));
	}*/
	
	//using enhanced loop
	
	/*for(Object x:list) 
	{
		System.out.println(x);
	}*/
	
	//By using iterater
  Iterator	it=list.iterator();
	
	while(it.hasNext()) //hasnext method check element is present or not
	{
	System.out.println(it.next());	 // next method getting value from array list
		
	}
	
	//To check ArrayList is empty or not
	System.out.println(list.isEmpty());
	
	//Remove all elements from arrayList
	ArrayList list1= new ArrayList();
	list1.addAll(list);
	System.out.println(list1);
	
	//clear all the elements from the ArrayList
	list1.clear();
	System.out.println(list1);
	
	
	
	
	
		
		
	

	}

}
