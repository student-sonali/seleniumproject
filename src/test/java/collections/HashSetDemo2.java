package collections;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args)
	{
		//performing union,intersection,difference
		HashSet<Integer> hs1 =new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
        hs1.add(5);
        
        System.out.println(hs1);
        
        HashSet<Integer> hs2=new HashSet<Integer>();
        
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);
        System.out.println(hs2);
        
        //union
       // hs1.addAll(hs2);
       // System.out.println(hs1);
        
        //intersection
        //hs1.retainAll(hs2);
        //System.out.println(hs1);
        
        //difference
        hs1.removeAll(hs2);
        System.out.println(hs1);

	}

}
