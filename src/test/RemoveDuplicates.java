package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Object> al = new ArrayList<>();

		al.add('a');
		al.add('b');
		al.add('k');
		al.add('c');
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('b');

		System.out.println("Before Remove Duplicate elements:" + al);
		
	    Set<Object> hashset = new HashSet<>();
	    
	    /* Adding ArrayList elements to the HashSet
	     * in order to remove the duplicate elements and 
	     * to preserve the insertion order.
	     */
	    hashset.addAll(al);
	 
	    // Removing ArrayList elements
	    al.clear();
	 
	    // Adding LinkedHashSet elements to the ArrayList
	    al.addAll(hashset );
	 
	    System.out.println("After Removing duplicate elements:"+al);

		/*for (int i = 0; i < al.size(); i++) {

			for (int j = i + 1; j < al.size(); j++) {
				
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}

		}*/
		System.out.println("After Removing duplicate elements:" + al);

	}

}
