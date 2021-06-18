package functionalInterface;

/**
 * @author abinash
 *  As shown below, the interface is defined explicitly as Functional Interface 
 *  but we have defined 2 abstract methods in them.
 *  So, this will give compile time error.
 *  
 *  CE : unexpected @FunctionalInterface annotation
 *  multiple non-overriding abstract methods present in interface FunctionalInterfaceDemoWithAnnotation1
 */
@FunctionalInterface
public interface FunctionalInterfaceDemoWithAnnotation1 {
	
	public void m1();
	public void m2();
}
