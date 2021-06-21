package functionalInterface_Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author abinash
 * Write a program to check if the given LinkedList/ArrayList is empty or not.
 * This program gives a basic idea of how to use predicate to Collection utilities.
 */

public class PredicateInterfaceDemo2 {
	
	public static void main(String...strings) {
		
		List<String> list = new ArrayList<String>();
		
		Predicate<List<String>> predicate = ref -> ref.isEmpty();
		System.out.println("Is the ArrayList empty ? : " + predicate.test(list));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Abinash");
		list1.add("Abinash1");
		list1.add("Abinash2");
		Set<String> set = new HashSet<String>();
		Predicate<Collection> predicate2 = ref2 -> ref2.isEmpty();
		
		System.out.println("Is the ArrayList empty :- " + predicate2.test(list1));
		System.out.println("Is the HashSet empty :- " + predicate2.test(set));
		
	}
}
