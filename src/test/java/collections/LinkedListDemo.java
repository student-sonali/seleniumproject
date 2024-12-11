package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	       LinkedList l =new LinkedList();
	       //add element in Linkedlist
	       l.add(44);
	       l.add("sonali");
	       l.add(10.0);
	       l.add('a');
	       l.add(true);
	       l.add(null);
	       
	       //print all the element
	       System.out.println(l);

	       //size of the likedList
	      System.out.println(l.size()); 
	      
	      // remove the element from the LikedList
	      l.remove(2);
	      System.out.println("After removing :"+ l);
	      
	      // insert the element middle of Likedlist
	      l.add(3, 44);
	      System.out.println("After inserting element:"+ l);
	      
	     //Retrive element from LikedList
	    System.out.println( l.get(5));
	    
	    //Change/replace element from LinkedList
	    l.set(4, "vivan");
	    System.out.println("after replacing element:"+ l);
	    
	    //contains() element is present or not
	    System.out.println(l.contains("sonali"));
	    
	    // To check likedList is empty or not
	    System.out.println(l.isEmpty());
	    
	    //Reading elements
	    //1st using normal loop
	   /* for(int i=0;i<l.size();i++) 
	    {
	    	System.out.println(l.get(i));
	    }*/
	    
	    //2nd using enhanced loop
	  /*  for(Object a:l) 
	    {
	    	System.out.println(a);
	    }*/
	    
	    //3rd using iterater
	Iterator  it=  l.iterator();
	    while(it.hasNext()) 
	    {
	    	System.out.println(it.next());
	    }
	    
	    
	    //sorting elements
	    System.out.println("Before Sorting:"+l);
	   Collections.sort(l); 
	   System.out.println("After sorting LikedList:"+ l);
	   
	   
	   
	    
	}

}
