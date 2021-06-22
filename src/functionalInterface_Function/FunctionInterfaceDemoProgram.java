package functionalInterface_Function;

import java.util.function.*;
/**
 * @author abinash
 * Write a program to find the length of a String using Function interface
 */
public class FunctionInterfaceDemoProgram {
	
	public static void main(String...strings) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the input String :  ");
		String input = scanner.nextLine();
		
		Function<String,Integer> f = s -> s.length();
		
		System.out.println(f.apply(input));
		
		scanner.close();
	}

}
