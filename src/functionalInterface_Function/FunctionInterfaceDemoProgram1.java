package functionalInterface_Function;

import java.util.function.*;
/**
 * @author abinash
 * Write a program to calculate square of a number using Function interface
 */
public class FunctionInterfaceDemoProgram1 {
	
	public static void main(String...strings) {
		
		Function<Integer,Integer> function = x -> x * x;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		
		System.out.println("Result after sqauring up the number : " + function.apply(number));
		
		scanner.close();
	}

}
