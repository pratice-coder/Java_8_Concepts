package functionalInterface_Function;

import java.util.function.*;
/**
 * @author abinash
 * Write a demo program to remove spaces present in the given String by using Function
 */
public class FunctionInterfaceDemoprogram2 {
	
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println("Resultant string after spaces removal : " +  removeAllSpacesInString(input));
		scanner.close();
	}
	
	public static String removeAllSpacesInString(String input) {
		Function<String,String> function = line -> {
			String result="";
			String[] lineArr = line.split("\\s+");
			for(String item : lineArr) {
				result +=item;
			}
			return result;
		};
		return function.apply(input);
	}

}
