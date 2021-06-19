package defaultAndStaticMethods;

/**
 * @author abinash
 * Overriding concept is not applicable for static methods in interface
 */

interface Interf5 {
	
	public static void m1() {
		System.out.println("m1() imeplementation...");
	}
}

public class InterfaceStaticMethodsWrtOverridding2 implements Interf5 {
	// private method with same name as in interface. but it has no relation to Interface static method
	// as static methods in interface has no accessibility to child class.
	// So, no compilation error will be thrown and more over it will be always considered as a new function to child class only.
	/*
	 * But in a normal scenario of inheritance (class extends class), there we will get an compile time error.
	 */
	private static void m1() {
		System.out.println("m1() child class implementation...");
	}
	
	public static void main(String[] args) {
		
	}

}
