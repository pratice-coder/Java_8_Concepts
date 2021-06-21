package functionalInterface_Predicate;

import java.util.function.*;

/**
 * @author abinash
 * Write a program to display names starts with 'K' by using Predicate
 */
public class PredicateInterfaceDemo3 {
	
	static String[] array= new String[] {
		"Sunny",
		"Kajal",
		"Malika",
		"Katrina",
		"Kareena"
	};
	
	public static void main(String...strings) {
		Predicate<String> p = item -> item.startsWith("K");
		checkNamesStartsWithK(p, array);
	}
	

	public static void checkNamesStartsWithK(Predicate<String> predicate, String[] array) {
		 for(String item : array) {
			 if(predicate.test(item))
				 System.out.println(item);
		 }
	}

}
