package functionalInterface;

/**
 * @author abinash
 * In a Functional Interface, it is possible to take any number of default and static methods.
 * There is no restriction in that.
 * But, only one abstract method is possible.
 * 
 * So, the following interface is an Functional Interface.
 */
public interface FunctionalInterfaceDemo {
	
	public void m1();
	
	default void m2() {
		
	}
	
	public static void m3() {
		
	}

}
