package defaultAndStaticMethods;

/**
 * @author abinash
 */

interface Interf3 {
	public static void m1() {
		System.out.println("m1() static method.....");
	}
}

public class InterfaceStaticMethodsWrtOverridding implements Interf3 {
	// Exact same method as in interface. but it has no relation to Interface static method
	// as static methods in interface has no accessibility to child class.
	// So, no compilation error will be thrown and more over it will be always considered as a new function to child class only.
	public static void m1() {
		System.out.println("m1() static method in child class");
	}
	
	public static void main(String[] args) {
		
	}
}
