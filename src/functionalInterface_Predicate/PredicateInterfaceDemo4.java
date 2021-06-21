package functionalInterface_Predicate;

import java.util.function.*;
import java.util.*;

/**
 * @author abinash
 * Write a program to remove NULL values and empty Strings from the given list using Predicate
 */
public class PredicateInterfaceDemo4 {
	
	static String[] names = new String[] {
		"Durga",
		" ",
		"",
		null,
		"Ravi",
		"Shiva",
		null
	};
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		Predicate<String> p = name -> name!=null && name.length()!=0;
		removeNullAndEmptyElements(p, names);
		System.out.println("Resultant list after removal of NULL and empty string entries : \n" + list);
	}
	
	public static void removeNullAndEmptyElements(Predicate<String> p, String[] names) {
		
		for(String name: names) {
			if(p.test(name))
				list.add(name);
		}
		
	}

}
