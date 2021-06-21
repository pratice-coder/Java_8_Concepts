package functionalInterface_Predicate;

import java.util.function.Predicate;

/**
 * @author abinash
 * Write a program to check if length of a string is greater than 5 or not using Predicate
 * interface
 */

public class PredicateInterfaceDemo1 {
	
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = scanner.nextLine();
		
		Predicate<String> predicate = s -> s.length() > 5;
		if (predicate.test(input))
			System.out.println(input + " string length is greater than 5");
		else
			System.out.println(input + " string length is not greater than 5");
		
		scanner.close();
	}

}
