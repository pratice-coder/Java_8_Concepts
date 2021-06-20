package functionalInterface_Predicate;

import java.util.function.Predicate;

/**
 * @author abinash
 * Following program is to check whether the input number is greater/lesser than 100 using
 * Predicate Interface
 */

public class PredicateInterfaceDemo {
	
	static int x = 100;
	
	public static void main(String...strings) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int inputNum = scanner.nextInt();
		scanner.close();
		
		Predicate<Integer> predicate = i -> i>=x;
		System.out.println(predicate.test(inputNum));
	}

}
