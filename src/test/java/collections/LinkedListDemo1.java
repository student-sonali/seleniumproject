package collections;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("Sonali");
		l.add("Sonali");
		l.add("myra");
		l.add("vivan");

		
		//add first element``
		l.addFirst("akash");
		System.out.println(l);
		
		//add last element 
		l.addLast("madhavi");
		System.out.println(l);
		
		//retrive 1st element 
		System.out.println(l.getFirst());
		
		//retrive last element
		System.out.println(l.getLast());
		
		//remove 1st element
		l.removeFirst();
		System.out.println(l);
		
		//remove last element
		l.removeLast();
		System.out.println(l);

	}

}
