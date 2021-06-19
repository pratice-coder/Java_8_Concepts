package defaultAndStaticMethods;

/**
 * @author abinash
 * Overriding concept is not applicable for static methods in inheritance
 */

interface Interf4 {
	public static void m1() {
		System.out.println("m1() implementation...");
	}
}

public class InterfaceStaticMethodsWrtOverridding1 implements Interf4 {
	// Non-static/instance method with same name as in interface. but it has no relation to Interface static method
	// as static methods in interface has no accessibility to child class.
	// So, no compilation error will be thrown and more over it will be always considered as a new function to child class only.
	/*
	 * But in a normal scenario of inheritance (class extends class), there we will get an compile time error.
	 */
	public void m1() {
		System.out.println("m1() implementation in child class..");
	}
	
	public static void main(String[] args) {
		
	}
}
