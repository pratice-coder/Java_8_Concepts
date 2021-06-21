package functionalInterface_Predicate;

import java.util.function.Predicate;

/**
 * @author abinash
 * This program demonstrates the usage of isEqual() method of Predicate interface.
 */
public class PredicateIsEqualMethodExample {
	
	public static void main(String...strings) {
		Predicate<String> p = Predicate.isEqual("DurgaSoft");
		
		System.out.println(p.test("DurgaSoft"));
		System.out.println(p.test("Malika"));
	}
}
