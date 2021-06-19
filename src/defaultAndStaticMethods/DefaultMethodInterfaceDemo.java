package defaultAndStaticMethods;

/**
 * @author abinash
 */

 interface Interf {
	
	default void m1() { // Its a concrete method
		System.out.println("Default method..");
	}

}

class DefaultMethodInterfaceDemo  implements Interf {
	
	@Override
	public void m1() {
		System.out.println("Overriden default m1() ..");
	}
	
	public static void main(String...strings) {
		DefaultMethodInterfaceDemo t = new DefaultMethodInterfaceDemo();
		t.m1();  // If we will provide the overridden functionality to m1() default method, then 
		              // it will invoke the overridden method.
		             //  If the function m1() default has not been overridden then, it will directly call the m1() present inside
		             //  Interf interface
		
	}
}
