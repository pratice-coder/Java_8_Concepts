package functionalInterface;

/**
 * @author abinash
 * In the child interface, we can define exactly same parent interface abstract method
 * 
 * So, this code compiles fine.
 */
@FunctionalInterface
public interface FuncInterfaceDemoWrtInheritance1 {
	
	public void m1();
	
}

@FunctionalInterface
interface ChildInterface1 extends FuncInterfaceDemoWrtInheritance1 {
	
	public void m1();
	
}
