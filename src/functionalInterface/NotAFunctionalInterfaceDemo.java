package functionalInterface;

/**
 * @author abinash
 * In this case, the following interface contains more than one abstract method.
 * So, this is not a functional interface.
 */
public interface NotAFunctionalInterfaceDemo {
	
	public void m1();
	
	public void m2();
	
	public default void m3() {
		
	}
	
	public static void m4() {
		
	}
	

}
