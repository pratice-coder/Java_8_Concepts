package functionalInterface_Predicate;

import java.util.function.*;
/**
 * @author abinash
 * Following program demonstrates the usage of different built-in default functions mentoined as below.
 *      1. negate() -> NOT in 
 *      2. and() -> Logical AND operation
 *      3. or()  -> Logical OR operation
 */
public class PredicateJoiningExample {
	
	static int[] arr = {0, 5, 10, 15, 20, 25, 30};
	
	public static void main(String[] args) {
		
		// Write the lambda expression
		Predicate<Integer> p = item -> item >10;
		Predicate<Integer> p1 = item -> item %2 == 0;
		
		System.out.println("Numbers that are greater than 10 : ");
		checkpredicateOps(p, arr);
		
		System.out.println("Numbers that are considered as even : ");
		checkpredicateOps(p1, arr);
		
		System.out.println("The numbers that are NOT greater than 10 : ");
		checkpredicateOps(p.negate(), arr);
		
		System.out.println("The numbers that are NOT even :");
		checkpredicateOps(p1.negate(), arr);
		
		System.out.println("The numbers that are greater than 10 AND also even in nature :");
		checkpredicateOps(p.and(p1), arr);
		
		System.out.println("The numbers that are greater than 10 OR also even in nature :");
		checkpredicateOps(p.or(p1), arr);
		
	}
	
	/**
	 * @param p     Predicate<Integer> reference
	 * @param arr  input Integer array
	 */
	public static void checkpredicateOps(Predicate<Integer> p, int[] arr) {
		for(int item : arr) {
			if(p.test(item))
				System.out.println(item);
		}
	}

}
