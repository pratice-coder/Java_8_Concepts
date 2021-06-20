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
		
		Predicate<Integer> predicate = length -> length > 5;
		System.out.println(predicate.test(input.length()));
		scanner.close();
	}

}
