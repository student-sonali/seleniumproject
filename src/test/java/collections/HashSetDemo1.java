package collections;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<Integer>();
		
		//addAll elements
		hs1.addAll(hs);
		hs1.add(10);
		System.out.println(hs1);
		
		//remove all elements
		hs1.removeAll(hs);
		System.out.println(hs1);
		
	}

}
