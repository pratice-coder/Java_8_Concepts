package functionalInterface;

/**
 * @author abinash
 * Following interface is an Functional interface as it is defined with
 * @FunctionalInterface annotation.
 */
@FunctionalInterface
public interface FunctionalInterfaceDemoWithAnnotation {
	
	public void m1();
	
	public default void m2() {
		
	}
	
	public static void m3() {
		
	}
}
