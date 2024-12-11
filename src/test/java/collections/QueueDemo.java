package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	       PriorityQueue q= new PriorityQueue();
	       q.add("a");
	       q.add("b");
	       q.offer("c");
	       q.offer("b");
	       
	       
	       System.out.println(q);
	       
	       //retrive head element
	   //  System.out.println(  q.element()); //if queue is empty returns NosuchElementException
	   // System.out.println(q.peek()); //if queue is empty returns null
	    
	    //return and remove element from queue
	   // System.out.println(q.remove());//if queue empty returns exception NosuchElementException
	    //System.out.println(q);
	    
	    //System.out.println(q.poll());// if queue empty returns null
	    //System.out.println(q);
	    
	    //reading element from queue
	    /*Iterator it= q.iterator();
	    while(it.hasNext()) 
	    {
	    	System.out.println(it.next());
	    }*/
	    
	    //using enhanced loop
	    for(Object x:q) 
	    {
	    	System.out.println(x);
	    }
	}

}
